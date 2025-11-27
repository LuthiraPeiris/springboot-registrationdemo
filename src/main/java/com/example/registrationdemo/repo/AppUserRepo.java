package com.example.registrationdemo.repo;

import com.example.registrationdemo.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Integer> {

    public AppUser findByEmail(String email);
}
