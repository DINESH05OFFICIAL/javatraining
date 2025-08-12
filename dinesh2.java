import java.util.Scanner;
public class tcs2_6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("enter the number of candies");
int totalcandies=sc.nextInt();

System.out.println("enter the sold of candies");
int soldcandies=sc.nextInt();
int remainingcandies=0;
 
remainingcandies=totalcandies-soldcandies;

if(remainingcandies>=5){
System.out.println("NUMBER OF CANDIES SOLD :"+soldcandies);
System.out.println("NUMBER OF CANDIES LEFT :"+ remainingcandies);
}
else{
System.out.println("INVALID INPUT");
}
}
}