package com.fssa.sp.holiday.project;

import java.util.List;

public class GroundDetails {
	String groundName;
	String groundMainArea;
	String groundAddress;
	String groundLocationLink;
	String district;
	List<String> groundImages;
	List<String> sportsAvailable;
	String startTime;
	String endTime;
	String groundRules;
	double price;
	double increasingPriceForExtraHours;
	int courtsAvailable;
	
	
	
	public String getGroundName() {
		return groundName;
	}
	public void setGroundName(String groundName) {
		this.groundName = groundName;
	}
	public String getGroundMainArea() {
		return groundMainArea;
	}
	public void setGroundMainArea(String groundMainArea) {
		this.groundMainArea = groundMainArea;
	}
	public String getGroundAddress() {
		return groundAddress;
	}
	public void setGroundAddress(String groundAddress) {
		this.groundAddress = groundAddress;
	}
	public String getGroundLocationLink() {
		return groundLocationLink;
	}
	public void setGroundLocationLink(String groundLocationLink) {
		this.groundLocationLink = groundLocationLink;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public List<String> getGroundImages() {
		return groundImages;
	}
	public void setGroundImages(List<String> groundImages) {
		this.groundImages = groundImages;
	}
	public List<String> getSportsAvailable() {
		return sportsAvailable;
	}
	public void setSportsAvailable(List<String> sportsAvailable) {
		this.sportsAvailable = sportsAvailable;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getGroundRules() {
		return groundRules;
	}
	public void setGroundRules(String groundRules) {
		this.groundRules = groundRules;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getIncreasingPriceForExtraHours() {
		return increasingPriceForExtraHours;
	}
	public void setIncreasingPriceForExtraHours(double increasingPriceForExtraHours) {
		this.increasingPriceForExtraHours = increasingPriceForExtraHours;
	}
	public int getCourtsAvailable() {
		return courtsAvailable;
	}
	public void setCourtsAvailable(int courtsAvailable) {
		this.courtsAvailable = courtsAvailable;
	}

	
}
