import java.util.Scanner;

public class Rathinam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int pos =sc.nextInt();
        String op1=sc.next();
        String op2=sc.next();
        String temp[] =s.split(" ") ;
        String d=" ";
        for(int i=0;i<temp.length;i++){
            if(i==pos){
                System.out.print("__________");
            }
            else{
                System.out.println(temp[i]+" ");
            }
        }
        System.out.println("a. "+op1);
        System.out.println("b. "+op2);
        char op = sc.next().charAt(0);
        if(op=='a'){
             d=op1;

        }
        if(op=='b'){
            d=op2;
        }
        s.replace(temp[pos], d);
        System.out.println(s);


    }
}
