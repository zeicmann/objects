package main;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import record.Record;
import record.RecordFactory;

public class CreateRecordAndPrint {

	Scanner s;
	Record record;
	
	@Before
	public void setUp(){
		s = new Scanner(System.in);
	}
	
	@Test
	public void test() {
		record = RecordFactory.createNewRecord(s);
		System.out.println(record.toString());
	}

}
