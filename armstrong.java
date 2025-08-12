 import java.util.Scanner;
public class armstrong{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int temp=num;
int count=0;
int sum=0;
while(temp>0){
temp/=10;
count=count+1;
}
int original=num;
while(original>0){
int power=1;
int lastdigit=original%10;
for(int i=1;i<=count;i++){
power=lastdigit*power;
}
sum=sum+power;
original/=10;
}
if(num==sum){
System.out.println("arms");
}
else{
System.out.println("not a arms");
}
}
}