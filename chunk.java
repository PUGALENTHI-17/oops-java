import java.util.*;

public class chunk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        ArrayList<Integer> li =new ArrayList<Integer>();
        
        for (int i = 0; i < n ;i++) {
            arr[i]=sc.nextInt();
        }
        int s =sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            int j =s;
           while (j>0) {
            li.add(arr[i]);
            j--;
            
           }
             
        }
        System.out.println(li);
    }
}
