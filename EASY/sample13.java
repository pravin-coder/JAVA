import java.util.Scanner;
class sample13{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int i,j;
		String temp="";
		String arr[]={"Bannana","Apple","Orange","Mango","Gauva","Pineapple"};
		System.out.println("Enter your choice(A/D):" );
		char ch=input.next().charAt(0);
		if (ch=='A'){
			for(i=0;i<arr.length;i++){
				for(j=i+1;j<arr.length;j++){
					if((arr[i].compareTo(arr[j]))>=0){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		if (ch=='D'){
			for(i=0;i<arr.length;i++){
				for(j=i+1;j<arr.length;j++){
					if((arr[i].compareTo(arr[j]))<=0){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		for(i=0;i<arr.length;i++)
		    System.out.println(arr[i]);
	}
}