import java.util.Scanner;
class sample2{
    public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st sentence: ");
		String word1=input.nextLine();
		System.out.println("Enter the 2st sentence: ");
		String word2=input.nextLine();
		for (int i=0;i<word1.length();i++){
		if (word1.charAt(i)==word2.charAt(i)){
			System.out.println("valid sentences");
		}
		else{
			System.out.println("invalid sentences");
		}	
		}
	}
}	
	