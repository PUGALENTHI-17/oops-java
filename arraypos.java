import java.util.*;

public class arraypos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        // int unit[]=new int[n];
        // int tens[]=new int[n];
        // int  hundreds[]=new int[n];
        // int  thousands[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int  x=sc.nextInt();
        for(int i=0;i<n;i++){
            unit[i] =arr[i]%10;
            tens[i]=(arr[i] /10) %10;
            hundreds[i]=(arr[i]/100)%10;
            thousands[i]=(arr[i]/1000)%10;

    }

    switch (x) {
        case 1:
            System.out.println(arr[maxPos(unit)]);
            break;
        case 2:
            System.out.println(arr[maxPos(tens)]);
            break;
        case 3:
            System.out.println(arr[maxPos(hundreds)]);
            break;
        case 4:
            System.out.println(arr[maxPos(thousands)]);
            break;
        default:
            break;
    }
    }

    public static int maxPos(int arr[]) {
        int max=arr[0],pos=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        return pos;
    }
}
