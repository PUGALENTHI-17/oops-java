package march11;

import java.util.Scanner;

public class bulb {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        //         for (int i = 0; i < n; i++) {
//             if (arr[i]==0) {
//                 arr[i]=1;
//                 count++;
//             }
//             else if(arr[i]==1){

//             }
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == 1 && count%2==0)
                
                continue;
 
            else if(arr[i] == 0 && count%2!=0){

                continue;
            }
 

            else if (arr[i] == 1 && count%2!=0 )
            {

                count++;
            }
 
            else if (arr[i] == 0 && count%2==0)
            {
                count++;
            }
        }



            
//             for(int j=i+1;j<arr.length-1;i++){
//                 if(arr[j]==0){
//                     arr[i] =1;

//                 }
//                 if(arr[j]==1){
//                     arr[i]=0;
//                 }
                
//             }

                
// }
System.out.println(count);

            }

                
            }
        
