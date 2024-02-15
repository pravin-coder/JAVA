import java.util.Scanner;
class sample23{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=input.nextInt();
		int i,count=0;
		for(i=1;i<=n;i++){
			if(n%i==0){
				count=count+1;
			}
		}
		System.out.println("The number of factors is: "+count);
	}
}