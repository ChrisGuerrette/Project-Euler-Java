public class Fibonacci{
	
	public static boolean isEven(int number){
		
		if(number % 2 == 0) return true;
		else return false;
	}
	
	public static void main(String[] args){
		
		int previousFibanocci = 1;
		int nextFibanocci = 0;
		int sum = 0;
		
		for(int currentFibanocci = 1; currentFibanocci <= 4000000; previousFibanocci = currentFibanocci, currentFibanocci = nextFibanocci){
			if(isEven(currentFibanocci)) sum += currentFibanocci;
			nextFibanocci = currentFibanocci + previousFibanocci;
		}
		
		System.out.println(sum);
	}	
}
