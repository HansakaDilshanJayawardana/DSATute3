package Q2;

public class Link {
	//declare variables
	public int iData;//data section(store only one value)
	public Link next;//reference
	
	//constructor
	public Link(int id) {
		//initialization
		iData = id;
		next = null;
	}
	
	//display data item
	public void displayLink() {
		System.out.println(iData);
	}

}
