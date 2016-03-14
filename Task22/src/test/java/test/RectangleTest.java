package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Point;
import main.Rectangle;

public class RectangleTest {
	
	Rectangle rect = new Rectangle(new Point (100, 100), new Point (300, 200));

	@Test
	public void squareTest() {
		assertEquals(rect.square()-20000 < 0.0000001, true);
	}
	
	@Test 
	public void perimentrTest(){
		assertEquals(rect.perimetr()-400 < 0.000001, true);
	}
	
	@Test
	public void isInsideTest(){
		assertTrue(rect.isInside(299, 199));
	}
	
	@Test
	public void isInsideNegative(){
		assertFalse(rect.isInside(300, 200));
	}
	
	@Test
	public void moveTest(){
		int bxs = this.rect.getStartPoint().getX();
		int bys = this.rect.getStartPoint().getY();
		
		int bxe = this.rect.getEndPoint().getX();
		int bye = this.rect.getEndPoint().getY();
		
		this.rect.move(-20, 50);
		
		assertNotEquals(this.rect.getStartPoint().getX(), bxs);
		assertNotEquals(this.rect.getStartPoint().getY(), bys);
		
		assertEquals(this.rect.getEndPoint().getX(), bxe-20);
		assertEquals(this.rect.getEndPoint().getY(), bye+50);
	}
}
