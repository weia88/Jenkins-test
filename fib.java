public class Fib{

int x = 5;

	public static void main(String[] args){
		int prev = -1;
		int result = 1;
		for(int i = 0, i <= x; i++){
			int sum = result + prev;
			prev = result;
			result = sum;	
		}	
		System.out.println(result);
	}	
}
