package com.genpact.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genpact.model.Role;
import com.genpact.model.User;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	/*List<Role> findRoles();*/
}
