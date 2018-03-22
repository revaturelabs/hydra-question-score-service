package com.revature.beans;

import java.util.Date;

public class Screening {
	
	private Integer screeningId;

	private SimpleTrainee trainee;

	private SimpleTrainer trainer;

	private Track track;

	private Double compositeScore;

	private String aboutMeCommentary;

	private String generalCommentary;

	private String softSkillCommentary;

	private Date startDateTime;

	private Date endDateTime;

	private String softSkillsVerdict;

	private Status status;

	public Screening(Integer screeningId, SimpleTrainee trainee, SimpleTrainer trainer, Track track,
			Double compositeScore, String aboutMeCommentary, String generalCommentary, String softSkillCommentary,
			Date startDateTime, Date endDateTime, String softSkillsVerdict, Status status) {
		super();
		this.screeningId = screeningId;
		this.trainee = trainee;
		this.trainer = trainer;
		this.track = track;
		this.compositeScore = compositeScore;
		this.aboutMeCommentary = aboutMeCommentary;
		this.generalCommentary = generalCommentary;
		this.softSkillCommentary = softSkillCommentary;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.softSkillsVerdict = softSkillsVerdict;
		this.status = status;
	}

	public Integer getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(Integer screeningId) {
		this.screeningId = screeningId;
	}

	public SimpleTrainee getTrainee() {
		return trainee;
	}

	public void setTrainee(SimpleTrainee trainee) {
		this.trainee = trainee;
	}

	public SimpleTrainer getTrainer() {
		return trainer;
	}

	public void setTrainer(SimpleTrainer trainer) {
		this.trainer = trainer;
	}

	public Track getTrack() {
		return track;
	}

	public void setTrack(Track track) {
		this.track = track;
	}

	public Double getCompositeScore() {
		return compositeScore;
	}

	public void setCompositeScore(Double compositeScore) {
		this.compositeScore = compositeScore;
	}

	public String getAboutMeCommentary() {
		return aboutMeCommentary;
	}

	public void setAboutMeCommentary(String aboutMeCommentary) {
		this.aboutMeCommentary = aboutMeCommentary;
	}

	public String getGeneralCommentary() {
		return generalCommentary;
	}

	public void setGeneralCommentary(String generalCommentary) {
		this.generalCommentary = generalCommentary;
	}

	public String getSoftSkillCommentary() {
		return softSkillCommentary;
	}

	public void setSoftSkillCommentary(String softSkillCommentary) {
		this.softSkillCommentary = softSkillCommentary;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getSoftSkillsVerdict() {
		return softSkillsVerdict;
	}

	public void setSoftSkillsVerdict(String softSkillsVerdict) {
		this.softSkillsVerdict = softSkillsVerdict;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
