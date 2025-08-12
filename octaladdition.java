import java.util.*;
public class octaladdition{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
ArrayList<Integer>array=new ArrayList<>();
int result=0;
while(num>0){
array.add(num%8);
num=num/8;
}
for(int i=array.size()-1;i>=0;i--){
System.out.print(array.get(i)+" ");}
}
}
