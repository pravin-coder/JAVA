import java.util.Scanner;
class sample16{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int i,count=0;
		System.out.println("Enter any string: ");
		String s=input.nextLine();
		for(i=0;i<s.length();i++){
			char ch = s.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
				System.out.print(" "+s.charAt(i));
				count++;
			}
		}
		System.out.println("Number of special characters: "+count);
	}
}