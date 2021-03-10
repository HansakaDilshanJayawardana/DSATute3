package Q1;

public class List {
    Link first;//declare a variable
	
	//print method
	public void print() {
		while (first != null) {
			System.out.println(first.value);//output
			first = first.next;
		}
	}
}
