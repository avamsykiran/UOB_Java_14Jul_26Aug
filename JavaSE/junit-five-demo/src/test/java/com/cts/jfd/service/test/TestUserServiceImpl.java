package com.cts.jfd.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cts.jfd.exception.InvalidUserDetailsException;
import com.cts.jfd.model.Gender;
import com.cts.jfd.model.User;
import com.cts.jfd.service.UserServiceImpl;

public class TestUserServiceImpl {

	UserServiceImpl userService;
	
	public TestUserServiceImpl() {
		userService= new UserServiceImpl();
	}

	@Test
	@DisplayName("greetUser should return 'Hello userName' given a non-null user")
	void testGreetUser() throws InvalidUserDetailsException {
		//test data
		User user = new User("Mr","Vamsy",Gender.MALE,LocalDate.of(1985, Month.JUNE,6));
		//expected result
		String expected = "Hello Vamsy";
		//actual result
		String actual = userService.greetUser(user);
		assertEquals(expected, actual);
	}
	
	@Test
	@DisplayName("greetUser should throw InvalidUserDetaislException given a null user")
	void testGreetUser2() {
		//test data
		User user = null;
		assertThrows(InvalidUserDetailsException.class, () -> {userService.greetUser(user);});
	}
}
