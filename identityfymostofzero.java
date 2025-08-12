import java.util.Scanner;
public class identityfymostofzero{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number;");
int rows =sc.nextInt();
System.out.println("enter the columns");
int columns =sc.nextInt();
int max=0;
int index=0;
int sum=0;
;
int matrix[][] =new int[rows][columns];
 for(int i=0;i<rows;i++){
for (int j = 0 ; j<columns;j++){
matrix[i][j] = sc.nextInt();
}
}

for (int i = 0 ; i<matrix.length;i++){
int count=0;
for (int j = 0 ; j<matrix[0].length;j++){

if((matrix[i][j])==0)
{
count=count+1;
}
}
if(count>max){
max=count;
index=i;
}
}
System.out.print(index);
}
}
