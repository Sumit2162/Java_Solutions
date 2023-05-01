
public class Armstrong_N_Number {
    public static void main(String[] args) {
		int num=153;
		int num1 = num;
		int count = 0;
		int result=0;
		int temp=num;
		while(num1!=0) {
			count++;
			num1 = num1/10;
		}
		while(num!=0) {
			int rem=num%10;
			result+=Math.pow(rem, count);
			num=num/10;
		}
		if(result==temp) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
	}
}
