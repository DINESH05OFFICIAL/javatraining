 import java.util.Scanner;
public class anotherfactorial{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
int fact=1;
for(int i=1;i<=num;i++){
int sum=0;
for(int j=1;j<=i;j++)
{
sum=sum+fact;
}
fact=sum;
}
System.out.println(fact);
}
}