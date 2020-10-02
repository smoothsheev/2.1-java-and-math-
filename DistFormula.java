import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        double x = 0;
        double y = 0;
        double x1 = 0;
        double y1 = 0;
        double distance = 0;
        
        //2. get user input
        System.out.println("Coordinate Distance Calculator!");
        System.out.println("Enter the x coordinate of the first point.");
        x = sc.nextDouble();
        System.out.println("Enter the y coordinate of the first point.");
        y = sc.nextDouble();
        System.out.println("Enter the x coordinate of the first point.");
        x1 = sc.nextDouble();
        System.out.println("Enter the y coordinate of the first point.");
        y1 = sc.nextDouble();
       
        
        //3. calculate and display answer
        distance = Math.sqrt((x1 - x)*(x1 - x) + (y1 - y)*(y1 - y));
        System.out.println("The distance between the two points is" + distance + "!");
    }
}