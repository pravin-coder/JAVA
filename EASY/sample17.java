import java.util.Scanner;
class sample17{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int m,n,i,j,c;
		System.out.println("Enter the starting limit: ");
		m=input.nextInt();
		System.out.println("Enter the ending limit: ");
		n=input.nextInt();
		System.out.println("The composite numbers are: ");
		for(i=m;i<n;i++){
			c=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c!=2){
				System.out.print(" "+i);
			}
		}
	}
}