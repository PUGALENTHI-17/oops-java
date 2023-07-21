import java.util.*;

class array
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int size = sc.nextInt();
        int arr[]=new int[size];
        int arr1[]=new int [size];
        inp(arr,size);
        inp(arr1,size);
        crossMul(arr, arr1, size);
    
    }
    public static void inp(int arr[],int n) {
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
    }
    public static void crossMul(int arr[],int arr1[],int n){
        int temp=0;
        for(int i=0;i<n;i++){
           if(i==n/2){
            continue;
           }
           else{
            temp = arr1[i];
            arr1[i]=arr[i+1];
            arr1[i+1]=temp;
            i=i+1;
           }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]*arr1[i]+" ");
        }
    }


}