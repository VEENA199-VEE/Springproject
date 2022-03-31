package com.tns.item;



import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item
{
private Integer id;
private String name;
private Integer manufacturing;
private Integer expiry;
private float price;
private String category;


public Item(Integer id, String name, Integer manufacturing, Integer expiry, float price,String category) 
{
	this.id = id;
	this.name = name;
	this.manufacturing = manufacturing;
	this.expiry = expiry;
	this.price = price;
	this.category = category;
	
}

//Default constructor
public Item() 
{
	super();
}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)


public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getManufacturing() {
	return manufacturing;
}

public void setManufacturing(Integer manufacturing) {
	this.manufacturing = manufacturing;
}

public Integer getExpiry() {
	return expiry;
}

public void setExpiry(Integer expiry) {
	this.expiry = expiry;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry + ", price="
			+ price + ", category=" + category + "]";
}
}



