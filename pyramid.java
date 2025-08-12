import java.util.Scanner;
public class pyramid{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=i;j<=n-1;j++){System.out.print(" ");}
for(int j=0;j<2*i-1;j++){
System.out.print("*");}
System.out.println();}
for(int i=n;i>=1;i--){
for(int j=n-1;j>=i;j--){System.out.print(" ");}
for(int j=0;j<2*i-1;j++){
System.out.print("*");}

System.out.println();
}
}
}