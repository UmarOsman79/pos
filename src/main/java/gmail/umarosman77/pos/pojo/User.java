package gmail.umarosman77.pos.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Long id;
	private Role role;
	private String name;
	private String surname;
	@JsonProperty(value = "join_date")
	private LocalDate joinDate;
	@JsonProperty(value = "contact_details")
	private ContactDetails contactDetails;
	private boolean status;

	@Getter
	public enum Role {

		@JsonProperty("normal_user")
		NORMAL_USER("Normal user"),
		@JsonProperty("admin")
		ADMIN("Admin"),
		@JsonProperty("supervisor")
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
