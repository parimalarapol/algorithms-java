package codingchallenges;

public class TruncateString {

	static String truncateString(String s) {

		while(!s.isEmpty()) {
			
			int firstDigit = s.charAt(0);
			int lastDigit = s.charAt(s.length()-1);
		    int sum = lastDigit + firstDigit;
		    
		    if(firstDigit % 3 == 0) 
		    	s = s.substring(1, s.length());
		    
		    else if(lastDigit % 3 == 0)
		    	s = s.substring(0, s.length()-1);
		    
		    else if(sum % 3 == 0) 
		    	s = s.substring(1, s.length()-1);
		    
		    else 
		    	break;
		} 
	    return s;
	}
	
	public static void main(String[] args) {
		System.out.println(truncateString("366936363"));
	}
}
