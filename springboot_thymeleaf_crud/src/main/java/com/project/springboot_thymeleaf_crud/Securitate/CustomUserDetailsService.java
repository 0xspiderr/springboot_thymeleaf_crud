package com.project.springboot_thymeleaf_crud.Securitate;

import com.project.springboot_thymeleaf_crud.Utilizator.Utilizator;
import com.project.springboot_thymeleaf_crud.Utilizator.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    private UtilizatorRepository utilizatorRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilizator user = utilizatorRepository.findByUtilizator(username)
                .orElseThrow(() -> new UsernameNotFoundException("Utilizatorul " + username + " nu a fost gasit!"));
        return new User(
                user.getUtilizator(),
                user.getParola(),
                Collections.singletonList(new SimpleGrantedAuthority(user.getRol()))
        );
    }
}
