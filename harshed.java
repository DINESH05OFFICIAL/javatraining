import java.util.Scanner;
public class harshed{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int n=num;
int sum=0;
while(num>0){
sum=sum+num%10;
num=num/10;}
if(n%sum==0){
System.out.println("harshed number");
}
else{
System.out.println("nota harshed num");
}
}
}