import java.util.Scanner;
public class tcs2_4{
public static void main(String[]args){
int arr1[]={7,0,5,1,3};
int arr2[]={1,2,1,3,4};
int sum_n=0;
int sum_m=0;
for(int i=0;i<arr1.length;i++){
sum_n = sum_n + arr1[i];
}
for (int i = 0 ; i<arr2.length;i++){
sum_m = sum_m + arr2[i];
}

int result = sum_n - sum_m;

System.out.println("no of guest in cruise "+result);
}}