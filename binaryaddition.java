import java.util.*;
public class binaryaddition{
public static void main(String[]args){
String str1="1011";
String str2="1111";
ArrayList<Integer>array=new ArrayList<>();
int carry=0;
int result=0;
for(int i=str1.length()-1;i>=0;i--){
int ch1=str1.charAt(i)-'0';
int ch2=str2.charAt(i)-'0';
result=ch1+ch2+carry;
array.add(result%2);
carry=result/2;
}
array.add(carry);
for(int i=array.size()-1;i>=0;i--){
System.out.print(array.get(i)+"");}
}
}