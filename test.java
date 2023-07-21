package march11;
import java.util.Scanner;

public class test {
        public int bulbs(int arr[])
        {
            int count = 0;
     
            for (int i = 0; i < a.size(); i++)
            {
                if (a.get(i) == 1 && count%2 == 0)
                    continue;
     
                else if(a.get(i) == 0 && count%2 != 0)
                    continue;
     
  
                else if (a.get(i) == 1 && count%2 != 0)
                {
                    count++;
                }
     
                else if (a.get(i) == 0 && count%2 == 0)
                {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args)
        {
            Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
            
     
            states.add(0);
            states.add(1);
            states.add(0);
            states.add(1);
     
            System.out.println() gfg.bulbs(states));
        }
    }  
}
