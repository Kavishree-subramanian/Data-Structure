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
	public void deleteAtBegin(){
	    if(head!=null){
	        head=head.next;
	    }
	}
	public void deleteAtEnd(){
	    Node temp=head;
	    while(temp.next.next!=null){
	        temp=temp.next;
	    }
	    temp.next=null;
	}
}
	public class Main
	{
		public static void main(String[] args) {
			LinkedList link=new LinkedList();
			link.insert(200);
			link.insert(400);
			link.insert(500);
			link.insertAtBegin(100);
			link.insertAtSpecific(2,300);
			link.deleteAtBegin();
			link.deleteAtEnd();
			link.display();
		}
	}
