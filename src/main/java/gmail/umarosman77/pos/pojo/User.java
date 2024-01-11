package gmail.umarosman77.pos.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int id;
	private Role role;
	private String name;
	private String surname;
	private LocalDate joinDate;
	private ContactDetails contactDetails;
	private boolean status;

	@Getter
	enum Role {

		NORMAL_USER("Normal user"),
		ADMIN("Admin"),
		SUPERVISOR("Supervisor");

		private final String value;

		Role(String value) {
			this.value = value;
		}

		public static Role getRole(String value) {
			for (Role role : Role.values()) {
				if (role.getValue().equals(value)) {
					return role;
				}
			}
			throw new IllegalArgumentException("Invalid color value: " + value);
		}
	}
}
