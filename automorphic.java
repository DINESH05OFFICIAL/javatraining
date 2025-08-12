import java.util.Scanner;
public class automorphic{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int n=num;
int sqaure=n*n;
int digit=1;
while(n>0){
digit*=10;
n/=10;
}
if(sqaure%digit==num){
System.out.println("morphic");}
else{
System.out.println(" not morphic");}
}

}