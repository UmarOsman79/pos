package gmail.umarosman77.pos.controller;

import gmail.umarosman77.pos.pojo.LoginRequest;
import gmail.umarosman77.pos.pojo.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/login", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface LoginController {

	@PostMapping
	@ResponseBody ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest);
}
