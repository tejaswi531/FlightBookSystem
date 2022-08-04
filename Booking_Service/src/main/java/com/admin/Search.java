package com.admin;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Search")
public class Search {
	@Id
	private String flightid;
	private String flightName;
	private String from_location;
	private String to_location;
	@Override
	public String toString() {
		return "Search [flightid=" + flightid + ", flightName=" + flightName + ", from_location=" + from_location
				+ ", to_location=" + to_location + "]";
	}
	public String getFlightid() {
		return flightid;
	}
	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFrom_location() {
		return from_location;
	}
	public void setFrom_location(String from_location) {
		this.from_location = from_location;
	}
	public String getTo_location() {
		return to_location;
	}
	public void setTo_location(String to_location) {
		this.to_location = to_location;
	}
	
	
}
