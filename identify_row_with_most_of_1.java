import java.util.Scanner;
public class identify_row_with_most_of_1{
public static void main(String[]args){
int num[][]={{1,1,1,1},
	     {0,1,1,1},
	     {1,0,0,1}};

int index=0;
int max=0;
for(int i=0;i<num.length;i++){
int count=0;

for(int j=0;j<num[i].length;j++)
{
	if((num[i][j])==1)
          {
	  count=count+1;
          }
}
	if(count>max){
	max=count;
        index=i;
	}

}
System.out.println(index);
}
}
