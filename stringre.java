package march11;

import java.util.Scanner;

public class stringre {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in) ;
       String a =sc.nextLine();
       String temp[]=a.split(" ");
       for(int i=temp.length-1;i>=0;i--){
           System.out.print(temp[i]+" ");  

       }

    }
    
}
