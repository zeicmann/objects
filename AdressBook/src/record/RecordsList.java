package record;

import java.util.ArrayList;
import java.util.Scanner;

public class RecordsList {
	ArrayList<Record> recordsList;
	
	public RecordsList(){
		this.recordsList = new ArrayList<Record>();
	}
	
	public void printRecords(){
		for (Record r: this.recordsList){
			System.out.println(r.toString());
			System.out.println("-------------------------------------------------------------------------");
		}
	}
	
	public void addRecord(Scanner s){
		Record rec = RecordFactory.createNewRecord(s);
		this.recordsList.add(rec);
	}
}
