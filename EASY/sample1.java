import java.util.Scanner;
class sample{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string:");
		String word= input.nextLine();
		String rev_word="";
		int i,j=0;
		for (i=word.length()-1;i>=0;i--){
			rev_word+=word.charAt(i);	
	}
	System.out.println(rev_word);
}
}