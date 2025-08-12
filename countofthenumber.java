import java.util.Scanner;
public class countofthenumber{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int count=0;
int st=0;
while(num>0){
st=num%10;
count=count+1;
num=num/10;
}
System.out.println(count);
}
}