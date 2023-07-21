package apr22;

import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n-2; i++) {
            if (arr[i]-arr[i+2]>max) {
                max=arr[i]-arr[i+2];
            }
        }
        System.out.println(max);
    }
}
