package gmail.umarosman77.pos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {

	//TODO Umar - Figure out how to get converter working
	@Override
	public void addFormatters(FormatterRegistry registry) {
//		System.out.println("Adding converter");
//		registry.addConverter(new StringToEnumConverter());
	}
}
