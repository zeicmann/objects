package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.IsBetween;

public class IsBetweenTest {

	@Test
	public void testNegative() {
		assertFalse(IsBetween.check(10, 20, 5));
	}
	
	@Test
	public void testNegative1() {
		assertFalse(IsBetween.check(5, 5, 6));
	}
	
	@Test
	public void testNegative2() {
		assertFalse(IsBetween.check(5, 5, 4));
	}
	
	@Test
	public void testPositive1() {
		assertTrue(IsBetween.check(5, 10, 7));
	}
	
	@Test
	public void testPositive2() {
		assertTrue(IsBetween.check(10, 5, 7));
	}
}
