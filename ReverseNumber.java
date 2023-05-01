
public class ReverseNumber {
     public static void main(String[] args) {
		int num=2162;
		int result =0;
		while(num!=0) {
			int rem= num%10;
			num=num/10;
			result = result*10+rem;
		}
		System.out.println("Reverse number is: "+result);
	}
}
