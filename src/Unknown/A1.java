package Unknown;

public class A1 {
         public static void main(String[] args){
		      int[] arr={2,3,5,5,3,5,2};
		      System.out.println(test(arr));
		     
		    }
		      public static Object test(int[] arr){
		    	  StringBuilder result=new StringBuilder();
		    	  int[] arr1=arr;
		    	  int count=1;
		          for(int i=0;i<arr1.length;i++) {
		       	   count=1;
		       	   for(int j=i+1;j<arr1.length;j++) {
		       		   if(arr1[i]==arr1[j] && arr[i]!=' ') {
		       			   count++;
		       			   arr[j]=' ';
		       		   }
		       	   }
		          if(count>1 && arr[i]!=' ') {
		       	   result.append(arr[i]).append(" ");
		          }
			 }
        return result;
      }
}
