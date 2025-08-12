import java.util.Scanner;
public class otb{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
	System.out.println("Enter the octal number");
	String str=sc.nextLine();
int integer=0;
int result=0;
int power=1;
int sum=0;

for(int i=str.length()-1;i>=0;i--){
char ch=str.charAt(i);
integer=ch-'0';
result=integer*power;
sum+=result;
power=power*8;
}
System.out.println("octal to decimal value "+sum);

int binary[]=new int[32];
int index=0;
while(sum>0){
binary[index++]=sum % 2;
sum/=2;
}
for(int i=index-1;i>=0;i--){
System.out.print(binary[i]);
}
}
}

