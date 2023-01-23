package com.javainvent.junit5.displayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName annotation demo")
public class DisplayNameDemo {

	@Test
	@DisplayName("@DisplayName demo test")
	public void displayNameDemoTest() {
		assertEquals(3, 2 + 1);
	}

	@Test
	@DisplayName("@DisplayName demo with spaces")
	public void displayNameDemoTestWithSpaces() {
		assertEquals(3, 2 + 1);
	}

	@Test
	@DisplayName("@DisplayName demo with )!@!% special characters")
	public void displayNameDemoTestWithSpecialCharacters() {
		assertEquals(3, 2 + 1);
	}

	@Test
	@DisplayName("@DisplayName demo with emojis - 😲")
	public void displayNameWithEmojis() {
		assertEquals(3, 2 + 1);
	}
}
