import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++){
	    arr[i]=sc.nextInt();
	    }
	     BubbleSort(arr);
	}
	public static void BubbleSort(int[] arr){
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}