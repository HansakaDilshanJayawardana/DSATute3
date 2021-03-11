package Additional;

public class List {
	Link head, tail;//declare variables
	
	//insertFirst method
	public void insertFrist(int v) {
		if (head == null) {
			head = tail = new Link(v);
		} else {
            Link c = new Link(v);
            head.previous = c;
            c.next = head;
            head = c;
            head.previous = null;
		}
	}
	
	//insertLast method
	public void insertLast (int v) {
		if (head == null) {
			head = tail = new Link(v);
		} else {
            Link c = new Link(v);
            tail.next = c;
            c.previous = tail;
            tail = c;
            tail.next = null;
		}
	}
	
	//deleteFirst method
	public void deleteFirst() {
		if (head == null) {
			return;
		} else {
            System.out.println();
            head = head.next;
            head.previous = null;
		}
	}
	
	//display method
	public void display() {
		Link current = head;
		
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		
		while (current != null) {
			System.out.println(current.value + "\t");
			current = current.next;
		}
	}

}
