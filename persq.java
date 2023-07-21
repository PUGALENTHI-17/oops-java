package assement4;

import java.util.Scanner;

public class persq {
    public static void main(String[] args) {
        double sq;
        int count=0;
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
             sq =Math.sqrt(arr[i]);
             if(sq*sq==arr[i]){
                count++;
             }
        }
        System.out.println(count);
    }
}
