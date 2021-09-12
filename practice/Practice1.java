package practice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
/*      difference between max and min
        int max=arr[0];int min=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max-min);*/
/* difference between odd and even
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }
        System.out.println(odd-even);
*/
/*
        write a program to calculate the total of measurements in feet.
        int measure=0;
        for(int i=0;i<n;i++){
            measure+=arr[i]/12;
        }
        System.out.println(measure);
*/
/*
        Write a program to calculate the total bill tax amount for a list of billing amounts passed as an array of long integers.
        int tax=0;
        for(int i=0;i<n;i++){
            tax+=((arr[i]-1000)*0.1);
        }
        System.out.println(tax);
*/
/*      max Difference between adjacent element
        int maxd=0;
        for(int i=0;i<n-1;i++){
            if(maxd<arr[i]-arr[i+1]){
                maxd=arr[i]-arr[i+1];
            }
        }
        System.out.println(maxd);*/

/*      Write a program to calculate and return the sum of absolute difference between the adjacent number in an array of positive integers from the position entered by the user.
        int diff, sum=0;
        int x=sc.nextInt();
        for(int i=x-1;i<n-1;i++){
            diff=Math.abs(arr[i]-arr[i+1]);
            sum=sum+diff;
        }
        System.out.println(sum);
*/
/*
        int oddsum=0,evensum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evensum+=arr[i];
            }
            else {
                oddsum+=arr[i];
            }
        }
        System.out.println(evensum-oddsum);
    */
    }
}
