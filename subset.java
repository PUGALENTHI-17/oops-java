import java.util.Arrays;
import java.util.Scanner;

/**
 * subset
 */
public class subset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int  arr[]=new int[n];
        int sum=0,sum1=0,temp=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (temp==arr[j]) { 
                    
                    arr[i]=0;
                    arr[j]=0;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                sum+=arr[i];
            }
            else{
                sum1+=arr[i];
            }
            
        }
        System.out.println(sum1-sum);
    
    
    }
}