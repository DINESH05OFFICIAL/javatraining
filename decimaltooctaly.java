import java.util.Scanner;
public class decimaltooctaly{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
int binary[]=new int[32];
int index=0;
while(num>0){
binary[index++]=num%8;
num/=8;
}
for(int i=index-1;i>=0;i--){
System.out.println(binary[i]);
}
}
}