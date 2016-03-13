package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Circle;
import main.Start;

public class CircleTest {
	
	Circle circle;
	
	@Before
	public void setUp(){
		this.circle = new Circle(100, 100, 50);
	}
	
	@Test
	public void squareTest() throws Exception{
		boolean squareEq = (Math.abs(this.circle.square()-1963.4954084936207740391521145497d)<0.00000000001)? true : false;
		assertEquals(squareEq, true);
	}
	
	@Test
	public void isInsideTestNegative() throws Exception{
		assertEquals(this.circle.isInside(100, 100), false);
	}
	
	@Test
	public void isInsideTestPositive1() throws Exception{
		assertEquals(this.circle.isInside(150, 100), false);
	}
	
	@Test
	public void isInsideTestPositive2() throws Exception{
		assertEquals(this.circle.isInside(100, 150), false);
	}
	
	@Test
	public void getRadiusTest() throws Exception{
		assertEquals (this.circle.getRadius() == 50, true);
	}
	
	@Test
	public void movePositive() throws Exception{
		int bx = this.circle.getX();
		int by = this.circle.getY();
		circle.move(Start.scrX-circle.getRadius()-1, Start.scrY - circle.getRadius()-1);
		assertEquals((bx == circle.getX()&& by == circle.getY()), false);
	}
	
	@Test 
	public void moveNegativeX() throws Exception{
		int bx = this.circle.getX();
		int by = this.circle.getY();
		circle.move(Start.scrX-circle.getRadius(), Start.scrY - circle.getRadius()-1);
		assertEquals((bx == circle.getX()&& by == circle.getY()), true);
	}
	
	@Test 
	public void moveNegativeY() throws Exception{
		int bx = this.circle.getX();
		int by = this.circle.getY();
		circle.move(Start.scrX-circle.getRadius()-1, Start.scrY - circle.getRadius());
		assertEquals((bx == circle.getX()&& by == circle.getY()), true);
	}
	
	@Test
	public void resizeTestPositive() throws Exception{
		int r = circle.getRadius();
		circle.setRadius(100);
		assertEquals(r==circle.getRadius(), false);
		this.reset();
	}
	
	@Test
	public void resizeTestPositiveNegative(){
		int r = circle.getRadius();
		circle.setRadius(500);
		assertEquals(r==circle.getRadius(), true);
		this.reset();
	}
	
	private void reset(){
		circle.move(100,100);
		circle.setRadius(50);
	}
}
