package practice;
import java.io.*;
import java.lang.*;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Practice2 {
    public static int getLengthOfLCS(char[] str1, char[] str2, int p, int q) {
        if (p == 0 || q == 0)
            return 0;
        if (str1[p - 1] == str2[q - 1])
            return 1 + getLengthOfLCS(str1, str2, p - 1, q - 1);
        else
            return maxValue(getLengthOfLCS(str1, str2, p, q - 1), getLengthOfLCS(str1, str2, p - 1, q));
    }
    static int maxValue(int length1, int length2) {
        if (length1 > length2)
            return length1;
        else
            return length2;
    }

    public static int LIS(int[] A, int i, int n, int prev) {
        if (i == n) {
            return 0;
        }
        int excl = LIS(A, i + 1, n, prev);
        int incl = 0;
        if (A[i] > prev) {
            incl = 1 + LIS(A, i + 1, n, A[i]);
        }
       return Integer.max(incl, excl);
    }

    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            //  1. Gp ( Done)
/*
        int second = sc.nextInt();
        int third = sc.nextInt();
        int n = sc.nextInt();
        int r = third / second;
        int a = second / r;
        int nterm = a * ((int) Math.pow(r, n - 1));
        System.out.println(nterm);
*/

//2. Bitwise operation (Done)

//3. Frequency Count (Done)

    /*final int SIZE=26;
    String str=sc.nextLine();
    str=str.toLowerCase();
    int n=str.length();
    int freq[]=new int[SIZE];
    for (int i = 0; i < n; i++) {
        freq[str.charAt(i) - 'a']++;
    }
    for(int i=0;i<n;i++){
        if(freq[str.charAt(i)-'a']!=0){
            System.out.println(str.charAt(i)+"-"+freq[str.charAt(i)-'a']);
        }
        freq[str.charAt(i)-'a']=0;
    }*/

//4. Caesar Cipher (Done)
/*
        String str=sc.nextLine();
        StringBuffer result= new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                char ch=(char)(((int)str.charAt(i)+3-65)%26+65);
                result.append(ch);
            }
            else {
                char ch=(char)(((int)str.charAt(i)+3-97)%26+97);
                result.append(ch);
            }
        }
        System.out.println(result);*/

//5. Number of Decoding (Done)

        /*int x = sc.nextInt();
        char[] digits = String.valueOf(x).toCharArray();
        //char digits[]= {'1','2','3'};
        int n=digits.length;
        int[] count = new int[n+1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i <= n; i++) {
            count[i] = 0;
            if (digits[i-1] > '0')
            count[i] = count[i-1];
            if (digits[i-2] == '1' || (digits[i-2] == '2' && digits[i-1] < '7') )
            count[i] += count[i-2];
        }
        System.out.println(count[n]);
*/
            //6. Longest Common Subsequence
/*

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            char[] X = s1.toCharArray();
            char[] Y = s2.toCharArray();
            int m = X.length;
            int n = Y.length;
            System.out.println("Length of LCS is" + " " + getLengthOfLCS(X, Y, m, n));
*/

//7. Numbers Puzzle


//8. Longest Increasing Subsequence
        int n=sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        System.out.print("The length of the LIS is " + LIS(A, 0, A.length, Integer.MIN_VALUE));

//9. Moving Apples
//10. infix to postfix
//11. Penalty
//12. Euler’s Totient Function
//13. Next Number Generator
//14. Next Number Element
//15. Maximum Subarray
//16. Minimise a String
//17. Dubai Airport
//18. Possible Decodings
//19. Longest Decreasing Subsequence
//20. Longest Palindromic subsequence
//21. Module 11 code
//22. Roots of the Quadratic Equation
//23. Maximum Subarray
//24. Number of Selective Arrangement
//25. The Cuckoo Sequent
//26. Character Count
        }
    }