import java.util.Scanner;

public class buildingwater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];

        int len =n-2;
        // if(min<arr[n-1]){
        //     min=arr[n-1];
        // }
        System.out.println(len*min);


    
    }
    
}
