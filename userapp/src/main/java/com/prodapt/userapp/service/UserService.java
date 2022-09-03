package com.prodapt.userapp.service;

import java.util.List;

import com.prodapt.userapp.entity.User;
import com.prodapt.userapp.exception.InvalidCredentialsException;

public interface UserService {
	// Create
	public User addUser(User user);

	// Retrieve
	public User getUserByName(String userName);

	// Update
	public User updateUser(User user);

	// Delete
	public void deleteUserById(Long id);// Login

	//login
	public User loginUser(User user) throws InvalidCredentialsException;
	
	//retrieve
	public List<User> getList();

}
