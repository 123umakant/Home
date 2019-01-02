package com.test.entity;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
@Entity
public class ReviewCredit {
	@Id long id;                     //timestamp
    @Index  long tutor_Contact;
    String date;
    @Index  int credits_Given;
    @Index  String review_on;  //fb or google
    @Index  boolean verified; //verified or not 
		
	   

	public ReviewCredit(long tutor_Contact, String date,
			int credits_Given, String review_on,boolean verified) {
		super();
		this.id = System.currentTimeMillis();
		this.tutor_Contact = tutor_Contact;
		this.date = date;
		this.credits_Given = credits_Given;
		this.review_on = review_on;
		this.verified = verified;
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public long getTutor_Contact() {
		return tutor_Contact;
	}





	public void setTutor_Contact(long tutor_Contact) {
		this.tutor_Contact = tutor_Contact;
	}





	public String getDate() {
		return date;
	}





	public void setDate(String date) {
		this.date = date;
	}





	public int getCredits_Given() {
		return credits_Given;
	}





	public void setCredits_Given(int credits_Given) {
		this.credits_Given = credits_Given;
	}





	public String getReview_on() {
		return review_on;
	}





	public void setReview_on(String review_on) {
		this.review_on = review_on;
	}





	public boolean isVerified() {
		return verified;
	}





	public void setVerified(boolean verified) {
		this.verified = verified;
	}





		public ReviewCredit() {
			super();
		}
	      
		

}

