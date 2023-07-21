import java.util.Scanner;

/**
 * password
 */
public class password {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pass =sc.nextLine();
        int count =0;
        boolean len=false,upper=false,digit=false,symbol=true;

        if (pass.length()>=8) {
            // System.out.println("len:"+pass.length());
            len=true;
            for (int i = 0; i < pass.length(); i++) {
                if(Character.isUpperCase(pass.charAt(i))){
                    // System.out.println("Contains upper case ");
                    upper=true;
                    if (!Character.isLetter(pass.charAt(i))&&!Character.isDigit(pass.charAt(i))) {
                        // System.out.println("Contain symbols ");
                        symbol=false;
                        if(Character.isDigit(pass.charAt(i))){
                            count++;
                            if (count>=2) {
                                // System.out.println("Contains digit:");
                                digit=true;
                                System.out.println("Verified");
                            }
                
            }
            
            
        }
        else{
            System.out.println("Not Verified");
        }



        // if (len==true && symbol==true&&digit==true&&upper) {
        //     System.out.println("Verified");
        // }
        // else{
        //     System.out.println("Not verified");
        // }
    }
    
}