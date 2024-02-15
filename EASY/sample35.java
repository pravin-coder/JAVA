import java.util.Scanner;
class sample35{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=input.nextLine();
		System.out.println("Enter the charecter: ");
		char ch=input.next().charAt(0);
		int i;
		for(i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				System.out.println("The requested charecter is found in "+i +"th index");
			}
		}
	}
}
