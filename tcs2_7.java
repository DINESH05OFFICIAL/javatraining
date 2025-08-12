import java.util.Scanner;
public class tcs2_7{
public static void main(String[]args){
int trainee=3;
int avg1,avg2,avg3=0;


Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int round1[]=new  int[3];
int result1=0;

for (int i = 0 ; i<round1.length;i++){
round1[i]=sc.nextInt();
}

System.out.println("Enter the number");
int round2[]=new  int[3];
int result2=0;

for (int i=0;i<round2.length;i++){
round2[i]=sc.nextInt();
}

System.out.println("Enter the number");
int round3[]=new  int[3];
int result3=0;

for(int i=0;i<round3.length;i++){
round3[i]=sc.nextInt();
}

for(int i=0;i<round1.length;i++){

result1=round1[i]+result1;
}
avg1=result1/trainee;



for(int i=0;i<round2.length;i++){

result2=round2[i]+result2;
}
avg2=result2/trainee;


for(int i=0;i<round3.length;i++){

result3=round3[i]+result3;
}
avg3=result3/trainee;
int max1=0;

if(avg1>avg2 && avg1>avg3){
max1=avg1;

}
else if((avg2>avg1) && (avg2>avg3)){
max1=avg2;

}
else if((avg3>avg1) && (avg3>avg2)){
max1=avg3;

}
if(max1>70){
System.out.println("trainee are good "max1);
}
else if(max1<70){
System.out.println("UNFIT");
}
}
}