import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class January {
	public static void main(String[] args) {
		System.out.println("Please Enter A Number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i <= 3; i++) {
			if (a == 1) {
				System.out.println("my name is jatin:");
			} else if (a == 2) {
				System.out.println("Jatin Is Working In Tcs As a Java Developer");
			} else {
				System.out.println("enter in the else part:");
				continue;
			}
			System.out.println("Four Loop Traversing:");
		}
	}
}
