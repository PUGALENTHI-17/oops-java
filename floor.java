package assement4;

import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num[]=new int [5];
        for(int i=0;i<5;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<=10;i++){
            System.out.println("Number"+i+"------------------->ceil is "+ceil(i, num)+", floor is "+floor(i, num));
        }
    }
    public static int ceil(int x,int arr[]){
        for(int i=0;i<5;i++){
            if(x>=arr[i]){
                return arr[i];
            }
        
            
        }
        return -1;
        
        
        
    }
    public static int floor(int x,int arr[]){
        for(int i=5;i<=0;i--){
            if(x<=arr[i]){
                return arr[i];
            }
            
        }
        return -1;
        
        
    }
}