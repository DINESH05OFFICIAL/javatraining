import java.util.*;
public class hexaaddition{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
ArrayList<Integer>array=new ArrayList<>();
while(num>0){
array.add(num%16);
num=num/16;
}
for(int i=array.size()-1;i>=0;i--){
int st =array.get(i);

if (st>=10){
switch (st){

case 10:
System.out.print("A");
break;
case 11:
System.out.print("B");
break;
case 12:
System.out.print("C");
break;
case 13:
System.out.print("D");
break;
case 14:
System.out.print("E");
break;
case 15:
System.out.print("F");
break;
}

}
 else {
System.out.print(st);}
}
}
}
