package com.cliporganizer.Service;

import com.cliporganizer.Repository.AuthorityRepository;
import com.cliporganizer.model.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorityService {
    @Autowired
    AuthorityRepository authorityRepository;

    public List<Authority> findAll(){
        List<Authority> authorities = new ArrayList();
        authorityRepository.findAll().forEach(authorities::add);
        return authorities;
    }

    public boolean save(Authority authority) {
        List<Authority> authorities = findAll();

        for (Authority a:authorities) {
            if(a.getAuthority().equalsIgnoreCase(authority.getAuthority())){
                return false;
            }
        }
        authorityRepository.save(authority);
        return true;
    }

}
