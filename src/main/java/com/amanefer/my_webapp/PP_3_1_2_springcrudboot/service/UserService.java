package com.amanefer.my_webapp.PP_3_1_2_springcrudboot.service;


import com.amanefer.my_webapp.PP_3_1_2_springcrudboot.models.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public User getUser(int id);

    public void saveUser(User user);

    public void updateUser(int id, User user);

    public void deleteUser(int id);
}
