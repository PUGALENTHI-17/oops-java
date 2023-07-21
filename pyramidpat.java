package pattern;
import  java.util.*;

public class pyramidpat {
    
        public static void main(String[] args) {
    
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
    
            for (int i = 0; i < n; i++) {
    
                // for (int j = 0; j > i; j++){
                //     System.out.print("  ");
                // }
    
                for (int j = i; j >= 0; j--){
                    System.out.print(j+" ");
                }
    
                for (int l = 1; l <= i; l++) {
                    System.out.print(l+" ");
                }
                System.out.println();

            }
    
        }
    }

