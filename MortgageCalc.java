
import java.util.Scanner;

class MortgageCalc {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        double A, P, r, n = 0;
      
   
        //2. get user input
        System.out.println("Mortgage Calculator!");
        System.out.println("What is the Principle in dollars?");
        P = sc.nextDouble();
        System.out.println("What is the rate?");
        r = sc.nextDouble();
        System.out.println("How long does the mortgage last in years?");
        n = sc.nextDouble();
       
        //3. calculate and display answer
        A = P * Math.pow((1+r),n);
        System.out.println("Your mortgage is worth $" + A + "!");
    }
}