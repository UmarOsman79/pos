package gmail.umarosman77.pos.controller;

import gmail.umarosman77.pos.pojo.User;
import gmail.umarosman77.pos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/user", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface UserController {

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	ResponseEntity<User> add(@RequestBody User user);
}
