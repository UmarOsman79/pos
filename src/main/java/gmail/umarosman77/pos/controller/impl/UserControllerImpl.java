package gmail.umarosman77.pos.controller.impl;

import gmail.umarosman77.pos.controller.UserController;
import gmail.umarosman77.pos.pojo.User;
import gmail.umarosman77.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

	@Autowired
	UserService userService;

	@Override
	public ResponseEntity<User> add(User user) {
		return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<User> get(Long id) {
		return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
	}
}
