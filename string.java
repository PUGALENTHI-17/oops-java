import java.util.*;

public class string {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        String s1 = sc.nextLine();
        // System.out.println("length="+len(s1));
        // System.out.println("vow="+vow(s1));
        // dupWord(s1);
        // wordRev(s1);
        // startCase(s1);
        // vowToCap(s1);
        // removefirst(s1);
        // reverseWord(s1);
        strcount(s1);
        // System.out.println(strRotate(s1));
    }
    public static int len (String a ){
        return a.length();
        }
    
    public static int vowels(String a ){
        a= a.toLowerCase();
        int count = 0;
 
       
         for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e'
                || a.charAt(i) == 'i'
                || a.charAt(i) == 'o'
                || a.charAt(i) == 'u') {
                count++;
            }
        }return count;
    }
    public static void dupWord(String a ){       
                String temp[] = a.split(" ");    
                for(int i = 0; i < temp.length; i++) {    
                    for(int j = i+1; j < temp.length; j++) {    
                        if(temp[i].equals(temp[j])) {    
                            System.out.println(temp[i]);        
  
                            }    
                    }    

                }    
            }
    public static void wordRev(String a ){
                String temp[]=a.split(" ");
                for(int i=temp.length-1;i>=0;i--){
                    System.out.print(temp[i]+" ");  

                }
            
            }  
    public static void consonents(String s){
        char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='a'||arr[i]=='A'||arr[i]=='e'||arr[i]=='E'||arr[i]=='i'||arr[i]=='I'||arr[i]=='o'||arr[i]=='O'||arr[i]=='u'||arr[i]=='U') {
				continue;
			}
			else {
				System.out.print(arr[i]);
			}
			
			
		}
		
    }  
    public static void uCase(String s){
        char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>=65 && arr[i]<=91)) {
				System.out.print(arr[i]);
			}
		}
		

    }
    public static void lCase(String s){
        char arr[]=s.toCharArray();
		char temp1[]= new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if((arr[i]>=97 && arr[i]<=122)) {
				temp1[i]=arr[i];
			}
		}
		Arrays.sort(temp1);
		for(char ele:temp1) {
			System.out.print(ele);
		}

    }
    public static void copy(String s){
        char arr[]=s.toCharArray();
		char temp[]=new char[arr.length];
		for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i];
		}
		for(char ele:temp) {
			System.out.print(ele);
		}
    }
    public static void sort(String s){
        char arr[]=s.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
    }
    public static void subReplace(String s){
        String sub=sc.nextLine();
        String replace=sc.nextLine();
        System.out.println(s.replace(sub, replace));
    }
    public static void startCase(String s){
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                int j=arr[i];
                arr[i]=(char)(j-32);
            }
            if(arr[i]==' ')
            {
                int j=arr[i+1];
                arr[i+1]=(char)(j-32);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(arr[i]);
        }
    }   
    // Maventic Training 
    public static void vowToCap(String s){
        char arr[]=s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                || s.charAt(i) == 'i'
                || s.charAt(i) == 'o'
                || s.charAt(i) == 'u') {
                int j=arr[i];
                arr[i]=(char)(j-32);

            }
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(arr[i]);
        }
        
    }

    public static void removefirst(String s){
        String sub=sc.next();
        System.out.println(s.replaceFirst(sub,""));
    }

    public static boolean strRotate(String s ){
            int d=sc.nextInt();
            String test =sc.next();
            String ans = s.substring(d) + s.substring(0, d);
            System.out.println(ans);
            // String right =s.
           if (test.compareToIgnoreCase(ans)==0) {
             return true;
           }
           else{
            return false;
           }
    }  
    
    public static void reverseWord(String str){
        String words[]=str.split(" ");
        String reverse ="";
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverse =reverse+sb+" ";
            
        }
        System.out.println(reverse);
    }

    public static void strcount(String str){
        String words[] =str.split(" ");
        int count =0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    System.out.println(words[j]+" ");
                    words[j] ="";
                   count++;
                }
                
            }
        }
    }
    }



