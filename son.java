import java.util.Scanner;
public class son{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number;");
int num=sc.nextInt();
int number=num*(num+1)/2;
System.out.println(number);
}
}