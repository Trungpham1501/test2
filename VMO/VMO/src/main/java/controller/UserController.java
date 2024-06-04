package controller;


import entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.IUserService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v2/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService userService;

    @GetMapping("/list")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){

        userService.addUser(user);
    }

    @DeleteMapping(path =" {userid}")
    public void deleteById(@PathVariable("userid") int userid){

        userService.deleteById(userid);
    }

    public User updateInforUser(@RequestParam("id") int id, @RequestBody User user){
        return userService.updateInforUser(id,user);
    }

}
