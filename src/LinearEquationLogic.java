import java.util.Scanner;
public class LinearEquationLogic {
    String coord1;
    String coord2;
    private Scanner myScanner;
    int x1;
    int x2;
    int y1;
    int y2;

    public LinearEquationLogic()    {
        coord1 = null;
        coord2 = null;
        myScanner = new Scanner(System.in);
    }
    public void start() {
        getData();
    }
    private void getData() {
        System.out.println("Welcome to the linear equation calculator! ");
        String goes = "y";
        while (goes.equals("y")) {
            System.out.print("Enter first coordinate: ");
            coord1 = myScanner.nextLine();
            System.out.print("Enter second coordinate: ");
            coord2 = myScanner.nextLine();
            System.out.println("");
            System.out.println("The two points are " + coord1 + " and " + coord2);
            String strx1;
            String stry1;
            String strx2;
            String stry2;
            if (coord1.substring(1, 2).equals("-")) {
                strx1 = coord1.substring(1, 3);
                stry1 = coord1.substring(5, coord1.length() - 1);
            } else {
                strx1 = coord1.substring(1, 2);
                stry1 = coord1.substring(4, coord1.length() - 1);
            }
            if (coord2.substring(1, 2).equals("-")) {
                strx2 = coord2.substring(1, 3);
                stry2 = coord2.substring(5, coord2.length() - 1);
            } else {
                strx2 = coord2.substring(1, 2);
                stry2 = coord2.substring(4, coord2.length() - 1);
            }
            int x1 = Integer.parseInt(strx1);
            int y1 = Integer.parseInt(stry1);
            int x2 = Integer.parseInt(strx2);
            int y2 = Integer.parseInt(stry2);

            LinearEquation coordy = new LinearEquation(x1, x2, y1, y2);
            System.out.println(coordy.lineInfo());
            System.out.println("");
            System.out.print("Enter a value for x: ");
            double x = myScanner.nextDouble();
            myScanner.nextLine();
            String findY = coordy.coordinateForX(x);
            System.out.println(findY);
            System.out.println("");

            System.out.print("Would you like to enter another pair of coordinates? y/n: ");
            goes = myScanner.nextLine();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }
}
