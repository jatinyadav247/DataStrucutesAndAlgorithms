import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Tree {
	Node root;

	public static class Node {
		int value;
		Node left;
		Node right;

		public Node() {
		}

		public Node(int v) {
			value = v;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		Node node = new Node();
		
	}
}