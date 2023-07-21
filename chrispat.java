package pattern;
import java.util.Scanner;

public class chrispat {
  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the height of the Tree: ");  
//reads height of the tree  
int h = sc.nextInt();  
System.out.print("Enter the width of the Tree: ");  
//reads width of the tree  
int w = sc.nextInt();  
//calculates spaces  
int space = w*5;  
int x = 1;  
for(int a = 1; a <= h; a++)  
{  
for(int i = x; i <= w; i++)  
{  
//loop for space  
for(int j = space; j >= i; j--)  
{  
System.out.print(" ");  
}  
for(int k = 1;k <= i;k++)  
{  
System.out.print("* ");  
}  
System.out.println();  
}  
x = x+2;  
w = w+2;  
}  
for(int i = 1; i <= 4; i++)  
{  
for(int j = space-3; j >= 1; j--)  
{  
//prints spaces  
System.out.print(" ");  
}  
//loop to print t star  
for(int k= 1; k <= 4; k++)  
{  
System.out.print("* ");  
}  
//throws cursor to the next line  
System.out.println();  
}  
}  
}  

