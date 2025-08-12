import java.util.*;
class node{
int data;
node next;
node prev;

public node(int data){
this.data=data;
this.next=null;
this.prev=null;
}
}
public class doublylinked{
node head=null;
public void insertion(int data){
node newnode=new node(data);
if(head==null){
 head=newnode;
}else{
node current=head;
while(current.next!=null){
current=current.next;
}
current.next=newnode;
newnode.prev=current;
}
}
public void insertmiddle(int data,int position){
node newnode=new node(data);
node current=head;
if(head==null){
head=newnode;
}
else if(position==1 || position<=0){
newnode.next=current;
current.prev=newnode;
head=newnode;
}
else{
for(int i=0;i<position-1;i++){
current=current.next;
}
newnode.next=current.next;
current.prev=newnode;
newnode.prev=current;
current.next=newnode;
}
}
public void deletionatfirst(int position){
node current=head;
for(int i=1;i<position-1;i++){
current=current.next;
}
current.next=current.next.next;
}
public void display(){
node current=head; 

while(current!=null){
System.out.print(current.data+"->");
current=current.next;
}
System.out.println("null");
}
public static void main(String[]args){
Scanner scan=new Scanner(System.in);

doublylinked list=new doublylinked();
System.out.println("enter the no of listnode::");
int len=scan.nextInt();
System.out.println("enter the  list value:");
for(int i=0;i<len;i++){
int val=scan.nextInt();
list.insertion(val);
}
list.display();
System.out.println("insert the position:");
int id=scan.nextInt();
System.out.print("insert  the middle value");
int val1=scan.nextInt();
list.insertmiddle(val1,id);
list.display();
System.out.println("enther the deletion at middle");
int posi=scan.nextInt();
list.deletionatfirst(posi);
System.out.println("after deletionat first ");
list.display();
}
}



