
public class jjajan {

	public static String solution(String k) {
	      String[] arry= k.split("");
	      String s="";
	      int cnt=0;
	      for(String i : arry) {
	    	  if(i.equals(".")) {
	    		  if(cnt==0) s+=i;
	    		  cnt++;
	    	  }else {
	    		  s+=i;
	    		  cnt=0;
	    	  }  
	
	      }
	      
	      return s;
	}
}