package com.revature.hydra.questionscore.service;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.revature.beans.SimpleQuestionScore;

@Service
public class QuestionScoreMessageReceiver {
	
	/**
	 * Listen for requests for SimpleQuestionScore objects
	 * 
	 * @param message
	 * @return
	 */
	@RabbitListener(queues = "revature.hydra.repos.questionscore")
	public List<SimpleQuestionScore> receiveSimpleQuestionScoreRequest(String message){
		JsonParser parser = new JsonParser();
		JsonElement element = parser.parse(message);
		JsonObject request = element.getAsJsonObject();
		
		return QuestionScoreMessageProcessor.processQuestionScoreRequest(request);
	}
}
