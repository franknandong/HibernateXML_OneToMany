package com.fndong.customer;
// Generated Mar 14, 2016 3:23:43 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer implements java.io.Serializable {

	private Integer customerId;
	private String firstname;
	private String lastname;
	private String email;
	private String city;
	private String country;
	private Set<Order> orders = new HashSet<Order>(0);

	public Customer() {
	}

	public Customer(String firstname, String lastname, String email, String city, String country) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.country = country;
	}

	public Customer(String firstname, String lastname, String email, String city, String country, Set<Order> orders) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.city = city;
		this.country = country;
		this.orders = orders;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}