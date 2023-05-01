
public class CountZero {

	public static void main(String[] args) {
         int num=10070;
         int count=0;
         while(num!=0) {
        	int rem=num%10;
        	num=num/10;
         
         if(rem==0) {
        	 count++;
         }
         }
    	 System.out.println("Total Zeros is: "+count);

	}

}
