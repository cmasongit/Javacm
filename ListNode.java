
public class ListNode {

	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val){this.val = val;}
	ListNode(int val, ListNode next){this.val = val; this.next = next;}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode r = new ListNode();
		
			
			
		
		
		if(l2.next != null) {
			r.val = l2.next.val + l1.val;
			
			
		
			
		//	r.val = r.val + l2.val;
		
		}
		else if(l1.next != null) {
		
			
			r.val = r.val + l1.val;
			
		}
	
		
		
		
		
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode k = new ListNode(1,null);
		ListNode y = new ListNode(100,k);
		ListNode t = new ListNode(5,y);
		ListNode t2 = new ListNode(6,t);
		ListNode t3 = addTwoNumbers(t,t2);
		//System.out.println(t.val+" "+ t2.val + " "+ t2.next.val);
		System.out.println(t3.val);
		
		
		while(t2.next != null) {
			
			System.out.println(t2.val);
			t2 = t2.next;
		}
		
	
		

	}

}
