import java.util.Scanner;
class sample9{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n1=0,n2=1,n3,sum=1,target=0;
		System.out.print("Enter the number of terms:" );
		target=input.nextInt();
		target=target*2;
		System.out.println("Fibonacci Series:");
		if (target>2){
			System.out.print(+n1+" , "+n2);
			for(int i=3;i<=target;i++){
				n3=n1+n2;
				System.out.print(" , "+n3);
				n1=n2;
				n2=n3;
				if(i%2==0){
					sum+=n3;
			}
		}
		System.out.println("Sum of even terms: "+sum);
	}
}
}			