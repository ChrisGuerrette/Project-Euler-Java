import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Tests {
	
	public static ArrayList<Long> primeFactors = new ArrayList<Long>();
	
	public static boolean checkIfPrime(long number){
		
		//Common numbers that are factors
		if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0) return false;
		
		long sqrt = (long) Math.sqrt((double) number);
		
		for(long i = sqrt; i > 5; i--){
			if(number % i == 0) return false;
		} 
		
		return true;
	}
	
	public static void getFactors(long number){
		
		long sqrt = (long) Math.sqrt((double) number);
		
		for(long i = sqrt; i > 0; i--){
			if(number % i == 0){
				if(checkIfPrime(i)) primeFactors.add(i);
				if(checkIfPrime(number / i)) primeFactors.add((number / i));
			}
		}
	}
	
	public static void main(String[] args){
		
		getFactors(600851475143l);
		Collections.sort(primeFactors);
		System.out.println(primeFactors.get(primeFactors.size() - 1));
	}
}
