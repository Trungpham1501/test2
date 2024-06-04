package service;



import entity.User;
import java.util.List;

public interface IUserService {
    // xóa user theo id
    public void deleteById(int userid);

    // lay ra danh sach user
    public List<User> getUsers();

    // sua thong tin user
    public User updateInforUser(int centerid, User user);

    // them user
    public void addUser(User user);


}