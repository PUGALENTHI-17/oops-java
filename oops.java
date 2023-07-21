import java.util.Scanner;

public class oops {
    static int a;
    oops(){
        Scanner sc =new Scanner(System.in);
        this.a=sc.nextInt();

    }
   public static void main(String[] args) {
     oops obj =new oops();
     System.out.println(a);
    
   } 
  public static void get(){
       Scanner sc =new Scanner(System.in);
       a=sc.nextInt();

   }
   
}