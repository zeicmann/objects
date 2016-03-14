package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Circle;
import main.Point;

public class CircleTest {
	
	Circle circle = new Circle(new Point(100, 100), 50);
	
	@Test
	public void squareTest(){
		assertTrue(Math.abs(this.circle.square() - 1963.4954084936207740391521145497d)<0.00000000001 ? true : false);
	}
	
	@Test
	public void testPerimetr(){
		assertTrue(Math.abs(this.circle.perimetr() - 314.15926535897932384626433832795)<0.00000000001? true: false);
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
	
	@Test
	public void moveTest(){
		int bx = this.circle.getStartPoint().getX();
		int by = this.circle.getStartPoint().getY();
		int br = this.circle.getRadius();
		
		this.circle.move(10, -10);
		
		assertNotEquals(this.circle.getStartPoint().getX(), bx);
		assertEquals(this.circle.getStartPoint().getY(), by-10);
		assertEquals(this.circle.getRadius(), br);
	}
}
