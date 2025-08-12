import java.util.Scanner;
public class butterfly2{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int n=sc.nextInt();

for(int i=0;i<=n;i++){
for(int j=0;j<=i;j++){
System.out.print("*");}
for(int j=1;j<=n-i;j++){
System.out.print(" ");}

for(int k=0;k<=n;k++){
for(int j=k;j<=n-1;j++){
System.out.print(" ");}
for(int j=0;j<k;j++){
System.out.print("*");}
}

System.out.println();

}
}
}