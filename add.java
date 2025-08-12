import java.util.*;

class listnode{
int data;
listnode next;

listnode(int data){
this.data=data;
this.next=null;
}
}
public class add{
public void addnumbers(listnode l1,listnode l2){
listnode t=new node();
listnode d=t;
int carry=0;
while(l1!=null || l2!=null || carry!=null){
int sum=carry;
if(l1!=null){
sum+=l1.data;
}
if(l2!=null){
sum+=l2.data;
}
d.next=new listnode(sum%10);
carry=sum/10;
d=d.next;
}
return t.next;
}

public static void main(String[]args){
}

}




