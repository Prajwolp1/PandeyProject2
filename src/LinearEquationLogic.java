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

    }
    public void Coords()  {
        System.out.println("Welc ome to the linear equation calculator! ");
        String goes = "y";
        while (goes == "y") {
            System.out.print("Enter first coordinate: ");
            coord1 = myScanner.nextLine();
            System.out.print("Enter second coordinate: ");
            coord2 = myScanner.nextLine();
            System.out.println("");
            System.out.println("The two points are " + coord1 + "and" + coord2);
            if (coord1.substring(1,2).equals("-"))  {
                String strx1 = coord1.substring(1,3);
                String stry1 = coord1.substring(5);
            }   else {
                String strx1 = coord1.substring(1,2);
                String stry1 = coord1.substring(4);
            }
            if (coord2.substring(1,2).equals("-"))  {
                String strx2 = coord2.substring(1,3);
                String stry2 = coord2.substring(5);
            }   else {
                String strx2 = coord2.substring(1,2);
                String stry2 = coord2.substring(4);
            }


        }

    }


}
