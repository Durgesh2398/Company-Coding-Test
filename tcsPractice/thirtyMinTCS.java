package tcsPractice;

import java.util.Scanner;
import java.util.Vector;

public class thirtyMinTCS {
    public  static void main(String args[]){

        /*
        Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. If more than one trainee attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.

Note:

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with meaningful message as “All trainees are unfit.
Average Oxygen Values should be rounded.
Example 1:

INPUT VALUES
            95

            92

            95

            92

            90

            92

            90

            92

            90

OUTPUT VALUES
Trainee Number : 1
Trainee Number : 3

        * */

/*
        Scanner  sc =new Scanner(System.in);
        int[][] trainee = new int[3][3];
        int[] average = new int[3];
        int max = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                trainee[i][j] = sc.nextInt();
                if(trainee[i][j] < 1 || trainee[i][j] > 100) {
                    trainee[i][j] = 0;
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                average[i] = average[i] + trainee[j][i];
            }
            average[i] = average[i] / 3;
        }
        for(int i = 0; i < 3; i++) {
            if(average[i] > max) {
                max = average[i];
            }
        }
        for(int i = 0; i < 3; i++) {
            if(average[i] == max) {
                System.out.println("Trainee Number : " + (i + 1));
            }
            if(average[i] <70) {
                System.out.print("Trainee is Unfit");
            }
        }
*/

        /*
        The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is. Key value less than 0 should result into “INVALID INPUT”

Example 1:
Enter your PlainText: All the best
Enter the Key: 1

The encrypted Text is: Bmm uif Cftu
        * */

/*
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                result+=" ";
            }
            else if(Character.isUpperCase(str.charAt(i))){
                char ch=(char)(((int)str.charAt(i)+n-65)%26+65);
                result+=ch;
            }
            else {
                char ch=(char)(((int)str.charAt(i)+n-97)%26+97);
                result+=ch;
            }
        }
        System.out.println(result);
*/

        /*
        * A City Bus is a Ring Route Bus which runs in circular fashion.That is, Bus once starts at the Source Bus Stop, halts at each Bus Stop in its Route and at the end it reaches the Source Bus Stop again.
If there are n  number of Stops and if the bus starts at Bus Stop 1, then after nth Bus Stop, the next stop in the Route will be Bus Stop number 1 always.
If there are n stops, there will be n paths.One path connects two stops. Distances (in meters) for all paths in Ring Route is given in array Path[] as given below:
Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
Fare is determined based on the distance covered from source to destination stop as  Distance between Input Source and Destination Stops can be measured by looking at values in array Path[] and fare can be calculated as per following criteria:

If d =1000 metres, then fare=5 INR
(When calculating fare for others, the calculated fare containing any fraction value should be ceiled. For example, for distance 900n when fare initially calculated is 4.5 which must be ceiled to 5)
Path is circular in function. Value at each index indicates distance till current stop from the previous one. And each index position can be mapped with values at same index in BusStops [] array, which is a string array holding abbreviation of names for all stops as-
“THANERAILWAYSTN” = ”TH”, “GAONDEVI” = “GA”, “ICEFACTROY” = “IC”, “HARINIWASCIRCLE” = “HA”, “TEENHATHNAKA” = “TE”, “LUISWADI” = “LU”, “NITINCOMPANYJUNCTION” = “NI”, “CADBURRYJUNCTION” = “CA”

Given, n=8, where n is number of total BusStops.
BusStops = [ “TH”, ”GA”, ”IC”, ”HA”, ”TE”, ”LU”, ”NI”,”CA” ]

Write a code with function getFare(String Source, String Destination) which take Input as source and destination stops(in the format containing first two characters of the Name of the Bus Stop) and calculate and return travel fare.

Example 1:
Input Values
ca
Ca

Output Values
INVALID OUTPUT

Example 2:
Input Values
NI
HA
Output Values
23.0 INR
        * */

/*
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String d=sc.nextLine();
        String arrs[] = new String[]{"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        float arr[] = {800,600,750,900,1400,1200,1100,1500};
        float res=0;
        int st=0 ,ed=0;
        for(int i=0;i<8;i++) {
            if(s.equals(arrs[i]))
                st=i;

            if(d.equals(arrs[i]))
                ed=i;
        }
        //System.out.println(st+ " "+ed);
        if(st==ed) {
            System.out.println(" INVALID INPUT");
        }
        else {
            int i=st+1;
            System.out.println(i);
            while(i!=ed+1)
            {
                res+=(arr[i]);
                i=(i+1)%8;
            }
            System.out.println((Math.ceil(res*0.005)));
        }
*/


        /*
        * Chain Marketing Organization has has a scheme for income generation, through which its members generate income for themselves. The scheme is such that suppose A joins the scheme and makes R and V to join this scheme  then A is Parent Member of R and V who are child Members. When any member joins the scheme then the parent gets total commission of 10% from each of its child members.
Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%.
Take name of the members joining the scheme as input.
Display how many members joined the scheme including parent member.Calculate the Total commission gained by each members in the scheme. The fixed amount for joining the scheme is Rs.5000 on which commission will be generated
SchemeAmount = 5000

Example 1: When there are more than one child members
Input : (Do not give input prompts.Accept values as follows. )
Amit                     //Enter parent Member as this
Y                           //Enter Y if  Parent member has child members otherwise enter N
Rajesh,Virat        //Enter names of child members of Amit in comma separated
Output:(Final Output must be in format given below.)
TOTAL MEMBERS:3
COMISSION DETAILS
Amit: 1000 INR
Rajesh :250 INR
Virat: 250 INR

Example 2: When there is only one child member in the hierarchy
Input :
Amit
Y
Rajesh
Output:
Total Members: 2
Comission Details
Amit: 500 INR
Rajesh: 250 INR
* */

        Scanner sc =new Scanner(System.in);
        String par =sc.nextLine();
        String x =sc.nextLine();
        if(x=="N"){
            System.out.println("TOTAL MEMBERS:1\n");
            System.out.println("COMISSION DETAILS\n");
            System.out.println(par + ":250 INR\n");
        }
        else{
            String child =sc.nextLine();
            Vector<String>v= new Vector<>();
            String temp = "";
            for (int i = 0; i < child.length(); i++) {
                if (child.charAt(i)== ',') {
                    v.add(temp);
                    temp = "";
                }
                else  if (child.charAt(i) != ' ')
                    temp += child.charAt(i);
            }
            v.add(temp);
            int tomember=(int)v.size() + 1;
            System.out.println("TOTAL MEMBERS:"+tomember );
            System.out.println("COMISSION DETAILS");
            System.out.println(par+":"+v.size() * 500 +" INR");
            for (Object a : v) {
                System.out.println(a + ":"+ "250 INR");
            }
        }
    }
}
