import java.util.Scanner;
class sample3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number");
		int num1=input.nextInt();
		int cpy=num1,rem=0,rev=0;
		while(num1!=0){
			rem=num1%10;
			num1=num1/10;
			rev=rev*10+rem;
		}
		System.out.println("Reversed number is: "+rev);
	}
}