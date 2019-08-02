package org.robatipoor.polls.securetiy;

import javax.transaction.Transactional;

import org.robatipoor.polls.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * CustomUserDetailsService
 */
public class CustomUserDetailsService implements UserDetailsService {

  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return userRepository.findByUsername(username).map((u) -> UserPrincipal.create(u))
        .orElseThrow(() -> new RuntimeException());
  }

  @Transactional
  public UserDetails loadUserById(Long id) throws UsernameNotFoundException {
    return userRepository.findById(id).map((u) -> UserPrincipal.create(u)).orElseThrow(() -> new RuntimeException());
  }
  
}