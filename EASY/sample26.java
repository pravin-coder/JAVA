import java.util.Scanner;
class sample26{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str=input.nextLine();
		char vow[]=new char[str.length()];
		int v=0;
		char cons[]=new char[str.length()];
		int c=0,i;
		for(i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'){
				vow[v++]=str.charAt(i);
			}
			else{
				cons[c++]=str.charAt(i);
			}
		}
		System.out.print("The vowels: ");
		for(i=0;i<v;i++){
			System.out.print(" "+vow[i]);
		}
		System.out.println();
		System.out.print("The Consonants: ");
		for(i=0;i<c;i++){
			System.out.print(" "+cons[i]);
		}
	}
}