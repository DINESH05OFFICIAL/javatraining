public class cf{
public static void main (String[]args){
int arr[]={4,5,0,1,9,0,5,0};
int in[]=new int[8];
int j=-1;
for(int i=0;i<arr.length;i++){
if(arr[i]!=0){
j=j+1;
in[j]=arr[i];
}
}

for (int i = 0 ; i < in.length;i++){
System.out.print(in[i]+" ");
}
}
}
