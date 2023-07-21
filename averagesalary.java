import java.util.Arrays;

/**
 * averagesalary
 */
public class averagesalary {

    public static void main(String[] args) {
        int arr[]={4000,3000,1000,2000};
        solution s=new solution();
       System.out.println(s.average(arr));
        
    }
}

/**
 * solution
 */
class solution {

    public double average(int[] salary){
        
        double min=salary[0],max=0;
        double sum=0.0;
        for (int i = 0; i < salary.length; i++) {
            min=Math.min(min, salary[i]);
            max=Math.max(max, salary[i]);
        }
        for (int i = 0; i < salary.length; i++) {
           if(salary[i]>min&&salary[i]<max){
                sum+=salary[i];
                System.out.println(i);
           }
        }
        return sum/(salary.length-2);

    }
}