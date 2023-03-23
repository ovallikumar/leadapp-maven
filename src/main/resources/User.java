package com.javachap.domain;

public interface User extends Domain{

	String getFirstName();

	void setFirstName(String Firstname);

	String getLastName();

	void setLastName(String lastName);

	String getEmail();

	void setEmail(String email);

	String getPassword();

	void setPassword(String password);
}
