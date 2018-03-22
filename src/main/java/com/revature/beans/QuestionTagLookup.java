package com.revature.beans;

public class QuestionTagLookup {

	private Integer questionTagLookupId;
	
	private Tag tag;

	private Question question;

	public QuestionTagLookup(int questionTagLookupId, Tag tag, Question question) {
		super();
		this.questionTagLookupId = questionTagLookupId;
		this.tag = tag;
		this.question = question;
	}

	public int getQuestionTagLookupId() {
		return questionTagLookupId;
	}

	public void setQuestionTagLookupId(int questionTagLookupId) {
		this.questionTagLookupId = questionTagLookupId;
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
