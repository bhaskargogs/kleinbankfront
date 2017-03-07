package com.bank.app.userfront.service.impl;

import com.bank.app.userfront.dao.UserDao;
import com.bank.app.userfront.domain.User;
import com.bank.app.userfront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Bhaskar on 3/7/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        if (checkUsernameExists(username) || checkEmailExists(email)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkUsernameExists(String username) {
        if (null != findByUsername(username)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        if (null != findByEmail(email)) {
            return true;
        }
        return false;
    }
}
