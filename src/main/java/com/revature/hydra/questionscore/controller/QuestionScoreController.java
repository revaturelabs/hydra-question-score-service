package com.revature.hydra.questionscore.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
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
	
	@RequestMapping(value = "/question/score", method = RequestMethod.POST)
	public ResponseEntity<Void> questionScore(@RequestParam(name="score") Integer score, @RequestParam(name="comment") String comment, @RequestParam(name="questionId") Integer questionId, @RequestParam(name="beginTime") @DateTimeFormat(pattern="EEE MMM dd HH:mm:ss z yyyy") Date beginTime, @RequestParam(name="screeningId") Integer screeningId) {
		questionScoreRepository.save(new SimpleQuestionScore(questionId, screeningId, score.doubleValue(), comment, beginTime));
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
