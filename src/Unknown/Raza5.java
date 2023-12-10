package Unknown;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Raza5 {
	public static void main(String[] args) {
		Map<String,Integer> a1=new HashMap<String, Integer>();
		a1.put("md", 1);
		String[] arr1=new String[a1.size()];
		int[] arr2=new int[a1.size()];
		Scanner sc=new Scanner(System.in);
		for(Map.Entry<String, Integer> a:a1.entrySet()) {
			
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=a.getKey();
				
			}
			for(int i=0;i<arr1.length;i++) {
				arr2[i]=a.getValue();
				
			}
			
		}
for(int i=0;i<arr1.length;i++) {
	System.out.println(arr1[i]+":"+arr2[i]);
}
	}

}
