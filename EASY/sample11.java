import java.util.Scanner;
class sample11{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int m,n,i,j;
		System.out.println("Enter the number of rows: ");
		m=input.nextInt();
		System.out.println("Enter the number of coloumns: ");
		n=input.nextInt();
		int mat1[][]=new int[m][n];
		int mat2[][]=new int[m][n];
		int sum[][]=new int[m][n];
		System.out.println("Enter the elements of first matrix: ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat1[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the elements of Second matrix: ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat2[i][j]=input.nextInt();
			}
		}
		System.out.println("The sum of two matrixes is: ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				sum[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
