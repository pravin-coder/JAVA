import java.util.Scanner;
class sample28{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r= input.nextInt();
		int i,j,k=1;
		for(i=1;i<=r;i++){
			for(j=1;j<=i;j++){
				System.out.print("   "+(k*k));
				k++;
			}
			System.out.println();
		}
	}
}