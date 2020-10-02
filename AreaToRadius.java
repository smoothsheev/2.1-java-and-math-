import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
        //1. declare variables
        Scanner sc = new Scanner(System.in);
        //... other variables go here
        double r = 0;
        double area = 0;
        
        
        //2. get user input
        System.out.println("Circle Radius Calculator");
        System.out.println("Enter the circle's area:");
        area = sc.nextDouble();
        //use sc.nextDouble(); to get a decimal or an int value from terminal.
        //    sc.nextInt(); to get only an int value from terminal.
        //    sc.nextBoolean(); to get a boolean from terminal.
        //    sc.nextLine(); to get a String from terminal.
        
        //3. calculate and display answer
        r = Math.sqrt (area / Math.PI);
        System.out.println("A circle with an area of " + area + "units squared has a radius of " + r + "units!");
    }
}