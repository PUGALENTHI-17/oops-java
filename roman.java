import java.util.Scanner;

public class roman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(romanToInt(sc.next()));
    }
    public static void inttoroman(int num) {
        int amount[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < amount.length; i++) {
            while (num-amount[i]>=0) {
                str.append(roman[i]);
                num=num-amount[i];
            }
        } 
        System.out.println(str);
    }

    public static int values(int r) {
        if (r == 'I')   
        return 1;   
      if (r == 'V')   
        return 5;   
      if (r == 'X')   
        return 10;   
      if (r == 'L')   
        return 50;   
      if (r == 'C')   
        return 100;   
      if (r == 'D')   
        return 500;   
      if (r == 'M')   
        return 1000;   
      return -1;   
    }
    public static int romanToInt(String s) {
        int total=0;
        
        for (int i = 0; i <s.length() ; i++) {
            int s1 =values(s.charAt(i));

            if(i+1<s.length()){
                int s2=values(s.charAt(i+1));
                if (s1>=s2) {
                    total =total+s1;
                    
                }
                else{
                    total =total-s1;
                }
            }
            else{
                total = total+s1;
            }
            
        }
        return total;
    
}

}
