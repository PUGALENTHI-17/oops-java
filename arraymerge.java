import java.util.Scanner;

public class arraymerge {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=0;
        int arr[]={1,2,4,7,9,12};
        int arr1[]={5,6,1,8,4,0};
        int merge[]=new int[arr.length+arr1.length];


        for (int i = 0; i < arr.length; i++) {
            merge[n++]=arr[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            merge[n++]=arr1[i];
        }

        for (int i = 0; i < merge.length; i++) {
            int j;
            for ( j = 0; j < i; j++) {
                if (merge[i] == merge[j])
                break;
        }
            if (i == j){
            System.out.print( merge[i] + " ");
            }

        }
        }  
    }

