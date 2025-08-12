import java.util.Scanner;
public class LCM{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number1:");
	int n1=sc.nextInt();
	System.out.println("enter the number2:");
	int n2=sc.nextInt();
int x=n1;
int y=n2;
while(n2>0){
int temp=n2;
n2=n1%n2;
n1=temp;}

int gcd=n1;
int lcm=(x*y)/gcd;
System.out.println(lcm);
}
}