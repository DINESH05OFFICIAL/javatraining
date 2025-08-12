import java.util.Scanner;
public class tcs2_8{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int  weight=sc.nextInt();
int min=0;
while(weight<=7000){

if((weight>0 )&&(weight<=2000))
{
min=25;
}
else if((weight>2000)&&(weight<=4000))
{
min=35;
}
else if(weight>4000)
{
min=45; 
}
}
if(min==25){
System.out.println("Time  estimated "+min+" minutes");
}

else if(min==35){
System.out.println("time  estimated "+min+" minutes");
}

else if(min==45){
System.out.println("time  estimated "+min+" minutes");
}

else
{
System.out.println(" OVERLOAD");
}
}
}
