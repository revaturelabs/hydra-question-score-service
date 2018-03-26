package com.revature.hydra.questionscore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.SimpleQuestionScore;
import com.revature.hydra.questionscore.data.QuestionScoreRepository;

@Service
public class QuestionScoreCompositionService {

	@Autowired
	private QuestionScoreRepository questionScoreRepository;

	public List<SimpleQuestionScore> findByScreeningId(Integer screeningId) {
		return questionScoreRepository.findByScreeningId(screeningId);
	}

	public void save(SimpleQuestionScore simpleQuestionScore) {
		questionScoreRepository.save(simpleQuestionScore);
	}
}
