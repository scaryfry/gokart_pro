package com.gokart.GokartAPI.Contoller;

import com.gokart.GokartAPI.Models.Kart;
import com.gokart.GokartAPI.Models.User;
import com.gokart.GokartAPI.Repo.KartRepo;
import com.gokart.GokartAPI.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private KartRepo kartRepo;
    //Schedule
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
        if(userRepo.findById(id).isPresent()){
            User searchedUser = userRepo.findById(id).get();
            searchedUser.setFullName(user.getFullName());
            userRepo.save(searchedUser);
            return "successful update";
        }
        return "failed to update";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id){
        if(userRepo.findById(id).isPresent()){
            User searchedUser = userRepo.findById(id).get();
            userRepo.delete(searchedUser);
            return "Deleted...";
        }
        return "failed to delete";
    }
    //Kart endpoints
    @GetMapping("/karts")
    public List<Kart> getKarts() {return kartRepo.findAll();}
    @GetMapping("/karts/{id}")
    public Kart getKartById(@PathVariable long id){
        if(kartRepo.findById(id).isPresent()) {
            return kartRepo.findById(id).get();
        }
        return null;
    }
    @PutMapping("/updateKart/{id}")
    public String updateKart(@RequestBody Kart kart, @PathVariable long id){
        if(kartRepo.findById(id).isPresent()){
            Kart searchedKart = kartRepo.findById(id).get();
            searchedKart.setKartNumber(kart.getKartNumber());
            kartRepo.save(searchedKart);
            return "successful update";
        }
        return "failed to update";
    }
    @DeleteMapping("/deleteKart/{id}")
    public String deleteKart(@PathVariable long id){
        if(kartRepo.findById(id).isPresent()){
            Kart searchedKart = kartRepo.findById(id).get();
            kartRepo.delete(searchedKart);
            return "Deleted...";
        }
        return "failed to delete";
    }
    @PostMapping("/saveKart")
    public String saveKart(@RequestBody Kart kart){
        kartRepo.save(kart);
        return "Saved...";
    }
}
