import java.util.Scanner;
public class tcs2_3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of row:");
int row=sc.nextInt();
System.out.println("Enter the no of column:");
int column=sc.nextInt();
int matrix[][]=new int[row][column];
int count=0;
int index=0;
System.out.println("Enter the value for the matrix");
for(int i = 0 ; i<row;i++){
for (int j = 0 ; j <column;j++)
{
matrix[i][j] = sc.nextInt();

}


}
for(int i=0;i<matrix.length;i++){
for(int j=0;j<matrix.length;j++){
if(matrix[i][j]==1){
count=count+1;
index=i;
}
}


}System.out.println("index value "+index);
}
}