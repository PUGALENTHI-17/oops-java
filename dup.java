package assement4;

import java.util.Scanner;

public class dup {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        int temp[]=new int[10];
        int count=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j]){
                    temp[i]=arr[i];
                }
                
            }
        }
        
        System.out.print("Repeated elements are :");
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(temp[i]!=temp[j]){
                    System.out.println(temp[i]);
                    count++;
            
                }
            
                
            }
        }
        System.out.println("Total repeated elements:"+count);
}
}
