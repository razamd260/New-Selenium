package Unknown;



public class Raza3 {
    public static void main(String[] args) {
		String s="gulamrazaahmed";
		String s1="";
		int j,i;
		for(i=0;i<s.length();i++) {
			for(j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					break;
					}
				}
		if(i==j) {
			s1=s1+s.charAt(i);
		    }
		}
		for(i=0;i<s1.length();i++) {
			int count=0;
			for(j=0;j<s.length();j++) {
				if(s1.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
	       if(count==1) {
	    	   System.out.println(s1.charAt(i));
	       }
	
		}
    
    }
}
