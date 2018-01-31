//package jupiterpa.infrastructure.mock;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//
//import jupiterpa.infrastructure.config.BaseSecurityConfig;
//
//@Configuration
//@EnableWebSecurity
//@Profile("SDK-Test")
//public class SDKTestSecurityConfig extends BaseSecurityConfig {
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		super.configure(http);
//		http.authorizeRequests()
//			.antMatchers(HttpMethod.GET, SDKTestController.PATH+"/**").hasAnyRole("USER","ADMIN")
//			.antMatchers(HttpMethod.PUT, SDKTestController.PATH+"/update").hasRole("ADMIN")
//			.anyRequest().permitAll();
//	}
//}