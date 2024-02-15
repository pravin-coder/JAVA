import java.util.Scanner;
class sample8{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int p,n,si;
		System.out.println("Enter the principle: ");
		p=input.nextInt();
		System.out.println("Enter the number of years: ");
		n=input.nextInt();
		input.nextLine();
		System.out.println("Are you a Senior citizen: ");
		String ch=input.nextLine();
		if(ch.length() > 0 && (ch.charAt(0) == 'y' || ch.charAt(0) == 'Y')){
			si=(p*n*12)/100;
		}
		else {
			si=(p*n*10)/100;
		}
		System.out.println("Simple intrest : "+si);
	}
}
		    