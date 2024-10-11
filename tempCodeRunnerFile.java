import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class Solution {

    public static Node insert(Node head,int data) {
        //Complete this method
        Node node = new Node(data);
        node.next = head;
        head = node;
        return node;

    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
            N--;
        }
        display(head);
        sc.close();
    }
}