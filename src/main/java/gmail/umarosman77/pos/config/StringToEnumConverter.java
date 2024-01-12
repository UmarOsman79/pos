package gmail.umarosman77.pos.config;

import gmail.umarosman77.pos.pojo.User;
import org.springframework.core.convert.converter.Converter;


public class StringToEnumConverter implements Converter<String, User.Role> {

	//TODO Umar - Figure out how to get converter working
	@Override
	public User.Role convert(String source) {
//		System.out.println(source);
//		System.out.println(User.Role.getRole(source));
//		return User.Role.getRole(source);
		return null;
	}
}
