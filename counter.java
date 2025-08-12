import java.util.Scanner;
class counter{
public static int totalcount(int num){
int digit=0;
int count=0;
while(num>0){
digit=num%10;
count=count+1;
num/=10;
}
return count;}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

System.out.println(totalcount(num));
}
}
