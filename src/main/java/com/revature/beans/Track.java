package com.revature.beans;

public class Track {

	private Integer trackId;

	private String trackName;

	private Boolean isActive;

	public Track(Integer trackId, String trackName, Boolean isActive) {
		super();
		this.trackId = trackId;
		this.trackName = trackName;
		this.isActive = isActive;
	}

	public Integer getTrackId() {
		return trackId;
	}

	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
