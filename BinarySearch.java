import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {100,200,300,400,500};
		System.out.println("Element to be found: ");
		int key=sc.nextInt();

		int start=0;
		int end=arr.length-1;
		int flag=0;

		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==key) {
				System.out.println("Element at index: "+mid);
				flag=1;
				break;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		if(flag==0) {
			System.out.println("Element not found");
		}
	}
}
