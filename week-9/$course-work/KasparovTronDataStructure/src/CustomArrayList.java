public class CustomArrayList<T> {

	private int baseCollectionInitialLength = 5;
	private T[] baseCollection;
	
	private int freePositionPointerIndex = 0;
	
	public CustomArrayList() {
		this.baseCollection = (T[]) new Object[this.baseCollectionInitialLength];
	}
		
	public void push(T element) {
		
		try {
			this.baseCollection[this.freePositionPointerIndex] = element;
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			// extend
			// 1. create a copy of the original collection
			T[] temporalyCollection = this.copyCollection(this.baseCollection);
			this.baseCollectionInitialLength = baseCollectionInitialLength * 2; 
			this.baseCollection = (T[]) new Object[this.baseCollectionInitialLength];
			this.baseCollection = extendCollection(this.baseCollection, temporalyCollection);
			this.baseCollection[this.freePositionPointerIndex] = element;
		}
		finally {
			this.freePositionPointerIndex++;
		}
		
//		if(this.freePositionPointerIndex == this.baseCollection.length) {
//			// extend
//			// 1. create a copy of the original collection
//			int[] temporalyCollection = this.copyCollection(this.baseCollection);
//			this.baseCollectionInitialLength = baseCollectionInitialLength * 2; 
//			this.baseCollection = new int[this.baseCollectionInitialLength];
//			this.baseCollection = extendCollection(this.baseCollection, temporalyCollection);
//		}
//		
//		this.baseCollection[this.freePositionPointerIndex] = element;
//		this.freePositionPointerIndex++;	
	}
	
	
	private T[] copyCollection(T[] originalCollection) {
		
		T[] newCollection = (T[])new Object[originalCollection.length];
		
		for(int i = 0; i < originalCollection.length; i++) {
			newCollection[i] = 	originalCollection[i];
		}
		
		return newCollection;
	}
	
	
	private T[] extendCollection(T[] baseCollection, T[] extendCollection) {
	
		T[] newCollection = copyCollection(baseCollection);
		
		for(int i = 0; i < extendCollection.length; i++) {
			newCollection[i] = extendCollection[i];
		}
		
		
		return newCollection;
	}
	
	public T get(int index) {
		return this.baseCollection[index];
	}
}
