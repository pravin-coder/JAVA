import java.util.Scanner;
class sample34{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=input.nextInt();
		System.out.println("The "+n+" th odd number after "+n+ "th odd number: "+((2*n)-1));
	}
}