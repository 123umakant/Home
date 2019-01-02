package com.test.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
@Entity

public class StudentDetail {
@Id long Contact;
@Index String Name;
      String Password;
	



public long getContact() {
		return Contact;
	}


	public void setContact(long contact) {
		Contact = contact;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	public StudentDetail(long contact, String name, String password) {
		super();
		Contact = contact;
		Name = name;
		Password = password;
	}


public StudentDetail()
{
	
}
		
}
