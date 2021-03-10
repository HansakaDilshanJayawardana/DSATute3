package Q1;

public class Q1 {

	public static void main(String[] args) {
		List list = new List();
		
		list.first = new Link("Mithila");
		Link p1 = list.first;
		
		Link p2 = new Link("Akila");
		p1.next = p2;
		
		Link p3 = new Link("Mihiri");
		p2.next = p3;
		
		Link p4 = new Link("Nisha");
		p3.next = p4;
		
		list.print();
		System.out.println("\n\n");
		
		
		//Modification
		list.first = p3;
		p3.next = p2;
		p2.next = p1;
		p1.next = p4;
		p4.next = null;
		
		list.print();
	}
}
