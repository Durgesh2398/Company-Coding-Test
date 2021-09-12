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

    }
}
