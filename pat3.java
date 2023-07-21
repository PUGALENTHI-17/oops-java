package pattern;
import java.util.*;
public class pat3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int Num = obj.nextInt();
		int row,col;
		for(row=1;row<=Num;row++,System.out.print("\n"))
		{
			for(col=1;col<=Num;col++)
				if((Num%2!=0) && (row==Num/2+1 && col==Num/2+1))
					System.out.print("0");
				else if((Num%2==0) && (row==Num/2 || row == Num/2+1) && (col==Num/2 || col == Num/2+1))
					System.out.print("0");
				else
					System.out.print("1");
		}
}
}

// 11111
// 11111
// 11011
// 11111
// 11111

