package DevelopmentJava;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Exercise1 {

	 public static void main(String args[]) {
		CompareStr();
		BiggestNum();
		SortList();
		CountLenght();
		
	   }
	 
	 public static void CompareStr() {
		//Return type: String - Body: Comparison between 2 words - Parameters : 2 strings.
		 String word1, word2;
	        Scanner sc = new Scanner(System.in);
	        try {
	        	System.out.println("Enter First word: ");
		        word1 = sc.next();
		        
		        System.out.println("Enter Second word: ");
		        word2 = sc.next();
		        
		        
		        if( word1.equals(word2)) {
		        	System.out.println("The two words are the same ");
		        }
		        else 
		        	throw new Exception();
	
	        }
	        catch(Exception e) {
	        	System.out.println("The two words are not the same");
	        }
    	
	   }
	 public static void BiggestNum() {
		 //Return type: Bool - Body: Verify the biggest number in a list - Parameters: List/Array of integers.
		 int[] myArray;
		 myArray=new int[5];
		 int len1=myArray.length;
		 int i;
		 Scanner sc2 = new Scanner(System.in);
		 for(i=0; i<len1; i++) {
			 
		        	System.out.println("Enter the "+ i + " number");
			        myArray[i] = sc2.nextInt();
			        
		 }
		 
		int max = myArray[0];
		for(i = 0; i < len1; i++)
        {
            if(max < myArray[i])
            {
                max = myArray[i];
            }
        }
        System.out.println("The biggest number is: "+max);
	 }
	 
	 public static void SortList() { 
		// Return type: void - Body: Sort a list by asc and desc order - Parameters: List/Array of strings.
		 String[] myStrArray;
		 myStrArray=new String[5];
		 int len1=myStrArray.length;
		 Scanner sc3 = new Scanner(System.in);
		 for(int i=0; i<len1; i++) {

		        	System.out.println("Enter the "+ i + " String");
			        myStrArray[i] = sc3.next();
		 }
		
		   Arrays.sort(myStrArray); 
		   System.out.println("ASC ORDER");
		   for(String s : myStrArray)
			      System.out.println(s);

		   Arrays.sort(myStrArray, Collections.reverseOrder());
		   System.out.println("DSC ORDER");
		   for(String s : myStrArray)
			      System.out.println(s);
	 }
	 public static void CountLenght() { 
			//Return type: int - body: Count the length of a string - Parameters: String
	String Str1;
	Scanner sc4 = new Scanner(System.in);
	System.out.println("Enter the String");
	Str1 = sc4.next();
	
	char[] a= Str1.toCharArray();
	System.out.println("The length of a string " + a.length);
	
		 }

	 
}
