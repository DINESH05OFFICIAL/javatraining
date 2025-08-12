public class RA{
public static void main (String[]args){
int arr[]={0,2,2,3,0};
for(int i=0;i<=arr.length-1;i++){
for(int j=i+1;j<=arr.length-1;j++){
if(arr[j]==arr[i]){
arr[i]=0;
arr[j]=0;
}
}
if(arr[i]!=0){
System.out.print(i+" ");
break;
}
}
}
}