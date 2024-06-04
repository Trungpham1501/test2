package service.Ipml;


import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getUsers(){

        return userRepository.getUser();
    }

    public void addUser(User user) {
        if (user != null) {
            userRepository.save(user);
        }
    }


    @Override
    public User updateInforUser(int id, User user){
        User userFind = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User không tồn tại"));
        userFind.setUserName(user.getUserName());
        userFind.setEmail(user.getEmail());
        return userRepository.save(userFind);
    }

    @Override
    public void deleteById(int userid){
        boolean exists = userRepository.existsById(userid);
        if(!exists){
            throw new IllegalStateException("user with id"+ userid + "does not exists");
        }
        userRepository.deleteById(userid);
    }

    public void findUsersByUserName(String userName){
        userRepository.findUsersByUserName(userName);
    }

    public void findUsersBycodingLanguage(String codingLanguage){
        userRepository.findUsersBycodingLanguage(codingLanguage);
    }

    public void findByemail(String email){
        userRepository.findByemail(email);
    }
}
