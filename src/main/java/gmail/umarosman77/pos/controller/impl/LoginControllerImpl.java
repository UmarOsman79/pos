package gmail.umarosman77.pos.controller.impl;

import gmail.umarosman77.pos.controller.LoginController;
import gmail.umarosman77.pos.pojo.LoginRequest;
import gmail.umarosman77.pos.pojo.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControllerImpl implements LoginController {

	@Override
	public ResponseEntity<LoginResponse> login(LoginRequest loginRequest) {
		return new ResponseEntity<>(new LoginResponse("Success"), HttpStatus.ACCEPTED);
	}
}
