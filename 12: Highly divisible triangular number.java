import java.lang.Math;

public class FactorChecker{
	
	static final int AMMOUNT_OF_TRIANGLE_NUMBERS_TO_CHECK = 100000;
	static final int NUMBER_OF_FACTORS_TO_CHECK_FOR = 500;
	static int numberOfFactors = 0;
  
	public static int checkFactors(int number){
	  
	    int sqrt = (int) Math.sqrt((double) number);
	    if(number % Math.sqrt((double) number) == 0) numberOfFactors++;
	    
	    for(int i = sqrt - 1; i > 0; i--){
	      
	      if((number % i) == 0) numberOfFactors += 2;
	      else continue;
	      
	    } return numberOfFactors;
	 }
  
	public static void main(String[] args){
    
		int triangleNumber = 0;
    
	    for(int i = 1; i < AMMOUNT_OF_TRIANGLE_NUMBERS_TO_CHECK; i++){
	    	
	    	triangleNumber += i;
	    	
	    	if(checkFactors(triangleNumber) >= NUMBER_OF_FACTORS_TO_CHECK_FOR){
	    		System.out.println("Triangle Numbers " + triangleNumber);
	    		System.out.println("Number of Factors " + numberOfFactors + "\n");
	        break;
	        
	    	} else numberOfFactors = 0;
	    }
	}
}
