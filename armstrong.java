class Armstrong
{
    public static void main(String[] args) 
     {
        int n, count = 0,b, sum = 0;
        System.out.print("Armstrong numbers from 1 to 200:");
        for(int i = 1; i <= 200; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }}
  