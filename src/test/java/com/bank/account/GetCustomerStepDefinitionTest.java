package com.bank.account;

import static org.junit.Assert.assertEquals;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetCustomerStepDefinitionTest extends AbstractSpringConfigurationTest {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	private String accountid;
	private ResponseEntity<String> response = null;


	
	@When("the client calls GET {string} with accountId as {string} and currency as {string}")
	public void the_client_calls_get_with_account_id_as_and_currency_as(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("accountId", String.valueOf(string2));
		uriVariables.put("currency", String.valueOf(string3));
		String url = buildUrl(HOST, PORT, string, uriVariables);
		logger.info("url {}", url);
		response = invokeRESTCall(url, HttpMethod.GET, null);
		
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("^the client receives status code of (\\d+)$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {

		if (response != null && response.getStatusCode().is2xxSuccessful()) {
			assertEquals(statusCode, response.getStatusCode().value());
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Then("the response contains amount {string}")
	public void the_response_contains_amount(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (response != null && response.getStatusCode().is2xxSuccessful()) {
			String responseBody = response.getBody();
			com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
			//@SuppressWarnings("unchecked")
			Map<String, String> responseMap;
			try {
				responseMap = mapper.readValue(responseBody, Map.class);
				System.out.print(responseMap);
				assertEquals(string, responseMap.get("amount"));
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    throw new io.cucumber.java.PendingException();
	}
}
