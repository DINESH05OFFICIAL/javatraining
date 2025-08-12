import java.util.Scanner;
public class Neon{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int sqaure=num*num;
	int digit=0;
	int sum=0;
	while(sqaure>0){
		sum=sum+sqaure%10;
		sqaure=sqaure/10;}
if(sum==num){
System.out.println("neon no");
}
else{
System.out.println("not neon");
}
}
}