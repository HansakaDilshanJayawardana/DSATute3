package Q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		 List list = new List();//create an object
		 
		 Scanner sc = new Scanner(System.in);
		 
		 for (int i = 1; i < 5; i++) {
			list.insertFirst(sc.nextInt());
		}
		 System.out.println("");
		 sc.close();
		 
		 //(1)Add a new link after a given number and display the list
		 if(list.insertAfter(30, 35) == true)
			 list.displayList();
		 
		 //(2)Delete a link from the link list and display the list
		 if (list.delete(30) != null) {
			list.displayList();
		}

	}

}
