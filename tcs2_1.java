import java.util.Scanner;
public class tcs2_1
{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
String str=sc.nextLine();
int starcount=0;
int hashcount=0;
int totalcount=0;
int tot=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch == '*'){
starcount=starcount+1;
}
if(ch == '#'){
hashcount=hashcount+1;
}
}
if(starcount==hashcount){
System.out.println("0");
}
else if (starcount>hashcount){
totalcount=starcount-hashcount;
System.out.println("either remove "+totalcount + "from star  or add" +totalcount+"in hash");
}
else if(starcount<hashcount){
tot=hashcount-starcount;
System.out.println("either remove "+tot + " from hash  or add "+tot+" in star" );
}
}
}

