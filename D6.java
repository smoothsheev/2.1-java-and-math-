import java.util.Scanner;

class D6 {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10 = 0;
        int damage = 0;
        //2. get user input
        
        
        //3. calculate and display answer
        d1 = (int) (Math.random()*6) + 1;
        d2 = (int) (Math.random()*6) + 1;
        d3 = (int) (Math.random()*6) + 1;
        d4 = (int) (Math.random()*6) + 1;
        d5 = (int) (Math.random()*6) + 1;
        d6 = (int) (Math.random()*6) + 1;
        d7 = (int) (Math.random()*6) + 1;
        d8 = (int) (Math.random()*6) + 1;
        d9 = (int) (Math.random()*6) + 1;
        d10 = (int) (Math.random()*6) + 1;
        damage = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10;
        
        System.out.println("You rolled a " + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "," + d6 + "," + d7 + "," + d8 + "," + d8 + "," + d9 + "," + d10 + "!  That's " + damage + " damage!");
    }
}