public class pyramidss{
public static void main(String[]args){
int num=5;
for(int i=0;i<num;i++){
for(int j=i;j<num-1;j++){
System.out.print(" ");
}
for(int k=0;k<(2*i-1);k++){
System.out.print(i);
}
System.out.println();
}
}
}
