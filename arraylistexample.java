import java.util.*;
public class arraylistexample{
public static void main(String args[]){ 
ArrayList<String> obj = new ArrayList<String>();
Scanner in =new Scanner(System.in);
Scanner ins = new Scanner(System.in);
int c,ch;
int i;
String str; 
do{
System.out.println("STRING MANIPULATION");
System.out.println("**********");
System.out.println(" 1. Append at end \t 2.Insert at particular index \t 3.Display ");
System.out.println("Enter the choice ");
c= in.nextInt();
switch(c){
case 1:{
System.out.println("Enter the string ");
str=ins.nextLine();
obj.add(str);
break;
}
case 2:{
System.out.println("Enter the string ");
str=ins.nextLine();
System.out.println("Specify the index/position to insert");
i=in.nextInt();
obj.add(i-1,str);
System.out.println("The array list has following elements:"+obj);
break;
}
case 3:{
System.out.println("The array list has following elements:"+obj);
break;
} }
System.out.println("enter 0 to break and 1 to continue");
ch=in.nextInt();
}while(ch==1);
}
}