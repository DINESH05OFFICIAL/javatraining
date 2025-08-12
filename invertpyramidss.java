public class invertpyramidss{
public static void main(String[]args){
int num=5;
for(int i=0;i<num;i++){
for(int j=i;j<num;j++){
System.out.print(" ");
}
for(int k=0;k<(2*i-1);k++){
System.out.print("*");
}
System.out.println();
}
for(int i=num;i>0;i--){
for(int j=num;j>i;j--){
System.out.print(" ");
}
for(int k=(2*i-1);k>=1;k--){
System.out.print("*");
}
System.out.println();
}
}
}
