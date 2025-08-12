public class equilibrium_index{
public static void main(String[]args){
int arr[]={-7,1,5,2,-4,3,0};
int total =0;
for(int i=0;i<arr.length;i++) 
{
total=total+i;
}
int leftsum=0;
int rightsum=0;
Boolean found=false;
for(int i=0;i<arr.length;i++)
{
rightsum=total-leftsum+arr[i];
if(leftsum==rightsum)
{
System.out.println(i);
found=true;
break;
}
leftsum+=arr[i];
}
if(!found){
System.out.println("-1");
}
}
}
