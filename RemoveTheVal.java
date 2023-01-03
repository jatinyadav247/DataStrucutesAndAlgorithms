import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class RemoveTheVal {
	public ListNode removeElements(ListNode head, int val) {
		ListNode jatin = new ListNode();
		// System.out.println("the value of pehla jatin:" +jatin);
		ListNode yadav = jatin;
		ListNode radha = new ListNode();
		ListNode shyam = radha;
		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			// System.out.println("the value of head:" +head.val);
			if (head.val != val) {
				yadav.next = head;
				yadav = yadav.next;
				list.add(yadav);
			} else {
				shyam.next = head;
				shyam = shyam.next;
				// list.add(shyam);
			}
			head = head.next;
		}
		// System.out.println("the value of List:" +list.size());
		ListNode dusriPari = new ListNode();
		ListNode ravan = dusriPari;
		for (int i = 0; i <= list.size() - 1; i++) {
			ListNode rama = list.get(i);
			// System.out.println("the value of rama:" +rama.val);
			ravan.next = rama;
			ravan = ravan.next;
			// System.out.println("the value or=f ravan:" +ravan.val);
		}
		return dusriPari.next;
	}

}
