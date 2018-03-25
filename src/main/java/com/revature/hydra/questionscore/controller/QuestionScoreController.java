package com.revature.hydra.questionscore.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ResponseEntity<Void> questionScore(@RequestBody SimpleQuestionScore questionScore) {
		questionScoreRepository
				.save(new SimpleQuestionScore(questionScore.getQuestionId(), questionScore.getScreeningId(),
						questionScore.getScore(), questionScore.getCommentary(), questionScore.getBeginTime()));
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@RequestMapping(value = "question/viewScores/{screeningId}", method = RequestMethod.GET)
	public ResponseEntity<List<SimpleQuestionScore>> getScoresByScreeningId(
			@PathVariable("screeningId") Integer screeningId) {
		List<SimpleQuestionScore> scoreList = questionScoreRepository.findByScreeningId(screeningId);
		return new ResponseEntity<List<SimpleQuestionScore>>(scoreList, HttpStatus.OK);
	}

}
