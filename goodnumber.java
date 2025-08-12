import java.util.Scanner;
public class goodnumber{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int n=num;
int digit=0;
while(num>0){
digit=digit+num%10;
num=num/10;
}
if((n % digit)==0){
System.out.println("goodnumber");
}
else{
System.out.println("not a good number");}
}
}