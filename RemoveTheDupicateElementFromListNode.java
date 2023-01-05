import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class RemoveTheDupicateElementFromListNode {
	public ListNode removeDuplicate(ListNode head) {
		ListNode jatin = new ListNode(), yadav = jatin;
		while (head != null) {
			while (head.next != null && head.val == head.next.val) {
				yadav.next = head;
				yadav = yadav.next;
				head = head.next;
			}
		}
		return head;
	}
}
