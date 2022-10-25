package com.testing.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customerdata")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 
	private int id;

	private String firstname;

	private String lastname;

	private String middlename;

	private String prefix;

	private String address1;

	private String city;

	private String agentid;

	private String state;

	private int zip;

	private String unittype;

//	private String unitNumber;

	private String vdn;

/*	private String sameCallUcid;

	private String referrerName;

	private String rentOwnVal;

	private String dwellingType;

	private String isMoveInValue;
*/	
	private String Date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getUnittype() {
		return unittype;
	}

	public void setUnittype(String unittype) {
		this.unittype = unittype;
	}

	public String getVdn() {
		return vdn;
	}

	public void setVdn(String vdn) {
		this.vdn = vdn;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", middlename="
				+ middlename + ", prefix=" + prefix + ", address1=" + address1 + ", city=" + city + ", agentid="
				+ agentid + ", state=" + state + ", zip=" + zip + ", unittype=" + unittype + ", vdn=" + vdn + ", Date="
				+ Date + "]";
	}


	
}
