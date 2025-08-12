public class tcs2_5{
public static void main(String[]args){
char[]arr={'r','g','g','b','b','v'};
for(int i=0;i<arr.length;i++){
int count=0;
for(int j=0;j<arr.length;j++){
if(arr[i]==arr[j]){
count =count + 1;
}
}
if(count%2!= 0){
System.out.println(arr[i]);
}
}
}
}