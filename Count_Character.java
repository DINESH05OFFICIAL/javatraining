public class Count_Character{
public static void main(String[]args){
String str="ainlbayalukada";
int count=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);

if(ch=='a'||ch=='l'){
count=count+1;
}
}
System.out.println("a+l;"+count);

}
}
