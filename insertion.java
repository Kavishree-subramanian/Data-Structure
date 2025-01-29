class Node {
	int data;
	Node next;
	public Node (int data) {
		this.data=data;
		this.next=null;
	}
}
class LinkedList {
	Node head,tail;
	public void insert(int data) {
		Node newNode=new Node(data);
		//newNode.next=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
		    System.out.println(temp.data);
			temp=temp.next;
		}

	}
	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		newNode.next =head;
		head=newNode;
	}
	public void insertAtSpecific(int pos, int data){
	    Node newNode=new Node(data);
	    Node temp =head;
	    for(int i=0;i<pos-1;i++){
	        temp=temp.next;
	        newNode.next=temp.next;
	        temp.next=newNode;
	    }
	}

}
	public class Main
	{
		public static void main(String[] args) {
			LinkedList link=new LinkedList();
			link.insert(100);
			link.insert(200);
			link.insert(300);
			link.insertAtBegin(500);
			link.insertAtSpecific(2,302);
			link.display();
		}
	}
