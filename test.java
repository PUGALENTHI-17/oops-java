package assement4;
import java.util.*;

import java.util.*;

public class test {
    
	static void Dup(
	int arr[], int len)
	{
        int count = 1;
		boolean ifPresent = false;

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					if (al.contains(arr[i])) {
						break;
					}

					else {
						al.add(arr[i]);
						ifPresent = true;
					}
				}
			}
		}
        System.out.print("Repeated elements are :");

		if (ifPresent == true) {

			System.out.print(al + " ");
            count++;
		}
        System.out.println("Total repeated elements:"+count);
	}

	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        
		int n = arr.length;

		Dup(arr, n);
	}
}
