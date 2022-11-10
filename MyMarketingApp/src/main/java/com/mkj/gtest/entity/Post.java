package com.mkj.gtest.entity;

public class Post {

	
	private int postid;
	private String description;
	private String date;
	private int likes;
	private int dislikes;
	
	public Post(String description, String date, int likes, int dislikes) {
		super();
		this.description = description;
		this.date = date;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public Post(int postid, String description, String date, int likes, int dislikes) {
		super();
		this.postid = postid;
		this.description = description;
		this.date = date;
		this.likes = likes;
		this.dislikes = dislikes;
	}

	public int getPostid() {
		return postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislikes() {
		return dislikes;
	}

	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	
	
}
