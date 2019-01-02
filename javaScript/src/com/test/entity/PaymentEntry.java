package com.test.entity;

import com.googlecode.objectify.annotation.*;
@Entity
public class PaymentEntry {
 
 @Id @Index long id;
 @Index String contact;
 @Index String payment_date;
 @Index String amount_paid;
 @Index String amount_balance;
 @Index String payment_mode;
 @Index String plan_name;
 @Index String contact_views;
 @Index String sale_by_empname;
 @Index String sale_by_empid;
 @Index String info_verified; //yes or no
 @Index String documents_verified_by; 
 @Index String verification_call_by; 
 @Index String iagree_verified_by; 
 @Index String activation_done; //yes or not 
 String message;  
 @Index String sale_shared_by;
 @Index String due_date;   //bal amt due date
 
 
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getActivation_done() {
	return activation_done;
}
public void setActivation_done(String activation_done) {
	this.activation_done = activation_done;
}
public String getDocuments_verified_by() {
	return documents_verified_by;
}
public void setDocuments_verified_by(String documents_verified_by) {
	this.documents_verified_by = documents_verified_by;
}

public String getSale_shared_by() {
	return sale_shared_by;
}
public void setSale_shared_by(String sale_shared_by) {
	this.sale_shared_by = sale_shared_by;
}
public String getDue_date() {
	return due_date;
}
public void setDue_date(String due_date) {
	this.due_date = due_date;
}
public String getVerification_call_by() {
	return verification_call_by;
}
public void setVerification_call_by(String verification_call_by) {
	this.verification_call_by = verification_call_by;
}
public String getIagree_verified_by() {
	return iagree_verified_by;
}
public void setIagree_verified_by(String iagree_verified_by) {
	this.iagree_verified_by = iagree_verified_by;
}
public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}
public String getPayment_date() {
	return payment_date;
}
public void setPayment_date(String payment_date) {
	this.payment_date = payment_date;
}
public String getAmount_paid() {
	return amount_paid;
}
public void setAmount_paid(String amount_paid) {
	this.amount_paid = amount_paid;
}
public String getAmount_balance() {
	return amount_balance;
}
public void setAmount_balance(String amount_balance) {
	this.amount_balance = amount_balance;
}
public String getPayment_mode() {
	return payment_mode;
}
public void setPayment_mode(String payment_mode) {
	this.payment_mode = payment_mode;
}
public String getPlan_name() {
	return plan_name;
}
public void setPlan_name(String plan_name) {
	this.plan_name = plan_name;
}
public String getContact_views() {
	return contact_views;
}
public void setContact_views(String contact_views) {
	this.contact_views = contact_views;
}
public String getSale_by_empname() {
	return sale_by_empname;
}
public void setSale_by_empname(String sale_by_empname) {
	this.sale_by_empname = sale_by_empname;
}
public String getSale_by_empid() {
	return sale_by_empid;
}
public void setSale_by_empid(String sale_by_empid) {
	this.sale_by_empid = sale_by_empid;
}
public String getInfo_verified() {
	return info_verified;
}
public void setInfo_verified(String info_verified) {
	this.info_verified = info_verified;
}

public PaymentEntry(String contact, String payment_date, String amount_paid,
		String amount_balance, String payment_mode, String plan_name,
		String contact_views, String sale_by_empname, String sale_by_empid,
		String info_verified,String due_date,String shared_by) {
	super();
	this.id=System.currentTimeMillis();
	this.contact = contact;
	this.payment_date = payment_date;
	this.amount_paid = amount_paid;
	this.amount_balance = amount_balance;
	this.payment_mode = payment_mode;
	this.plan_name = plan_name;
	this.contact_views = contact_views;
	this.sale_by_empname = sale_by_empname;
	this.sale_by_empid = sale_by_empid;
	this.info_verified = info_verified;
	this.activation_done="";
    this.due_date=due_date;
    this.sale_shared_by=shared_by;
	
}

public PaymentEntry() {
 
} 
}



