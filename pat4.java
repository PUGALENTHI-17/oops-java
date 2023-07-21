package pattern;
import java.util.*;

public class pat4 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int Num = obj.nextInt();
		int row,col;
		for(row=1;row<=Num;row++,System.out.print("\n"))
		{
			if(row%2==0)
				System.out.print(row+1);
			for(col=1;col<=Num;col++)
				System.out.print(row);
			if(row%2!=0)
				System.out.print(row+1);
		}
}
}
// 111112
// 322222
// 333334
// 544444
// 555556
