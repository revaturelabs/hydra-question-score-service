package com.revature.beans;

import java.util.Date;

public class QuestionScore {
	
	private Integer questionScoreId;

	private Question question;
	
	private Screening screening;
	
	private Double score;
	
	private String commentary;
	
	private Date beginTime;

	public QuestionScore(Integer questionScoreId, Question question, Screening screening, Double score,
			String commentary, Date beginTime) {
		super();
		this.questionScoreId = questionScoreId;
		this.question = question;
		this.screening = screening;
		this.score = score;
		this.commentary = commentary;
		this.beginTime = beginTime;
	}

	public Integer getQuestionScoreId() {
		return questionScoreId;
	}

	public void setQuestionScoreId(Integer questionScoreId) {
		this.questionScoreId = questionScoreId;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Screening getScreening() {
		return screening;
	}

	public void setScreening(Screening screening) {
		this.screening = screening;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	
}
