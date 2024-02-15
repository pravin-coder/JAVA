import java.util.Scanner;
class sample10{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the starting limit: ");
		int m=input.nextInt();
		System.out.println("Enter the Ending limit: ");
		int n=input.nextInt();
		System.out.println("Enter the number of charecters you want to skip: ");
		int k=input.nextInt();
		k=k+1;
		System.out.println("The Numbers are:  ");
		while(m<n){
			m=m+k;
			System.out.print(" "+m);
		}
	}
}