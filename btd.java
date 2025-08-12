import java.util.Scanner;
public class btd{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	String str=sc.nextLine();

int sum=0;
int power=1;
int integer=0;
int result=0;

for(int i=str.length()-1;i>=0;i--){
char ch=str.charAt(i);
integer=ch-'0';
result=integer*power;
sum=sum+result;
power=power*2;
}
System.out.println(sum);
}
}