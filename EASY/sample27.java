import java.util.Scanner;
class sample27{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=input.nextInt();
		System.out.println("The fibbonacci series: ");
		int i,j,a=0,b=1,c;
		System.out.print(" "+a+" "+b);
		for(i=3;i<=n;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}