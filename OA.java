import java.util.Scanner;
public class OA{
public Static int octaltodecimal(int octal){
int decimal=0;
int base=1;
while(octal>0){
int ld=octal%10;
decimal=decimal+ld*base;
base=base*8;
octal/=10;
}
return decimal;
}
public Static int decimaltooctal(int octal){
int octal =0;base=1;

while(decimal > 0){

int ld=decimal % 8;

Octal = octal +ld*base;

base=base*10;

decimal /=8; 
}
return octal;
}
public Static int addoctal(int octal1,int octal2){
int decimal1=Octaltodecimal(octal1);
int decimal2=octaltodecimal(octal2);
int sum = decimal1+decinal2;
int addition=decimaltooctal(sum);
}
return addition;
}
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int octal1=sc.nextInt();
	System.out.println("enter the number2");
	int octal2=sc.nextInt();
int result=addoctal(octal1,octal2);
return (result);
}











