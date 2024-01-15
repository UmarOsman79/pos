package gmail.umarosman77.pos.service;

import gmail.umarosman77.pos.pojo.User;

public interface UserService {

	User addUser(User user);

	User getUser(Long id);

	User disableUser(Long id);
}
