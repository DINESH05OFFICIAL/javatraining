import java.util.Scanner;
 public class lastgreatestnumber{ 
 public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int max=0;
while(num>0){
int digit=num%10;
int result=digit;
num/=10;

if(result>max){
max=result;
}

}System.out.println(max);
}
}