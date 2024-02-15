import java.util.Scanner;
class sample25{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=input.nextLine();
		int vow=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				vow+=1;
			}
		}
		System.out.println("Number of vowels : "+vow);
	}
}