package ru.javamentor.SpringBoot.dao;

import ru.javamentor.SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();

    User show(int id);

    void save(User user);

    void update(User updateUser);

    void delete(int id);
}
