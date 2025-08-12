public class subarray{
public static void main(String[]args){
int a[]={11,1,13,21,3,7};
int b[]={11,3,7,1};
boolean found=false;
for(int i=0;i<b.length;i++){
for(int j=0;j<a.length;j++){
if(b[i]==a[j]){
found=true;
System.out.println("true");
break;
}}
if(!found){
found=false;
System.out.println("false");
}
}
}
}