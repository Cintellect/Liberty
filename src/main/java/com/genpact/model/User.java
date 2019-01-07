package com.genpact.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "entity")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int user_id;
	
//	@Column(name = "username")
//	private String username;
	@Column(name = "first_name")
	private String first_name;
	@Column(name = "last_name")
	private String last_name;
	@Column(name = "email")
	public String email;
	
	@Column(name = "phone_no")
	private int phone_no;
	@Column(name = "role_id")
	private int role_id;
	@Column(name = "age")
	private int age;
	@Column(name = "password")
	private String password;
	@Column(name = "is_active")
	private boolean is_active;

	@Column(name = "created_date")
	private java.sql.Date created_date;
	@Column(name = "updated_date")
	private java.sql.Date updated_date;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
//	   @JoinColumn(name = "role_id", referencedColumnName = "role_id")
	
	@OneToMany(targetEntity=Role.class, mappedBy="role_id", 
			fetch=FetchType.EAGER)
	private Set<Role> roles;
	
	
	public User() {
	}


	public User(String first_name, String last_name, String email, int phone_no, int role_id, int age, String password,
			boolean is_active, Date created_date, Date updated_date, Set<Role> roles) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_no = phone_no;
		this.role_id = role_id;
		this.age = age;
		this.password = password;
		this.is_active = is_active;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.roles = roles;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}


	public int getRole_id() {
		return role_id;
	}


	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isIs_active() {
		return is_active;
	}


	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}


	public java.sql.Date getCreated_date() {
		return created_date;
	}


	public void setCreated_date(java.sql.Date created_date) {
		this.created_date = created_date;
	}


	public java.sql.Date getUpdated_date() {
		return updated_date;
	}


	public void setUpdated_date(java.sql.Date updated_date) {
		this.updated_date = updated_date;
	}


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
				+ email + ", phone_no=" + phone_no + ", role_id=" + role_id + ", age=" + age + ", password=" + password
				+ ", is_active=" + is_active + ", created_date=" + created_date + ", updated_date=" + updated_date
				+ ", roles=" + roles + "]";
	}
	
	
}
	