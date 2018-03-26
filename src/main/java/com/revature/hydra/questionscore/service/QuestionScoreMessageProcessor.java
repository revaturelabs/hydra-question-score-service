package com.revature.hydra.questionscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonObject;
import com.revature.beans.SimpleQuestionScore;

@Service
public class QuestionScoreMessageProcessor {

	@Autowired
	private static QuestionScoreCompositionService questionScoreService;

	/**
	 * Process a Json request to execute methods. Method list: findByScreeningId -
	 * find all SimpleQuestionScores for a single screening ID
	 * 
	 * @param request
	 * @return
	 */
	public static List<SimpleQuestionScore> processQuestionScoreRequest(JsonObject request) {
		String methodName = request.get("methodName").getAsString();
		List<SimpleQuestionScore> simpleQuestionScores = null;
		switch (methodName) {
		case "findByScreeningId":
			Integer screeningId = request.get("screeningId").getAsInt();
			simpleQuestionScores = questionScoreService.findByScreeningId(screeningId);
			break;
		}
		return simpleQuestionScores;
	}

}
