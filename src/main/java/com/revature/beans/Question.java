package com.revature.beans;

public class Question {
	
	private Integer questionId;
	
	private Bucket bucket;
	
	private Boolean isActive;
	
	private String questionText;
	
	private String sampleAnswer1;

	private String sampleAnswer2;

	private String sampleAnswer3;

	private String sampleAnswer4;

	private String sampleAnswer5;

	public Question(int questionId, Bucket bucket, Boolean isActive, String questionText, String sampleAnswer1,
			String sampleAnswer2, String sampleAnswer3, String sampleAnswer4, String sampleAnswer5) {
		super();
		this.questionId = questionId;
		this.bucket = bucket;
		this.isActive = isActive;
		this.questionText = questionText;
		this.sampleAnswer1 = sampleAnswer1;
		this.sampleAnswer2 = sampleAnswer2;
		this.sampleAnswer3 = sampleAnswer3;
		this.sampleAnswer4 = sampleAnswer4;
		this.sampleAnswer5 = sampleAnswer5;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public Bucket getBucket() {
		return bucket;
	}

	public void setBucket(Bucket bucket) {
		this.bucket = bucket;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getSampleAnswer1() {
		return sampleAnswer1;
	}

	public void setSampleAnswer1(String sampleAnswer1) {
		this.sampleAnswer1 = sampleAnswer1;
	}

	public String getSampleAnswer2() {
		return sampleAnswer2;
	}

	public void setSampleAnswer2(String sampleAnswer2) {
		this.sampleAnswer2 = sampleAnswer2;
	}

	public String getSampleAnswer3() {
		return sampleAnswer3;
	}

	public void setSampleAnswer3(String sampleAnswer3) {
		this.sampleAnswer3 = sampleAnswer3;
	}

	public String getSampleAnswer4() {
		return sampleAnswer4;
	}

	public void setSampleAnswer4(String sampleAnswer4) {
		this.sampleAnswer4 = sampleAnswer4;
	}

	public String getSampleAnswer5() {
		return sampleAnswer5;
	}

	public void setSampleAnswer5(String sampleAnswer5) {
		this.sampleAnswer5 = sampleAnswer5;
	}
	
}
