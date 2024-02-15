import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class sample33{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements: ");
		int i,j,comp=0,count;
		for(i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		for(i=0;i<n;i++){
			count=0;
			for(j=1;j<=arr[i];j++){
				if(arr[i]%j==0){
					count++;
				}
			}
			if(count>2){
				comp++;
			}
		}
		System.out.println("The Number of composite numbers are : "+comp);
	}
}
