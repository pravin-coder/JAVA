import java.util.Scanner;
class sample24{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=input.nextInt();
		int i,factors=0;
		for(i=1;i<num;i++){
			if(num%i==0){
				factors+=i;
			}
		}
		if(num==factors){
			System.out.println("It is the perfect number");
		}
		else{
			System.out.println("It is not a Perfect number");
		}
	}
}