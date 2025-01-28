package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();
    void save(User user);
    void delete(int id);
    void update(int id, User updatedUser);
    User userById(int id);
}
