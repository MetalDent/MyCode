class reverse_ll { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) { 
			data = d; 
			next = null; 
		} 
	} 

	Node reverse(Node node) { 
		Node prev = null; 
		Node current = node; 
		Node next = null; 
		while (current != null) { 
			next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
		} 
		node = prev; 
		return node; 
	} 

	void printList(Node node) { 
		while (node != null) { 
			System.out.println(node.data + " "); 
			node = node.next; 
		} 
	} 

	public static void main(String[] args) { 
		reverse_ll obj = new reverse_ll(); 

		obj.head = new Node(15); 
		obj.head.next = new Node(20); 
		obj.head.next.next = new Node(47); 
		obj.head.next.next.next = new Node(63); 
		
		System.out.println("Given Linked list"); 
		obj.printList(head); 
		head = obj.reverse(head); 
		System.out.println(""); 
		System.out.println("Reversed linked list "); 
		obj.printList(head); 
	} 
} 


