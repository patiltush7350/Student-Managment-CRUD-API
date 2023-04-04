package com.jspider.studentMangment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.studentMangment.Model.User;
import com.jspider.studentMangment.Repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    
	 @Autowired
	    private UserRepository userRepository;

	    @Override
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }

	    @Override
	    public User getUserById(Long id) {
	        Optional<User> optionalUser = userRepository.findById(id);
	        return optionalUser.orElse(null);
	    }

	    @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public User updateUser(User user) {
	        Optional<User> optionalUser = userRepository.findById(user.getId());
	        if (optionalUser.isPresent()) {
	            User existingUser = optionalUser.get();
	            existingUser.setFirstName(user.getFirstName());
	            existingUser.setLastName(user.getLastName());
	            existingUser.setEmail(user.getEmail());
	            
	            return userRepository.save(existingUser);
	        } else {
	            return null;
	        }
	    }

	    @Override
	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}
