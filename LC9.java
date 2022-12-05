import java.lang.reflect.Array;
import java.util.Arrays;

public class LC9 {
	
	
	
	
	public static String addin(char[] d) {
		String  r = "";
		char f = '(';
		char m = ',';
		char b = ')';
		String temp ="";
		String temp2 ="";
		int size = d.length;
		int count = 0;
		
		for(int i = 0; i < size; i++) {
		
			
			if(i%2 ==0 ) {
			temp = Integer.toString(d[i]);
			temp2 = "";
			}
			if(i%2 ==1) {
			temp2 = Integer.toString(d[i]);
			
		
			} 
			
			
			if(temp != "" && temp2 != "") {
				r = r+f+temp+m+temp2+b;
				
		
			}
			if(size%2 == 1 && i == size-1) {
				//temp = Integer.toString(0);
				temp2 = Integer.toString(d[size-1]);
				r = r+f+temp2+b;
			}
				
			}
			
		
	
		
		
		
		return r;
	}
	
	
	
	
	
	
	public static char[] mergesort(char[] a) {
		
		int size = a.length  ;
		int size2;
		
	if(size%2 == 0)	{
	size2 = size/2;
		//System.out.println( "Half size " + size2 + " full size "+size);
		int[] temp = new int[size2];
		int[] r = new int[size2];
	//	Arrays.sort(a);
	int c = 0;
		while(size2 != size) {
		
			temp[c] = a[size2];
			
			size2++;
			c++;
			
		}
		
		int d = 0;
		
	
			 size2 = size/2;
	
		//System.out.println(size2);
		while(d != size2) {
		
			r[d] = a[d];
			d++;
			
			
		}


	Arrays.sort(r);
		Arrays.sort(temp);
		
		a = new char[size];

		
int y = 0;
int x = 0;

while(y != size2) {
	
	a[y] = (char) r[y] ;
	y++;
	
	
}


size2= size/2;

while(size2 != size ) {
	
	a[size2] = (char) temp[x];
	x++;
	size2++;
	
	
}
		
		
		


		
		
		return a;
		
	}
	else if(size % 2 == 1) {
		
		size2 = size/2 +1 ;
		//System.out.println( "Half size " + size2 + " full size "+size);
		int[] temp = new int[size2-1]; // back
		int[] r = new int[size2]; // front 
	//	Arrays.sort(a);
	int c = 0;
		while(size2 != size) {
		
			temp[c] = a[size2];
			
			size2++;
			c++;
			
		}
		
		int d = 0;
		
	
			 size2 = size/2+1;
	
		//System.out.println(size2);
		while(d != size2) {
		
			r[d] = a[d];
			d++;
			
			
		}


		
		
		
	Arrays.sort(r);
		Arrays.sort(temp);
		
		a = new char[size];

		
int y = 0;
int x = 0;


size2 = size/2+1;

while(y != size2) {
	
	a[y] = (char) r[y] ;
	y++;
	
	
}


size2= size/2 +1;

while(size2 != size ) {
	
	a[size2] = (char) temp[x];
	x++;
	size2++;
	
	
}
		
		
		


		
		
		return a;
		
		
		
		
		
		
		
		
		
		
		
	}
	return a;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a = {13,6,9,8};
		char[] b = {'a',4,'f','d','b',3,1};
		
		System.out.println("B");
		for(int i: mergesort(b)) {
			System.out.print(i+",");
		}
		System.out.println();
	a = mergesort(a);
	b = mergesort(b);
	
	
	System.out.println("A");
	for(int i: a) {
	System.out.print(i + ",");
	}
	System.out.println();	
	
	
	System.out.println(addin(a));
	System.out.println(addin(b));
	}

}
