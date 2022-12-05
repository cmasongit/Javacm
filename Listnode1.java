
public class Listnode1 {
	
	
int val;
Listnode1 next;
Listnode1(){};
Listnode1(int val){this.val = val;}
Listnode1(int val, Listnode1 next){
	this.val = val;
	this.next = next;
}
	
	
	public static Listnode1 addTwoNumbers(Listnode1 k2, Listnode1 y2) {
		
		int sum = 0;
		int c = 0;
		
		
		Listnode1 l3 = new Listnode1();
		
	while(k2.next != null && y2.next !=null) {
			
		
		
			sum = k2.val + y2.val;
		
			
			if(sum > 9) {
				c = 1;
				sum = sum%10;
			}else {
				c = 0;
			}
			l3.val = sum;
			k2 = k2.next;
			y2 = y2.next;
			
			l3.next = new Listnode1();
			sum = 0;
			//System.out.println(l3.val);
		
			
			
		}
		
		
		
		
		return l3;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		Listnode1 k0 = new Listnode1(0);
		Listnode1 k = new Listnode1(3,k0);
		Listnode1 k1 = new Listnode1(4,k);
		Listnode1 k2 = new Listnode1(2,k1);
		
		Listnode1 y0 = new Listnode1(0);
		Listnode1 y = new Listnode1(4,y0);
		Listnode1 y1 = new Listnode1(6,y);
		Listnode1 y2 = new Listnode1(5,y1);
		
		
		
		

			System.out.println(addTwoNumbers(y2,k2).val);
		
		
	
		
	}

}
