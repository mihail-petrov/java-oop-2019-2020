public class Application {
	
	public static void main(String[] args) {
		
		// Fixed length : defined by the developer
		int[] collection 	= new int[10];
		
		// Big NO NO : Exception 
		collection[5] 		= 10;
		
		// create a method 
		CustomArrayList list = new CustomArrayList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.get(0); // 10
		list.get(1); // 20
		list.get(2); // 30
		
		
		
	}

	public static int[] extendArray(int[] collection) {
		
		int originalArrayLength = collection.length;
		int newArrayLength 		= originalArrayLength * 2;
		int[] newArray 			= new int[newArrayLength];
		
		for(int i = 0; i < collection.length; i++) {
			newArray[i] = collection[i];
		}
		
		return newArray;
	}
}