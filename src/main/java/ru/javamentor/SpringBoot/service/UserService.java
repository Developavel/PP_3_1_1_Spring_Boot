package ru.javamentor.SpringBoot.service;

import ru.javamentor.SpringBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    User show(int id);

    void save(User user);

    void update(User updateUser);

    void delete(int id);
}
