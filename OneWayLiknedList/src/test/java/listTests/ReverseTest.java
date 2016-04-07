package listTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import linkedList.impl.OneWayLinkedList;

public class ReverseTest {

	OneWayLinkedList<String> testList;
	
	@Before
	public void setUp(){
		this.testList = new OneWayLinkedList<String>();
	}

	
	@Test
	public void test() {
		//add
		this.testList.add("This ");
		this.testList.add("is ");
		this.testList.add("linked ");
		this.testList.add("list ");
		this.testList.add("test.");
		
		this.testList.reverseList();
		
		assertTrue(this.testList.getElementByIndex(0).equals("test."));
		assertTrue(this.testList.getElementByIndex(1).equals("list "));
		assertTrue(this.testList.getElementByIndex(2).equals("linked "));
		assertTrue(this.testList.getElementByIndex(3).equals("is "));
		assertTrue(this.testList.getElementByIndex(4).equals("This "));
	}
	
	@Test
	public void testEmptyList(){
		this.testList.reverseList();
	}

}
