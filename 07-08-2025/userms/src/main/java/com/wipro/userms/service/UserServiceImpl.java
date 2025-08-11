package com.wipro.userms.service;

import com.wipro.userms.model.User;
import com.wipro.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateUser1(int id, User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createUser1(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createUser11(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteUser1(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateUser(int id, User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}
}
