public class Fib{
	public static void main(String[] args){
		int x = 10;
		int prev = -1;
		int result = 1;
		String str = "";
		for(int i = 1; i <= x; i++){
			int sum = result + prev;
			if(str.isEmpty()){
				str = str + sum;
			} else {
				str = str + "," + sum;
			}
			prev = result;
			result = sum;	
		}	
		System.out.println(str);
	}	
}
