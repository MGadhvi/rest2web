package com.sparta.mg.rest2web.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActivityDTO{

	@JsonProperty("activity")
	private String activity;

	@JsonProperty("accessibility")
	private Double accessibility;

	@JsonProperty("price")
	private Integer price;

	@JsonProperty("link")
	private String link;

	@JsonProperty("type")
	private String type;

	@JsonProperty("key")
	private String key;

	@JsonProperty("participants")
	private Integer participants;

	public String getActivity(){
		return activity;
	}

	public Double getAccessibility(){
		return accessibility;
	}

	public Integer getPrice(){
		return price;
	}

	public String getLink(){
		return link;
	}

	public String getType(){
		return type;
	}

	public String getKey(){
		return key;
	}

	public Integer getParticipants(){
		return participants;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public void setAccessibility(Double accessibility) {
		this.accessibility = accessibility;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "ActivityDTO{" +
				"activity='" + activity + '\'' +
				", accessibility=" + accessibility +
				", price=" + price +
				", link='" + link + '\'' +
				", type='" + type + '\'' +
				", key='" + key + '\'' +
				", participants=" + participants +
				'}';
	}
}