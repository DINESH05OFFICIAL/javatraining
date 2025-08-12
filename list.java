
class listnode{
int data;
listnode next;

listnode(int data){
this.data=data;
this.next=null;
}
}
public class list{
public static void main(String[]args){
listnode head=null;
listnode x1=new listnode(10,1);
listnode x2=new listnode(20,2);
listnode x3=new listnode(30,3);
head=x1;
x1.next=x2;
x2.next=x3;
for(listnode t=head;t!=null;t=t.next){
System.out.print(t.data+">");
}
Syste
}
}