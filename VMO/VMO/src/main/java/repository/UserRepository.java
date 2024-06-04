package repository;


import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import service.Ipml.UserService;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(nativeQuery = true,
    value = "SELECT * FROM users ")
    List<User> getUser();


    void deleteById(int userid);
    User findByemail(String email);

    User findUsersByUserName(String userName);

    User findUsersBycodingLanguage(String codingLanguage);
}
