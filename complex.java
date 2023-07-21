import java.text.BreakIterator;
import java.util.Scanner;


class complex{
    public static void main(String args[]) {
        
    Scanner sc =new Scanner(System.in);
    complexop t=new complexop();
    int a =sc.nextInt();
    int b=sc.nextInt();
    int c= sc.nextInt();
    int d =sc.nextInt();
    t.sum(a, b, c, d);
    t.sub(a, b, c, d);
    t.mul(a,b,c,d);


    }
}

public class complexop {
    void sum (int a ,int b,int c ,int d ){
        System.out.println((a+c)+"+"+(b+d)+"i");
    }
    void sub(int a ,int b,int c ,int d ){
        System.out.println((a-c)+"+"+(b-d)+"i");
    }
    void mul(int a ,int b,int c ,int d ){
        System.out.println((a * c - b* d) + "+" +
			(a * d + b * c) + "i");
    }
	
    }



