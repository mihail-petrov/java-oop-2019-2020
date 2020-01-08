public class KillerRobot {
	
	static boolean isActive 						= true;
	static int bateryCycleCount 					= 100;
	static final int MIN_MOBILITY_BATERY_PERCENTAGE = 10;
	static final int MIN_BATERY_PERCENTAGE 			= 0;
	
	public static int getRobotSerialNumber() {
		return 12345;
	}
	
	public static boolean isActive() {
		return bateryCycleCount > MIN_BATERY_PERCENTAGE;
	}
	
	public static String getSystemStatus() {
		
	    boolean isTurnedOn 		   = isActive();
	    
	    boolean isRobotAbleToMove = (bateryCycleCount >= MIN_MOBILITY_BATERY_PERCENTAGE); 
	    boolean isRobotMobile     = isActive() && isRobotAbleToMove;
	    
	    if(isRobotMobile) {
	    	return "Robot is active";	
	    }
	    
	    if(isActive) {
    		return "Robot is active batery recharge is nessesery";	
    	}
	    
	    return "Robot is sleeping";
	}
	
	
	public static void main(String[] args) {
		
		int serialNumber 		= 123456;
		double robotVersion 	= 0.001;
	    float robotSignature 	= 10.4000f;
	    //int bateryCycleCount 	= 100;
	    boolean isActive 		= true;
	    boolean isTurnedOn 		= isActive;
	    
	    String welcomeMessage 	= "Hello world";
	    char seria 				= 'A';
	    
	    // int i = 0;
	    // i = i + 1 
	    // i +=;
	    // i++;
	    
	    for(int i = 0; i < 10; i++) {
	    	System.out.println("Hello world" + i);
	    }
	   
	    while(isActive()) {
	    	
	    	System.out.println("Move next");
	    	bateryCycleCount--;
	    }
	}
}