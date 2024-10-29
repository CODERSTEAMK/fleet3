package com.kindsonthegenius.fleetapp.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {
	

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private int id;
    @Column(unique = true)
	private String username;
	private String fullname;
	private String password;
private String role;




public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getRole() {
	return role;
}


public void setRole(String role) {
	this.role = role;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}







}
