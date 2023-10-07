package springboot.pp_3_1_31.dao;



import springboot.pp_3_1_31.entity.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUser(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(Long id, User updatedUser);
}
