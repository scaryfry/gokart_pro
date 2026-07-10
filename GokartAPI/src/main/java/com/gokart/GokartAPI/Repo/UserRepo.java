package com.gokart.GokartAPI.Repo;

import com.gokart.GokartAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
