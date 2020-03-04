import java.util.ArrayList;

public class Application {

	
	public static void main(String[] args) {
		
		
		// Object element = "Test";
		
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		CustomArrayList<Integer> collection = new CustomArrayList<>();
		collection.push("Test"); // 1 
		collection.push(20); // 2
		collection.push(true); // 3
		collection.push(40); 
		collection.push(50);		
		collection.push(new Node("Test")); // 6
		System.out.print(collection.get(0)); // 10		
		System.out.print(((Node)collection.get(5)).value); // 10
	}
	
}
