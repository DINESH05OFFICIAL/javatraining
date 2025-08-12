 import java.util.Scanner;
public class strongnumber{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();  
	int num=n;
	int sum=0;
	
while(num>0){
int digit=num%10;
int factorial=1;
for(int i=1;i<=digit;i++){
factorial*=i;
}
sum=sum+factorial;
num/=10;
}
if(sum==n){
System.out.println("n"+n+"is strong");}
else{
System.out.println("no strong");}
}
}


