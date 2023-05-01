
public class ArmStrongA_Range {
     public static void main(String[] args) {
    	 int min = 100;
         int max = 1000;
         int count =0;
		for(int i=min;i<max;i++) {
			int num=i;
			int result =0;
			int temp= num;

		while(num!=0) {
			int rem=num%10;
			num =num/10;
			result +=Math.pow(rem, 3);
		}

		if(result == temp) {
			System.out.println("Number is Armstrong: "+result);
		}
		}
	}
}
