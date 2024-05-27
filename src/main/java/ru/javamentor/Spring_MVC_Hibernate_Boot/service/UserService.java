package ru.javamentor.Spring_MVC_Hibernate_Boot.service;



import ru.javamentor.Spring_MVC_Hibernate_Boot.model.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> getAllUsers();

    User getUser(Long id);

    void deleteUser(Long id);

}
