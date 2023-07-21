import java.util.*;

public class Tdarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row ");
        int row =sc.nextInt();
        System.out.print("Enter no of col ");
        int col =sc.nextInt();
        int arr[][]=new int[row][col];
        inp(arr,row,col);
        pro2(arr,row,col);
        
        
    }
    public static void inp(int arr[][],int row ,int col){

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter Element "+i+""+j+":");
                arr[i][j]=sc.nextInt();
            }
        }

    }
    public static void  display(int arr[][],int row ,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static int sum(int arr[][],int row ,int col){
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
        }
        return sum ;

    }
    public static void sumrow(int arr[][] ,int row ,int col){
        int sum=0; 
        for(int i=0;i<row;i++) {
         for(int j=0;j<col;j++)
             {
         sum+=arr[i][j];
             }
         System.out.println("The Sum of row "+i+":"+sum);
         
             }
            sum =0;
            
            }
    public static int sumDia(int arr[][],int row,int col){
        int sum=0;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++)
            {
            if(i==j) {
            sum+=arr[i][j];
            }
            }
            //System.out.println(sum);
            }
            return sum;
            
            }
            public static void upTri(int arr[][],int row,int col){
                System.out.println("-----------------------Upper Triangle matrix--------------------------");

                for(int i=0;i<row;i++) {
                    for(int j=0;j<col;j++)
                    {
                    if(i>j) {
                    System.out.print("  ");
                    }
                    else
                    System.out.print(arr[i][j]+" ");
                    }
                    System.out.print("\n");
                    }
                    
            }
            public static void lowTri(int arr[][],int row,int col){
                System.out.println("-----------------------Lower Triangle matrix--------------------------");
                for(int i=0;i<row;i++) {
                    for(int j=0;j<col;j++)
                    {
                    if(i<j) {
                    System.out.print("  ");
                    }
                    else
                    System.out.print(arr[i][j]+" ");
                    }
                    System.out.print("\n");
                    }
            }
            public static int[][] adj(int arr[][],int row ,int col ){
                int temp [][]=new int[row][col];
                for(int i=0;i<row;i++) {
                    for(int j=0;j<col;j++)
                    {
                        if(i==j){
                            temp[0][0]=arr[1][1];
                            temp[1][1]=arr[0][0];
                        }
                        else{
                            temp[i][j]=-arr[i][j];
                        }
                    }
            }
            // display(temp, row, col);
            return temp;
           
        }
        

        
        public static float[][] inverse(int arr[][],int row,int col){
            float inverse [][]=new float[row][col];
            int ad =arr[0][0]*arr[1][1];
            int bc =arr[0][1]*arr[1][0];
            int det=ad-bc;
            System.out.println("Det"+det);
        
            if (det>0){

                for (int i=0;i<row;i++){
                    for(int j=0;j<col;j++)
                    {
                        inverse[i][j]= (float)1/det*(float)adj(arr, row, col)[i][j];
                    }

            }

        }
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
                System.out.print(inverse[i][j]+" ");
            }
            System.out.println();


    }
        
        return inverse;
    }
    public static void starpat(int arr[][],int row,int col){
// 1 2 3      6 * 8 
// 4 5 6 o/p  * 5 * 
// 7 8 9     12 * 14 

        int mid = arr[row/2][col/2];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                if(i==row/2&&j==col/2){
                    System.out.print(arr[i][j]+" ");

                }
                else{
                    if(i==row/2||j==col/2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print((arr[i][j]+mid)+" ");
                    }
                }
            }
            System.out.println();
        }


    }
    public static void pat2(int arr[],int row,int col){
        // 5 1 3       3 * 6 
        // 11 1 6 o/p 24 * 30
        // 17 1 9      63 * 30
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                if(j==col/2){
                    System.out.print("*");
                }
                else {
                    
                }
            }
        }
    }

    public static void pro2(int arr[][],int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j+=2){
                System.out.print(arr[i][j]+" ");
                if((arr[i][j]>0)&&(arr[i][j])<10){
                    System.out.print("S ");
                    
                }
                else {
                    System.out.print("D ");
                }
 
            }
            System.out.println();
        }

    }

    
}
            

         
    
