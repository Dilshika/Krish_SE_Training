package com.dil.cafecloud.authorizationserver.service;

import com.dil.cafecloud.authorizationserver.model.AuthUserDetail;
import com.dil.cafecloud.authorizationserver.model.User;
import com.dil.cafecloud.authorizationserver.repository.UserDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("usersDetailService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailRepository userDetailRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> user=userDetailRepository.findByUsername(name);
        user.orElseThrow(()->new UsernameNotFoundException("user name or password wrong"));

        UserDetails userDetails = new AuthUserDetail(user.get());
        new AccountStatusUserDetailsChecker().check(userDetails);   //check status
        return userDetails;

    }
}
