import java.util.Scanner;
public class palindrome{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int n=num;
int digit=0;
int reversed=0;
while(num>0){
digit=num%10;
reversed=reversed*10+digit;
num=num/10;
}
if(n==reversed){
System.out.println("palindrome");
}
else{
System.out.println("not a palindrome");
}
}
}


