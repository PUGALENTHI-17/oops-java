import java.util.*;
class assesment {
    public static void main(String[] args) {
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row ");
        int size =sc.nextInt();
        int temp=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
        

            if(arr[i]<0){

                System.out.print(arr[i]+" ");
                
                
            }

        }
        for(int i=0;i<size;i++){
        

            if(arr[i]>0){

                System.out.print(arr[i]+" ");
                
                
            }
            
        }
    
    }
}