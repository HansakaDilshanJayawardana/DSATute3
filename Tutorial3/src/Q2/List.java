package Q2;

public class List {
	private Link first;

	//constructor
	public List() {
		first = null;
	}
	
	//isEmpty method
	public boolean isEmpty() {
		return (first == null);//true if list is empty
	}
	
	//displayList method
	public void displayList() {
		Link current = first;//Link current will point to first
		
		while (current != null) {
			//prints each link by incrementing pointer
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
	
	//insertFirst method
	public void insertFirst (int id) {
		Link newLink = new Link(id);//create an object for link and pass the id
		newLink.next = first;//move previous first to next index 
		first = newLink;//insert the item to front
	}
	
	//find method (i)
	public Link find(int key) {
		Link current = first;//Link current will point to first
		
		//move current until the end of list
		while (current != null) {
			//compares link to be found with each link present in the list
			//find the item
			if (current.iData == key) {
				return current;
			}
			//not found
			else {
				current = current.next;//move the current
			}
		}
		
		//if not found
		return null;
	}
	
	//insertAfter method (ii)
	public boolean insertAfter(int key, int newData) {
		Link current = first;//Link current will point to first
		
		//move current until the end of list
		while (current != null) {
			//found the key
			if (current.iData == key) {
				Link newLink = new Link(newData);//create a object for link and pass the data value which insert to the list
				newLink.next = current.next;//create the relationship between insert item and the current next item
				current.next = newLink;//create the relationship between current item and insert item
				return true;
			}   
			//not found 
			else {
				current = current.next;//move current
			}
		}
		
		//if not found until the end of list
		return false;
	}
	
	//delete method (iii)
	public Link delete(int key) {
		Link current = first;//Link current will point to first
		Link previous = first;//Link previous will point to first
		
		//move current until the end of list
		while (current != null) {
			//found the key
			if (current.iData == key) {
				//if have to delete first item (first deletion)
				if (current == first) {
					first = current.next;//delete the first key and first will point to current next
					return current;
				} 
				//if have to delete middle item (intermediate deletion)
				else {
					previous.next = current.next;//delete the key and create the relationship between previous and current next
					return current;
				}
			}
			//not found 
			else {
				previous = current;//move previous
				current = current.next;//move current
			}
		}
		
		//if not found until the end of list
		return null;
	}

}
