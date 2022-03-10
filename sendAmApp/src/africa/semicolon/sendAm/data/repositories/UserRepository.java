package africa.semicolon.sendAm.data.repositories;

import africa.semicolon.sendAm.data.models.User;

import java.util.List;

public interface UserRepository {
    User create(User owner);

    User save(User newUser, String s);
    User findByEmail(String email);
    List<User> findAll();
    void delete(User user);
    void delete(String email);

    int count();

    User save(User xUser);

    Object findById(String s);
}
