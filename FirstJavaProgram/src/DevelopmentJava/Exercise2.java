package DevelopmentJava;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Exercise2 {

	public static void main(String args[]) {
		SmallestNumber();
		HashMap();
	 }
	public static void SmallestNumber() {
		//Return type: void - Body: Iterate trough an Array and print the smallest number - Parameters: Array of integers.
		int[] myArray;
		 myArray=new int[5];
		 int i;
		 int len1=myArray.length;;
		 Scanner sc = new Scanner(System.in);
		 for(i=0; i<len1; i++) {

		        	System.out.println("Enter the "+ i + " number");
			        myArray[i] = sc.nextInt();
		 }
		 sc.close();
	      Arrays.sort(myArray);
	      int res = myArray[0];
	      System.out.println("The smallest number is:"+res);
	}
	public static void HashMap() {
		//Return type: void - Body: Iterate trough a HashMap and print the value based on the Key - Parameters: None.
		Map<Integer, String>map1 = new HashMap<Integer, String>();
		map1.put(21, "Elizabeth");
		map1.put(32, "Daniel");
		map1.put(123, "Pablo");
		Set<Integer> setofKeys = map1.keySet();
		java.util.Iterator<Integer> iterator = setofKeys.iterator();
		while(iterator.hasNext()){
			int key= (int)iterator.next();
			String value =(String)map1.get(key);
			System.out.println("Key: "+key +" Value: "+ value );
	
	}
}
}
