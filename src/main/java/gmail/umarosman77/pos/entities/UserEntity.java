package gmail.umarosman77.pos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
}
