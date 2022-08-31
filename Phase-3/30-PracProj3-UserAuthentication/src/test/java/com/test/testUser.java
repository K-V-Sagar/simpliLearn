package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class testUser {

	private UserAuth user;

	@BeforeEach
	public void setup() {
		user = new UserAuth();
		System.out.println("Test Initiated");
	}

	@AfterEach
	public void tearDown() {
		user = null;
		System.out.println("Test Closed");
	}

	@Test
	@DisplayName("Checking email")
	public void testUser() {
		assertEquals("sagar@mail.com", user.username());
	}

	@Test
	@DisplayName("Checking email is not blank")
	public void testIfUserNull() {
		assertNotNull(user.username());
	}
	
	@Test
	@DisplayName("Mail Check")
	public void testMail() {
		String email = user.username();
		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		assertEquals(true, matcher.matches());

	}
	
	@Test
	@DisplayName("Checking password")
	public void testPassword() {
		assertEquals("sagar123", user.pwd());
	}

	@Test
	@DisplayName("Checking password is not blank")
	public void testIfPasswordNull() {
		assertNotNull(user.pwd());
	}

	
	@Test
	@DisplayName("Authentication Check")
	public void test_authentication() {
		UserAuth ua = new UserAuth();
		assertEquals(true, ua.authentication());
		System.out.println("User authenticated!");
	}
	
}