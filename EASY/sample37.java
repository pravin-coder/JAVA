import java.util.Scanner;
class sample37{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=input.nextInt();
		int cpy=n;
		int ams=0,i,rem;
		while(n!=0){
			rem=n%10;
			ams+=(rem*rem*rem);
			n=n/10;
		}
		if(ams==cpy){
			System.out.println("the given number is an amstrong number: ");
		}
		else{
			System.out.println("the given number is not an amstrong number:");
		}
	}
}