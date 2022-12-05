
public class isPalnum {
//Passed 55mms
	
	public static boolean isPalnum(int x) {
		
		
		Boolean r = false;
		
		String temp = Integer.toString(x);
		String emt = "";
		char ch;
		int size = temp.length();
		
		
		
		
		
		if(size % 2 == 0) {
		
			String x1 = temp.substring(0,size/2);
			String x2 = temp.substring(size/2, size);
		for(int i = 0; i < x2.length(); i++) {
			ch = x2.charAt(i);
			emt = ch+emt;
		}
	//	System.out.println(x1 + " "+emt);
		if(x1.equals(emt)) {
			r = true;
		}
		
		
		
		}
		else {
			String x1 = temp.substring(0,size/2);
			String x2 = temp.substring(size/2+1, size);
			
			for(int i = 0; i < x2.length(); i++) {
				ch = x2.charAt(i);
				emt = ch+emt;
			}
		//	System.out.println(x1 + " "+emt);
			if(x1.equals(emt)) {
				r = true;
			}
			
			
			
		}
		
		
		return r;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(isPalnum(125521));
		System.out.println(isPalnum(12));

	}

}
