import java.util.Scanner;
public class dinesh{
public static String oddeven(int n){
String ev = "even";
if(n%2==0){
return ev;
}

else{
String od="odd no";
return od;
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
System.out.println(oddeven(n));
}
}