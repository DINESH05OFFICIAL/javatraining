class Node {
int data;
Node next;

public Node (int data){
this.data=data;
this.next=null;
}
}
public class simplesinglylinkedlist{
Node Head;

public void add(int data){
Node newNode=new Node(data);
if(Head == null){
Head = newNode ;
}
else{
Node current=Head;
while(current.next !=null){
current=current.next;
}
current.next=newNode;

}
}
public void display(){
Node current =Head;
System.out.println("linked list:");
while(current !=null){
System.out.print(current.data+"->");
current=current.next;
}
System.out.println("null");
}
public static void main(String[]args){
simplesinglylinkedlist list =new simplesinglylinkedlist();
list.add(10);
list.add(20);
list.add(30);
list.display();
}
}
