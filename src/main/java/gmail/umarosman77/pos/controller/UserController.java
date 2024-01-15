package gmail.umarosman77.pos.controller;

import gmail.umarosman77.pos.pojo.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/user", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface UserController {

	@PostMapping
	ResponseEntity<User> add(@RequestBody User user);

	@GetMapping
	ResponseEntity<User> get(@RequestParam(value = "id") Long id);

	@PutMapping(path = "/disable")
	ResponseEntity<User> disableUser(@RequestParam(value = "id") Long id);
}
