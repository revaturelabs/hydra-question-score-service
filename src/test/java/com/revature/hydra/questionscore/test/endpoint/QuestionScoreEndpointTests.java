package com.revature.hydra.questionscore.test.endpoint;

import java.util.Date;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.google.gson.JsonObject;
import com.revature.hydra.test.util.TestContext;
import com.revature.hydra.test.util.WebAppContext;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestContext.class, WebAppContext.class })
@DataJpaTest
@WebAppConfiguration
@Ignore
public class QuestionScoreEndpointTests {
	
	@Test
	public final void testQuestionScore() {
		RestAssured.baseURI = "http://127.0.0.1:8080";
		RequestSpecification request = RestAssured.given().contentType(MediaType.APPLICATION_JSON_VALUE);
		JsonObject o = new JsonObject();
		
		o.addProperty("score", 10 );
		o.addProperty("comment", "lel");
		o.addProperty("questionId", 1);
		o.addProperty("beginTime", new Date().getTime());
		o.addProperty("screeningId", 1);
		
//		request.param("score", 10);
//		request.param("comment", "lel");
//		request.param("questionId", 1);
//		request.param("beginTime", new Date());
//		request.param("screeningId", 1);
		request.body(o.toString());
		Response response = request.post("/question/score");
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
	}
	
}
