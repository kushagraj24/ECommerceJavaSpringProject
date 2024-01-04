package com.ECommerce.javaProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerce.javaProject.dao.userDao;
import com.ECommerce.javaProject.models.*;

/**
 * @author kushagra
 */
@Service
public class userService {
  @Autowired
  private userDao userDao;

  public List<User> getUsers() {
    return this.userDao.getAllUser();
  }

  public User addUser(User user) {
    return this.userDao.saveUser(user);
  }

  public User checkLogin(String username, String password) {
    return this.userDao.getUser(username, password);
  }

  public boolean checkUserExists(String username) {
    return this.userDao.userExists(username);
  }
}
