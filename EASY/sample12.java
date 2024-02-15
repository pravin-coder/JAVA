import java.util.Scanner;
class sample12{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the charecter: ");
		char s=input.next().charAt(0);
		System.out.println("Enter the Number of rows : ");
		int m=input.nextInt();
		System.out.println("Enter the Number of coloumns: ");
		int n=input.nextInt();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}