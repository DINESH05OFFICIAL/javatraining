import java.util.Scanner;
public class genc2{
public static void  main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter  the no of pizza;");
int pizza=sc.nextInt();
System.out.println("enter  the no of puffs;");
int puffs=sc.nextInt();
System.out.println("enter  the no of cooldrinks;");
int cooldrinks=sc.nextInt();
int A=0,B=0,C=0;
int total=0;
int priceofpizza=100;
int priceofcooldrinks=10;
int priceofpuffs=20;
A=pizza*priceofpizza;
B=puffs*priceofpuffs;
C=cooldrinks*priceofcooldrinks;
total=A+B+C;
System.out.println(total);
}
}