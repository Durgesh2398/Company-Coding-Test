package tcsPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String args[]){
        /*
        There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.

If Input is more than candies in JAR, return: “INVALID INPUT”

Given,

N=10, where N is NUMBER OF CANDIES AVAILABLE

K =< 5, where k is number of minimum candies that must be inside JAR ever.

Example 1:(N = 10, k =< 5)

Input Value
3
Output Value
NUMBER OF CANDIES SOLD : 3
NUMBER OF CANDIES AVAILABLE : 7
Example : (N=10, k<=5)

Input Value
0
Output Value
INVALID INPUT
NUMBER OF CANDIES LEFT : 10

        * */

        /*Scanner sc =new Scanner(System.in);
        int n=10;
        int num=sc.nextInt();
        if(num>=1&&num<=5){
            System.out.println("Number of candies sold : "+ num);
            System.out.println("remaining : "+(n-num));
        }
        else {
            System.out.println("Invalid");
            System.out.println("remaining : "+n);
        }*/

        /*
        A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain But based on weight measured by sensors, it decides time and water level which can be changed by menus given on the machine control area.

For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number below that.

For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.

For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.

Assume the capacity of machine is maximum 7000 grams

Where approximately weight is zero, time estimate is 0 minutes.

Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, and for all other inputs, the output statement is

“INVALID INPUT”.

Input should be in the form of integer value –

Output must have the following format –

Time Estimated: Minutes

Example:

Input value
2000

Output value
Time Estimated: 25 minutes
        * */

/*
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Time Estimated : 0 Minutes");
        else if(n>0 && n<=2000)
            System.out.println("Time Estimated : 25 Minutes");
        else if(n>2000 && n<=4000)
            System.out.println("Time Estimated : 35 Minutes");
        else if(n>4000 && n<=7000)
            System.out.println("Time Estimated : 45 Minutes");
        else
            System.out.println("INVALID INPUT");
*/


        /*
        * We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost is Rs.12 per sq.ft.

Take input as
1. Number of Interior walls
2. Number of Exterior walls
3. Surface Area of each Interior 4. Wall in units of square feet
Surface Area of each Exterior Wall in units of square feet

If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

Calculate and display the total cost of painting the property
Example 1:

6
3
12.3
15.2
12.3
15.2
12.3
15.2
10.10
10.10
10.00
Total estimated Cost : 1847.4 INR
        * */

        /*int ni, ne, i = 0;
        float intP = 18, extP = 12, cost = 0, temp;
        Scanner sc = new Scanner(System.in);
        ni = sc.nextInt();
        ne = sc.nextInt();
        if(ni < 0 || ne < 0) {
            System.out.print("INVALID INPUT");
        } else if(ni == 0 && ne == 0) {
            System.out.print("Total estimated Cost : 0.0");
        } else {
            for(i = 0; i < ni; i++) {
                temp = sc.nextFloat();
                cost += intP * temp;
            }
            for(i = 0; i < ne; i++) {
                temp = sc.nextFloat();
                cost += extP * temp;
            }
            System.out.printf("Total estimated Cost : %.1f", cost);
        }
*/


  /*
  There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat.
At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating.
Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree.
    Where, n= Total no of Monkeys
        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas)
        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)
        m = Total number of Bananas
        p  = Total number of Peanuts
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero

Example 1:
Input Values
20
2
3
12
12

Output Values
Number of  Monkeys left on the tree:10

Note: Kindly follow  the order of inputs as n,k,j,m,p as given in the above example. And output must include  the same format  as in above example(Number of Monkeys left on the Tree:)
For any wrong input display INVALID INPUT


  * */


        /*Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int atebanana=0 ,atepeanut=0;
        if( n<0 && k<0 || j<0 || m<0 || p<0) {
            System.out.println("Invalid Input");
        }
        else {
            if(k>0) {
                atebanana =m/k;
                m=m%k;
            }
            if(j>0) {
                atepeanut = p/j;
                p=p%j;
            }
            n=n-atebanana-atepeanut;
            if((m!=0) || (p!=0))
                n=n-1;
            System.out.println("Number of Monkeys left on the Tree: "+n);
        }

        */

        /*
        * FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:

Coffee

Espresso Coffee
Cappuccino Coffee
Latte Coffee
Tea

Plain Tea
Assam Tea
Ginger Tea
Cardamom Tea
Masala Tea
Lemon Tea
Green Tea
Organic Darjeeling Tea
Soups

Hot and Sour Soup
Veg Corn Soup
Tomato Soup
Spicy Tomato Soup
Beverages

Hot Chocolate Drink
Badam Drink
Badam-Pista Drink
Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format (enter the first letter to select main menu):

Welcome to CCD

Enjoy your

Example 1:

Input:
c
1
Output
Welcome to CCD!
Enjoy your Espresso Coffee!
Example 2:

Input
t
9
Output
INVALID OUTPUT!

        * */

/*
        String c[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String t[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String s[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String b[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n=sc.nextInt();
        String res = "";
        if(ch=='c' && n <= 3)
        res = c[n-1];
    else if(ch=='t' && n <= 8)
        res = t[n-1];
    else if(ch=='s' && n <= 4)
        res = s[n-1];
    else if(ch=='b' && n <= 3)
        res = b[n-1];
    else res = "Invalid Input";
        if(res != "Invalid Input" )
            System.out.println("Welcome to CCD!\nEnjoy your "+res);
        else System.out.println(res);
*/

        /*
        * A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values representing age of patients visited on that day is passed as input.

Note:

Age should not be zero or less than zero or above 120
Doctor consults a maximum of 20 patients a day
Enter age value (press Enter without a value to stop):
Example 1:

Input
20
30
40
50
2
3
14
Output
Total Income 2000 INR

        * */

/*
* To check whether a year is leap or not

Step 1:

We first divide the year by 4.
If it is not divisible by 4 then it is not a leap year.
If it is divisible by 4 leaving remainder 0
Step 2:

We divide the year by 100
If it is not divisible by 100 then it is a leap year.
If it is divisible by 100 leaving remainder 0
Step 3:

We divide the year by 400
If it is not divisible by 400 then it is a leap year.
If it is divisible by 400 leaving remainder 0
Then it is a leap year



C	C++	Java	Python	Perl
/*Java program to check whether a year entered by user is a leap year or not and a leap year is a year
which is completely divisible by 4,but the year should not be a century year except it is divisible by 400*/

/*                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Year");
                int year = sc.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");*/

        /*
        * Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?

Whether the number is positive or not, if it is negative then print the message “please enter the positive number”
It is positive then call the function prime and check whether the take positive number is prime or not.

        * */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked : ");
        int n = sc.nextInt();
        Practice1 ob=new Practice1();
        ob.check(n);
    }
    void check(int n) {
        if(n<0)
            System.out.println("Please enter a positive integer");
        else
            prime(n);
    }
    void prime(int n) {
        int c=0;
        for(int i=2;i<n;i++) {
            if(n%i==0)
                ++c;
        }
        if(c>=1)
            System.out.println("Entered number is not a prime number");
        else
            System.out.println("Entered number is a prime number");
*/

        /*Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …

This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.

The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.

You can assume that N will not exceed 30.

*/

/*        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int a = 1, b = 1;
        if(n % 2 == 0) {
            for(int i = 1 ; i <= (n-2) ; i = i+2) {
                a = a * 2;
                b = b * 3;
            }
            System.out.print(n+" element of the series is = "+b);
        }
        else {
            for(int i = 1 ; i < (n-2) ; i = i+2) {
                a = a * 2;
                b = b * 3;
            }
            a = a * 2;
            System.out.print(n+" element of the series is = "+a);
        }*/

        /*Consider the below series :

0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8

This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order and every even terms is derived from the previous  term using the formula (x/2)

Write a program to find the nth term in this series.

The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.

For example if n=10,the 10 th term in the series is to be derived from the 9th term in the series. The 9th term is 8 so the 10th term is (8/2)=4. Only the value 4 should be printed to STDOUT.

You can assume that the n will not exceed 20,000.

*/

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0;
        if(n % 2 == 0) {
            for(int i = 1 ; i <= (n-2) ; i = i+2) {
                a = a + 2;
                b = a / 2;
            }
            System.out.print(b);
        }
        else {
            for(int i = 1 ; i < (n-2) ; i = i+2) {
                a = a + 2;
                b = a / 2;
            }
            a = a + 2;
            System.out.print(a);
        }*/


/*        1. The program will recieve 3 English words inputs from STDIN

        These three words will be read one at a time, in three separate line
        The first word should be changed like all vowels should be replaced by %
                The second word should be changed like all consonants should be replaced by #
        The third word should be changed like all char should be converted to upper case
                Then concatenate the three words and print them
        Other than these concatenated word, no other characters/string should or message should be written to STDOUT

        For example if you print how are you then output should be h%wa#eYOU.*/

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three words : ");
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int l1 = s1.length();
        int l2 = s2.length();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        char c;
        for(int i = 0 ; i < l1 ; i++) {
            c = s1.charAt(i);
            if(c == 'A' || c == 'a' || c == 'E' ||
                    c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
                str1 = str1 + "%";
            else
                str1 = str1 + c;
        }
        for(int i = 0 ; i < l2 ; i++) {
            c = s2.charAt(i);
            if((c >= 'A' && c <= 'Z')||(c >= 'a' && c <= 'z')) {
                if(c == 'A' || c == 'a' || c == 'E' || c == 'e' ||
                        c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
                    str2 = str2 + c;
                else
                    str2 = str2 + "#";
            }
            else
                str2 = str2 + c;
        }
        str3 = s3.toUpperCase();
        System.out.println(str1+str2+str3);
*/

/*Given a pair of positive integers m and n (m < n; 0 < m < 999; 1 < n < = 999), write a program to smartly affix zeroes, while printing the numbers from m to n.



Example-1

Input

5 10

Expected output

05 06 07 08 09 10



Example-2

Input

9 100

Expected output

009 010 011 012 013 014 015 016 017 018 019 020 021 022 023 024 025 026 027 028 029 030 031 032 033 034 035 036 037 038 039 040 041 042 043 044 045 046 047 048 049 050 051 052 053 054 055 056 057 058 059 060 061 062 063 064 065 067 068 069 070 071 072 073 074 075 076 077 078 079 080 081 082 083 084 085 086 087 088 089 090 091 092 093 094 095 096 097 098 099 100



Example-3

Input

1 9*/


/*
        Scanner sc = new Scanner(System.in);
        int low=sc.nextInt();
        int up=sc.nextInt();
        for(int i=low;i<=up;i++)
        {
            if(up>=100)
                System.out.printf("%03d ",i);
            else if(up>=10)
                System.out.printf("%02d ",i);
            else
                System.out.printf("%d ",i);
        }
*/

/*
        Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits.
                Input 1:
        4567
        Expected output:
        2
        Explanation
        The Sum of odd position digits 4 and 6 is 10. The Sum of even position digits 5 and 7 is 12. The difference is 12-10=2.
        Input #2:
        9834698765123

*/
/*        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int Osum=0,Esum=0;
        for(int i=0;i<num.length();i++)
        {
            int n = (int)(num.charAt(i)-'0');
            if(i%2==0)
                Esum+=n;
            else
                Osum+=n;
        }
        System.out.println(Math.abs(Esum-Osum));*/

        /*It was one of the places, where people need to get their provisions only through fair price (“ration”) shops. As the elder had domestic and official work to attend to, their wards were asked to buy the items from these shops. Needless to say, there was a long queue of boys and girls. To minimize the tedium of standing in the serpentine queue, the kids were given mints. I went to the last boy in the queue and asked him how many mints he has. He said that the number of mints he has is one less than the sum of all the mints of kids standing before him in the queue. So I went to the penultimate kid to know how many mints she has
She said that if I add all the mints of kids before her and subtract one from it, the result equals the mints she has. It seemed to be a uniform response from everyone. So, I went to the boy at the head of the queue consoling myself that he would not give the same response as others. He said, “I have four mints”.
Given the number of first kid’s mints (n) and the length (len) of the queue as input, write a program to display the total number of mints with all the kids.
constraints:
2<n<10
1<len<20
Input#1:
4 2
Output:
7
Input#2:
14 4
*/

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int sum=s,prev;
        for(int i=1;i<n;i++)
        {
            prev=sum-1;
            System.out.println(prev);
            sum+=prev;
        }
        System.out.println(sum);
    }
}
