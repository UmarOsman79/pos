package gmail.umarosman77.pos.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContactDetails {
	private ContactType type;
	private String value;

	@Getter
	enum ContactType {

		EMAIL("Email"),
		CELL("Cell"),
		HOME("Home");

		private final String value;

		ContactType(String value) {
			this.value = value;
		}

		public static ContactType getContactType(String value) {
			for (ContactType contactType : ContactType.values()) {
				if (contactType.getValue().equals(value)) {
					return contactType;
				}
			}
			throw new IllegalArgumentException("Invalid contact value: " + value);
		}
	}
}
