package Additional;

public class Additional {

	public static void main(String[] args) {
		List list = new List();//create an object
		
		//insert items to list
		list.insertFrist(10);
		list.insertFrist(120);
		list.insertFrist(1203);
		list.insertFrist(43);
		list.insertFrist(300);
		list.insertFrist(4);
		list.insertFrist(3);
		
		//display after insert
		list.display();
		
		//delete first item
		list.deleteFirst();
		
		//display after delete first item
		list.display();

	}

}
