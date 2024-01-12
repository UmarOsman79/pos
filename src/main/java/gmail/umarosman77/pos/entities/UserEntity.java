package gmail.umarosman77.pos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class UserEntity {

	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
}
