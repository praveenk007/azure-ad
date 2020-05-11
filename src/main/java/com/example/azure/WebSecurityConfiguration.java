package com.example.azure;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * <p>
 *		This class holds spring security configuration
 * </p>
 *
 * @author praveenkamath
 * created on 09/03/20
 * @since 1.0.0
 */
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class WebSecurityConfiguration {

	@Bean
	public SecurityWebFilterChain securityWebFilterChain(final ServerHttpSecurity http) {
		/*http.cors().disable()
				.csrf().disable()
				.authenticationManager(authenticationManager())
				.authorizeExchange()
				.pathMatchers("/api/auth/sec/**").authenticated()
				.anyExchange().permitAll()
				.and()
				.exceptionHandling()
				.and().httpBasic()
				.and()
				.authorizeExchange()
				.pathMatchers("/login").permitAll()
				.anyExchange().authenticated()
				.and()
				.oauth2Client();
				return http.build();*/

		http//.cors().disable()
				/*.authorizeExchange()
				.pathMatchers("/api/auth/sec/**").authenticated()
				.and()
				.exceptionHandling()
				.and()*/
				.authorizeExchange()
				.pathMatchers("/login**").permitAll()
				.anyExchange().authenticated()
				.and()
				.oauth2Login();
		return http.build();
	}
}
