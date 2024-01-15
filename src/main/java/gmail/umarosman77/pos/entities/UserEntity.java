package gmail.umarosman77.pos.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

@Entity
@Table(name = "user")
@Data
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name = "user_seq", allocationSize = 1)
	private Long id;

	@Basic
	private String role;

	@Transient
	private Role roleEnum;

	@Column(name = "name")
	private String name;
	private String surname;
	private LocalDate joinDate;
	private boolean status;
	//TODO Umar Uncomment when ready to work on contactDetails
//	private ContactDetails contactDetails;

	@PostLoad
	void fillTransient() {
		if (StringUtils.isNotBlank(role)) {
			this.roleEnum = Role.getRole(role);
		}
	}

	@PrePersist
	void fillPersistent() {
		if (roleEnum != null) {
			this.role = roleEnum.getValue();
		}
	}

	@Getter
	public enum Role {

		NORMAL_USER("Normal user"),
		ADMIN("Admin"),
		SUPERVISOR("Supervisor");

		private final String value;

		Role(String value) {
			this.value = value;
		}

		public static UserEntity.Role getRole(String value) {
			for (UserEntity.Role role : UserEntity.Role.values()) {
				if (role.getValue().equals(value)) {
					return role;
				}
			}
			throw new IllegalArgumentException("Invalid role value: " + value);
		}
	}
}
