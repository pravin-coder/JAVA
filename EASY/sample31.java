import java.util.Scanner;
class sample20{
	public static void main(String args[]){
		try{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=input.nextInt();
		int i,fact=1;
		for(i=n;i>0;i--){
			fact=fact*i;
		}
		System.out.println("Factorial of n: "+fact);
	}
	
	catch(Exception n){
		System.out.println("invalid input");
	}
}
}