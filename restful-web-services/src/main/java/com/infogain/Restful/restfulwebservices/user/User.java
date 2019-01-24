package com.infogain.Restful.restfulwebservices.user;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Info about modal class")
public class User {

	private Integer id;
	
	@Size(min=2, message="Name should have more than 2 characters")
	@ApiModelProperty(notes="Name should have more than 2 characters")
	private String name;
	
	@Past
	@ApiModelProperty(notes="Birth date should be in past")
	private Date birthDate;
	
	@OneToMany(mappedBy="user")
	private List<Post> posts;

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	protected User() {
		
	}
	
}
