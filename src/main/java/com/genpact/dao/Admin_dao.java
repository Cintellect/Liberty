package com.genpact.dao;

import java.util.List;

import com.genpact.model.User;

public interface Admin_dao {

	public User addUserByAdmin(User user);

	public List<User> searchUser(String emailId);

}

