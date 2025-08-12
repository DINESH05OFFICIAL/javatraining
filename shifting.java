import java.util.Scanner;
public class shifting{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number;");
	int num=sc.nextInt();
int n=num>>1;
int n2=n<<1;
if(n2==num){
System.out.println("even");}
else{
System.out.println("odd");}
}
}