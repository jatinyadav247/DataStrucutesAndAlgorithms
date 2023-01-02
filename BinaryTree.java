import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Node {
	int data;
	Node left, right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	void inorder() {
		if (root == null)
			return;

		Stack<Node> s = new Stack<Node>();
		Node curr = root;

		// traverse the tree
		System.out.println("the value of first curr====" +root.data);
		while (curr != null || s.size() > 0) {
            System.out.println("stackSize=======" +s.size() + "currr====" +curr.data);
			/*
			 * Reach the left most Node of the curr Node
			 */
			while (curr != null) {
				/*
				 * place pointer to a tree node on the stack before traversing the node's left
				 * subtree
				 */
				s.push(curr);
				curr = curr.left;
				System.out.println("my name is jatin yadav======");
			}

			/* Current must be NULL at this point */
			curr = s.pop();
            System.out.println("the value of currentPop=======" +curr.data);
			//System.out.print(curr.data + " ");

			/*
			 * we have visited the node and its left subtree. Now, it's right subtree's turn
			 */
			curr = curr.right;
			System.out.println("curr Right========");
		}
	}

	public static void main(String args[]) {

		/*
		 * creating a binary tree and entering the nodes
		 */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.inorder();
	}

}
