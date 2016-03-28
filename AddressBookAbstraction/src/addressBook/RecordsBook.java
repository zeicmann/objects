package addressBook;

public interface RecordsBook {
	public void addNewRecord();
	public void printAllRecords();
	public BasicRecord getRecordByName(String name);
}
