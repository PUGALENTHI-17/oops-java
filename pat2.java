package pattern;

import java.util.Scanner;

public class pat2 {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
		int Num = obj.nextInt();
        for (int row =1;row<=Num;row++){
            for (int col=1;col<=row;col++){
                System.out.print("1");
                
            }
            for (int k = row*2; k <= Num*2-1; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= row; l++)
            {
                System.out.print("1");
            }
            System.out.print("\n");
        }
        for (int row =1;row<Num;row++){
            for (int col=Num;col>row;col--){
                System.out.print("1");
            }
            for (int k = row*2; k >=1; k--)
            {
                System.out.print(" ");
            }
            for (int l = Num-1; l >= row; l--)
            {
                System.out.print("1");
            }
            System.out.print("\n");
            
        }

    }
    
}
