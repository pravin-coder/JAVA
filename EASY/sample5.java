import java.util.Scanner;
class sample5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the num 1: ");
		int num1=input.nextInt();
		System.out.println("Enter the num 2: ");
		int num2=input.nextInt();
		int a=num1,b=num2;
		while (num2!=0){
			int rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		int gcd=num1;
		int lcm=(a*b)/gcd;
		System.out.println("The lcm of the two numbers: "+lcm);
		System.out.println("The gcd of the two numbers: "+gcd);
	}
}
		