import java.util.Scanner;
class sample22{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the date(DD/MM/YYYY): ");
		String arr=input.nextLine();
		String date[]=arr.split("/");
		int y=Integer.parseInt(date[2]);
		System.out.println(y);
		if((y%4==0)&&(y%100!=0)||(y%400==0)){
			System.out.println("It is a leapyear");
		}
		else{
			System.out.println("It is a non leapyear");
		}
	}
}
