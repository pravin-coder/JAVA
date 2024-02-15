import java.util.Scanner;
class sample39{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str=input.nextLine();
		char cons[]=new char[str.length()];
		int i;
		System.out.println("the string without vowels:");
		for(i=0;i<str.length();i++){
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u'&&str.charAt(i)!='A'&&str.charAt(i)!='E'&&str.charAt(i)!='I'&&str.charAt(i)!='O'&&str.charAt(i)!='U'){
			System.out.print(str.charAt(i));
			}
	    }
	}
}