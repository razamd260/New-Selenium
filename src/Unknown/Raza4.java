package Unknown;

import java.util.HashMap;
import java.util.Map;

public class Raza4 {
	public static void main(String[] args) {
		String s = "ahdgcsgjshxgdhsxgdb";
		int count=0;
     char[] ch=s.toCharArray();
     Map<Character, Integer> map=new HashMap<>();
     for(Character e:ch) {
    	 if(map.containsKey(e)) {
    		 count=map.get(e);
    		 map.put(e, count+1);
    	 }
    	 else {
    		 map.put(e, 1);    	 }
     }
     for(Map.Entry<Character, Integer> e:map.entrySet()) {
    	 System.out.println(e.getKey()+" "+e.getValue());
     }
	}
}
