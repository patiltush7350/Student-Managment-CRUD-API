package com.jspider.studentMangment.Service;

import java.util.List;


import com.jspider.studentMangment.Model.User;

public interface UserService {
    
    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long id);
}

