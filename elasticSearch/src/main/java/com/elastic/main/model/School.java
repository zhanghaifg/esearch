package com.elastic.main.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName="schools", type="school")
public class School {
	
	@Id
	private String id;
	
	private String name;
	private String description;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	@Field(type= FieldType.Nested)
	private List<Double> location;
	private int fees;
	
	@Field(type= FieldType.Nested)
	private List<String> tags;
	private String rating;
	
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public List<Double> getLocation() {
		return location;
	}
	public void setLocation(List<Double> location) {
		this.location = location;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "school [id=" + id + ", name=" + name + ", description="
				+ description + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", location="
				+ location.toString() + ", fees=" + fees + ", tags=" + tags.toString() + ", rating="
				+ rating + "]";
	}
	
	
}
