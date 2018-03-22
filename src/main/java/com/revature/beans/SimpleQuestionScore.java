package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity 
@Table(name="QUESTION_SCORE")
public class SimpleQuestionScore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="QUESTION_SCORE_SEQUENCE")
	@SequenceGenerator(name="QUESTION_SCORE_SEQUENCE",sequenceName="QUESTION_SCORE_SEQUENCE")
	@Column(name="QUESTION_SCORE_ID")
	private Integer questionScoreId;
	
	@Column(name="QUESTION_ID")
	private Integer questionId;
	
	@Column(name="SCREENING_ID")
	private Integer screeningId;
	
	@Column(name="SCORE")
	private Double score;
	
	@Column(name="COMMENTARY")
	private String commentary;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BEGIN_TIME")
	private Date beginTime;

	public SimpleQuestionScore(Integer questionId, Integer screeningId, Double score, String commentary,
			Date beginTime) {
		super();
		this.questionId = questionId;
		this.screeningId = screeningId;
		this.score = score;
		this.commentary = commentary;
		this.beginTime = beginTime;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(Integer screeningId) {
		this.screeningId = screeningId;
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

	public Integer getQuestionScoreId() {
		return questionScoreId;
	}
	
}
