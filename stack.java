
class s
{
	int a[]=new int[5];
	int top=-1;
	public void push(int data) {
		if(top==a.length-1){
			System.out.println("Stack is full");
	    }
		else {
			top++;
			a[top]=data;
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			}
		else {
			top--;
			}
		}
	public void peak() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Top of the element"+a[top]);
		}
	}
	public void display() {
		for(int i=top;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
public class Main {

	public static void main(String[] args) {
		s st=new s();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.pop();
		st.peak();
		st.display();

	}

}
