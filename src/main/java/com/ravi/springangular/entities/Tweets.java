package com.ravi.springangular.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tweets")
public class Tweets implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4839009854748231351L;
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="user")
	private String userName;
	@Column(name="created_at")
	private String createdAt;
	@Column(name="user_location")
	private String userLocation;
	@Column(name="location")
	private String location;
	@Column(name="text")
	private String tweetText;
	@Column(name="retweet")
	private Integer reTweets;
	@Column(name="hashtags")
	private String hashtags;
	@Column(name="language")
	private String language;
	@Column(name="sentiment")
	private String sentiment;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTweetText() {
		return tweetText;
	}
	public void setTweetText(String tweetText) {
		this.tweetText = tweetText;
	}
	public Integer getReTweets() {
		return reTweets;
	}
	public void setReTweets(Integer reTweets) {
		this.reTweets = reTweets;
	}
	public String getHashtags() {
		return hashtags;
	}
	public void setHashtags(String hashtags) {
		this.hashtags = hashtags;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

}
