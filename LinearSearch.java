import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[] = {500,600,200,400,100};
        System.out.println("Element to be found");
        int key=sc.nextInt();
        
        int start=0;
        int end=arr.length-1;
        int flag=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element at index: "+i);
                flag=1;
            }
        }
        
        if(flag==0){
            System.out.print("Element not found");
        }
    }
}