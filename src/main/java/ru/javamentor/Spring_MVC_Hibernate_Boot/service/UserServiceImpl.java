package ru.javamentor.Spring_MVC_Hibernate_Boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.Spring_MVC_Hibernate_Boot.dao.UserDao;
import ru.javamentor.Spring_MVC_Hibernate_Boot.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void add(User user){
        userDao.add(user);
    }

    //@Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    //@Transactional
    @Override
    public User getUser(Long id){
        return userDao.getUser(id);
    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
}
