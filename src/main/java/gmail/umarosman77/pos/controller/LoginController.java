package gmail.umarosman77.pos.controller;

import gmail.umarosman77.pos.pojo.LoginRequest;
import gmail.umarosman77.pos.pojo.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController("login")
public interface LoginController {

	@PostMapping
	@ResponseBody
	LoginResponse login(@RequestBody LoginRequest loginRequest);
}
