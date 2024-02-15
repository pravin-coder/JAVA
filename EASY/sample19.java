import java.util.Scanner;
class sample19{
	public static void main(String args[]){
		int i,j,k,temp,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=input.nextInt();
		System.out.println("Enter the elements :");
		int arr[]=new int[n];
		for(i=0;i<n;i++){
			arr[i]=input.nextInt();
			sum+=arr[i];
		}
		int mean=sum/n;
		System.out.println("The Mean is: "+mean);
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Meadian is : "+arr[n/2]);
	}
}