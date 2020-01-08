public class RobotCat {

	static int batteryCycle 	= 100;	
	//static boolean isActive 	= true;
	
	static final int MIN_BATTERY_CAPACITY_PERCENTAGE 	= 10;
	static final int NEW_SERIA_CATEGORY 				= 1000;
	
	public static boolean isActive() {
		return batteryCycle > 0;
	}
	
	public static int getSerialNumber() {
		return 123456;
	}
		
	public static String getRobotStatus() {
		
		boolean hasEnergy 	= batteryCycle > MIN_BATTERY_CAPACITY_PERCENTAGE;
		boolean isOn		= isActive() && hasEnergy;		
		
		if(isOn) { // false
			return "Robot is on";
		}
		
		if(isActive()) {
			return "Robot needs charging";
		}
		
		if(hasEnergy) {
			return "You must turn the robot to active mode";	
		}
		
		return "Robot is off";
	}
	
	public static void main(String[] args) {
		
		int serrialNumber 	= 123456;
		double robotVersion = 12.5;
		int batteryCycle 	= 100;
//			
//		String newStatus 	= (serrialNumber > NEW_SERIA_CATEGORY) 
//								? "New status" 
//								: "Old category";
		
		// i++;
		// i = i + 1;
		// i += 1;
		for(int i = 0; i < 10; i++) {
			
		}
		
		while(isActive()) {
			
			System.out.println("Iteration");
			batteryCycle--;
		}
	}
}
