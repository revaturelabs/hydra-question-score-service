package com.revature.hydra.questionscore.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.SimpleQuestionScore;
import com.revature.hydra.questionscore.data.QuestionScoreRepository;

@RestController
@CrossOrigin
public class QuestionScoreController {
	
	private static final Logger log = Logger.getLogger(QuestionScoreController.class);
	
	@Autowired
	private QuestionScoreRepository questionScoreRepository;
	
	@RequestMapping(value = "/question/score", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> questionScore(@RequestParam(value="score") Integer score, @RequestParam(value="comment") String comment, @RequestParam(value="questionId") Integer questionId, @RequestParam(value="beginTime") Date beginTime, @RequestParam(value="screeningId") Integer screeningId) {
		log.info("Scoring question of id: " + questionId);
		questionScoreRepository.save(new SimpleQuestionScore(questionId, screeningId, score.doubleValue(), comment, beginTime));
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
