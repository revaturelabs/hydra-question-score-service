package com.revature.hydra.questionscore.test.endpoint;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@RunWith(SpringRunner.class)
@DataJpaTest
@WebAppConfiguration
public class QuestionScoreEndpointTests {
	
	@Test
	public final void testQuestionScore() {
		RestAssured.baseURI = "http://127.0.0.1:8931";
		RequestSpecification request = RestAssured.given();
		request.param("score", 10);
		request.param("comment", "lel");
		request.param("questionId", 1);
		request.param("beginTime", new Date());
		request.param("screeningId", 1);
		Response response = request.post("/question/score");
		int statusCode = response.getStatusCode();
		// 204 means no content
		Assert.assertEquals(statusCode, 204);
	}
	
}
