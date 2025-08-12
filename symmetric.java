public class symmetric{
public static void main(String[]args){

int arr[][]= {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
Boolean found=false;
for(int i=0;i<arr.length;i++)
{
int first=arr[i][0];
int second=arr[i][1];
for(int j=i+1;j<arr.length;j++)
{

if(arr[j][0]==second && arr[j][1]==first){
found = true;
System.out.println("("+first+","+second+")");
}
}
}
if(!found){
found =  false;
System.out.println("false");
}
}
}