public class LinearEquationRunner {
        public static void main(String[] args)  {
                System.out.println("-------------- TESTING: CORRECT METHOD NAMING & RETURN VALUES --------------");
                int x1 = -1;
                int y1 = 5;
                int x2 = 3;
                int y2 = 10;
                LinearEquation equation = new LinearEquation(x1, x2, y1, y2);
                System.out.println("Equation: " + equation.equation());
                System.out.println("Slope: " + equation.getDoubleSlope());
                System.out.println("y-intercept: " + equation.yintercept());
                System.out.println("Distance: " + equation.distance());
                System.out.println();
                System.out.println("----- Line info -----");
                System.out.println(equation.lineInfo());
                System.out.println();
                double testX = 4;
                System.out.println("Coordinate for x: " + equation.coordinateForX(testX));
                System.out.println("-------------- TESTING: START METHOD BEGINS PROGRAM --------------");
                LinearEquationLogic logic = new LinearEquationLogic();
                logic.start();


                System.out.println("-------------- TESTING: REQUIRED TEST CASES --------------");
                LinearEquation eq1 = new LinearEquation(-1, 3, 5, 10); // good for 5/4 slope
                LinearEquation eq2 = new LinearEquation(-6, 1, -2, -1); // good for 1/7 slope
                LinearEquation eq3 = new LinearEquation(2, -1, 10, 3); // good for 7/3 slope
                LinearEquation eq4 = new LinearEquation(-1, -7, 4, 12); // good for -8/6 slope
                LinearEquation eq5 = new LinearEquation(1, 7, 4, 12); // good for 8/6 slope
                LinearEquation eq12 = new LinearEquation(3, 7, 12, 2); // good for -10/4 slope
                LinearEquation eq13 = new LinearEquation(7, 3, 12, 2); // good for 10/4 slope
                LinearEquation eq14 = new LinearEquation(7, 3, 12, 12); // good for horizontal
                LinearEquation eq15 = new LinearEquation(16, 3, -2, -2); // good for horizontal
                System.out.println(eq1.equation());
                System.out.println(eq2.equation());
                System.out.println(eq3.equation());
                System.out.println(eq4.equation());
                System.out.println(eq5.equation());
                System.out.println(eq12.equation());
                System.out.println(eq13.equation());
                System.out.println(eq14.equation());
                System.out.println(eq15.equation());


                System.out.println("-------------- TESTING: EXTRA CREDIT TEST CASES --------------");
                LinearEquation eq6 = new LinearEquation(4, 6, 0, 10); // good for 5 slope
                LinearEquation eq7 = new LinearEquation(7, 5, 14, 10); // good for 2 slope NO Y-INT
                LinearEquation eq8 = new LinearEquation(6, 8, 2, -12); // good for -7 slope
                LinearEquation eq9 = new LinearEquation(-1, 2, 3, 6); // good for +1 slope
                LinearEquation eq10 = new LinearEquation(-1, -3, 2, 4); // good for -1 slope
                LinearEquation eq11 = new LinearEquation(-2, 4, -2, 4); // good for line through origin
                LinearEquation eq16 = new LinearEquation(0, 4, 0, 5); // good for 5/4 slope NO Y-INT
                LinearEquation eq17 = new LinearEquation(6, 3, 1, 2); // -1/3 slope
                LinearEquation eq20 = new LinearEquation(3, 6, 2, 1); // also -1/3
                LinearEquation eq18 = new LinearEquation(3, 6, 1, 2); // 1/3
                LinearEquation eq19 = new LinearEquation(6, 3, 2, 1); // also 1/3
                LinearEquation eq21 = new LinearEquation(5, 10, 0, 0); // y = 0
                System.out.println(eq6.equation());
                System.out.println(eq7.equation());
                System.out.println(eq8.equation());
                System.out.println(eq9.equation());
                System.out.println(eq10.equation());
                System.out.println(eq11.equation());
                System.out.println(eq16.equation());
                System.out.println(eq17.equation());
                System.out.println(eq20.equation());
                System.out.println(eq18.equation());
                System.out.println(eq19.equation());
                System.out.println(eq21.equation());
        }
}