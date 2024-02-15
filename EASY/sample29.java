import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class sample29{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n=input.nextInt();
		int arr[]=new int[n];
		int vis[]=new int[n];
		System.out.println("Enter the elements: ");
		int i,j,k=0,count;
		for(i=0;i<n;i++){
			arr[i]=input.nextInt();
		}
		for(i=0;i<n;i++){
			count=0;
			for(j=0;j<n;j++){
				if(arr[i]==vis[j]){
					count++;
				}
			}
			if(count==0){
				vis[k]=arr[i];
				k++;
			}
		}
		System.out.println("NUMBER || FREQUENCY");
		for(i=0;i<k;i++){
			count=0;
			for(j=0;j<n;j++){
				if(vis[i]==arr[j]){
					count++;
				}
			}
			System.out.println("  "+vis[i]+"   ===   "+count);
		}
	}
}