import java.util.*;

class shift {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        
        int flips = countFlips(num1, num2);
        
        System.out.println("Total flips required: " + flips);
    }
    
    public static int countFlips(int num1, int num2) {
        int n = num1 ^ num2;  
        
        int flips = 0;
        while (n!= 0) {
            if ((n&1) == 1) {
                flips++;
            }
            n >>= 1;
        }
        
        return flips;
    }
}
    
