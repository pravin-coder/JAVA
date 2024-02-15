import java.util.Scanner;
class sample4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=input.nextInt();
		if(age>=18)
			System.out.println("you are eligible for voting");
		else
			System.out.println("you are Ineligible now ,please wait for next "+ (18-age) +"years to vote");
	}
}	