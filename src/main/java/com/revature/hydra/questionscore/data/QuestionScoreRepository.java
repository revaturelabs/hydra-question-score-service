package com.revature.hydra.questionscore.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.SimpleQuestionScore;

@Repository
public interface QuestionScoreRepository extends JpaRepository<SimpleQuestionScore, Integer> {

	List<SimpleQuestionScore> findByScreeningId(Integer screeningId);
	
}
