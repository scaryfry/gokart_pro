package com.gokart.GokartAPI.Contoller;

import com.gokart.GokartAPI.Models.User;
import com.gokart.GokartAPI.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

@RestController
public class ApiControllers {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/")
    public String getSchedule(){
        return "welcome";
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }
    @PostMapping("/save")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved...";
    }
    @PutMapping("/update/{id}")
    public String updateUser(@RequestBody User user, @PathVariable long id){
       User searchedUser = userRepo.findById(id).get();
       searchedUser.setFullName(user.getFullName());
       userRepo.save(searchedUser);
       return "successful update";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        User searchedUser = userRepo.findById(id).get();
        userRepo.delete(searchedUser);
        return "Deleted...";
    }
}
