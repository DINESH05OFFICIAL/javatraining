public class RR{
public static void main(String [] args){
int arr[]={1,2,3,4,5,6,7,8,9};
int n=arr.length;
int k=2;
while(k>0){
int last=arr[n-1];
for(int i=n-1;i>0;i--)
{
arr[i]=arr[i-1];
}
arr[0]=last;
k--;
}
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
}
}