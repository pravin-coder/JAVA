import java.util.Scanner;
class sample21{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int n=input.nextInt();
		System.out.println("enter the charecter: ");
		char ch=input.next().charAt(0);
		int i,j;
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}