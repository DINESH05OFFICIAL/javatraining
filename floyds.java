import java.util.Scanner;
public class floyds{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
int num=0;
	for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
System.out.print(num);
num++;
}System.out.println();
}
}
}