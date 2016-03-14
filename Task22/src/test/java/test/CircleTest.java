package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Circle;
import main.Point;

public class CircleTest {
	
	Circle circle = new Circle(new Point(100, 100), 50);
	
	@Test
	public void squareTest() throws Exception{
		assertTrue(Math.abs(this.circle.square()-1963.4954084936207740391521145497d)<0.00000000001 ? true : false);
	}
	
	@Test
	public void isInsideTestPositive(){
		assertTrue(this.circle.isInside(100, 100));
	}
	
	@Test
	public void isInsideTestPositive2(){
		assertTrue(this.circle.isInside(100, 149));
	}
	
	@Test
	public void isInsideTestNegative(){
		assertFalse(this.circle.isInside(150, 100));
	}
	
	@Test
	public void isInsideTestNegative2(){
		assertFalse(this.circle.isInside(100, 150));
	}
	
}
