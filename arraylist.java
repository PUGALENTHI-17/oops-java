/* #!/usr/bin/java*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
class arraylist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> arr =new ArrayList<Integer>();
        for (int index = 0; index < 5; index++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);
        // for (Integer i : arr) {
        //     System.out.println(i);
        // }
        Iterator itr =arr.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());
        // }
        LinkedList <Integer> list = new LinkedList<Integer>();
    
    }
}
