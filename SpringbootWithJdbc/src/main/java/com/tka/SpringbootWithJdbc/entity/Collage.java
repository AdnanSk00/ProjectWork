package com.tka.SpringbootWithJdbc.entity;

import org.springframework.stereotype.Component;

@Component
public class Collage {
private int clgId;
private String clg_name;
private String city;


public Collage() {
	super();
}
public int getClgId() {
	return clgId;
}
public void setClgId(int clgId) {
	this.clgId = clgId;
}
public String getClg_name() {
	return clg_name;
}
public void setClg_name(String clg_name) {
	this.clg_name = clg_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Collage(int clgId, String clg_name, String city) {
	super();
	this.clgId = clgId;
	this.clg_name = clg_name;
	this.city = city;
}
@Override
public String toString() {
	return "Collage [clgId=" + clgId + ", clg_name=" + clg_name + ", city=" + city + "]";
}
}
