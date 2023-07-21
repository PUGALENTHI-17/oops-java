package assement4;

import java.util.Scanner;

public class stringlen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       
        String str = sc.nextLine();
        String temp[]=str.split("\\s");
        String min=temp[0], max=temp[0];

        for(int i=0;i<temp.length;i++){
            if(temp[i].length()<min.length()){
                min=temp[i];
            }
            if(temp[i].length()>max.length()){
                max=temp[i];
            }

        }
        System.out.println("Smallest word: "+min+"\nLargest word:"+max);
    }
}
