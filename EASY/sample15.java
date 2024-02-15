import java.util.Scanner;
class sample15{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int n=input.nextInt();
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		for(i=1;i<n;i++){
			for(j=0;j<n-i;j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}