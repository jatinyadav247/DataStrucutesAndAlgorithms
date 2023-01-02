import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class MergingTwoListCode {
//So Here We are going to learn how to merge the two lists in sorting order
	public ListNode mergeTwoListInSortedWay(ListNode list1, ListNode list2) {
		ListNode jatin = new ListNode();
		ListNode temp = jatin;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				temp.next = list1;
				temp = temp.next;
				list1 = list1.next;
			} else {
				temp.next = list2;
				temp = temp.next;
				list2 = list2.next;
			}
		}
		while (list1 != null) {
			temp.next = list1;
			temp = temp.next;
			list1 = list1.next;
		}
		while (list2 != null) {
			temp.next = list2;
			temp = temp.next;
			list2 = list2.next;
		}
		return jatin.next;
	}
}
