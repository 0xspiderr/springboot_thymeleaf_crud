package com.project.springboot_thymeleaf_crud.Securitate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig
{
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http.authorizeHttpRequests(auth -> auth
                        .requestMatchers("/masini").hasAnyAuthority("ROLE_USER","ROLE_EDITOR")
                        .requestMatchers("/masini/adauga/**", "/masini/edit/**", "/masini/sterge/**")
                        .hasAuthority("ROLE_EDITOR")
                        .anyRequest()
                        .authenticated()
        )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/masini", true)
                        .failureUrl("/login?error")
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/login?logout")
                        .permitAll()
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
