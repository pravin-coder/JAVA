import java.util.Scanner;
class sample14{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int m,n,i,j,k;
		System.out.println("Enter the number of rows: ");
		m=input.nextInt();
		System.out.println("Enter the number of coloumns: ");
		n=input.nextInt();
		int mat1[][]=new int[m][n];
		int mat2[][]=new int[m][n];
		int mul[][]=new int[m][n];
		System.out.println("Enter the elements in matrix1 : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat1[i][j]=input.nextInt();
			}
		}
		System.out.println("Enter the elements in matrix2 : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mat2[i][j]=input.nextInt();
			}
		}
		System.out.println("The multiplication of two matrixes are: ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				mul[i][j]=0;
				for(k=0;k<n;k++){
					mul[i][j]+=mat1[i][k]*mat2[k][j];
				}
				System.out.print(" "+mul[i][j]);
			}
			System.out.println();
		}
	}
}