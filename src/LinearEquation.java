public class LinearEquation {
    int xOne;
    int xTwo;
    int yOne;
    int yTwo;
    int deltaY;
    int deltaX;
    String slope;
    double b;
    double xEquation;

    public LinearEquation(int x1, int x2, int y1, int y2)   {
        xOne = x1;
        xTwo = x2;
        yOne = y1;
        yTwo = y2;
    }
    public String slopes() {
        deltaY = yTwo - yOne;
        deltaX = xTwo - xOne;
        if (deltaY / deltaX == 1)   {
            return "x";
        }
        if (deltaY / deltaX == -1)  {
            return "-x";
        }
        if (deltaY % deltaX == 0)    {
            return deltaY / deltaX + "x";
        }
        if (deltaX < 0 && deltaY < 0)   {
            return Math.abs(deltaY) + "/"+ Math.abs(deltaX) + "x";
        }
        if (deltaX < 0) {
            return "-" + deltaY + "/" + Math.abs(deltaX) + "x";
        }
        return deltaY + "/"+ deltaX + "x";
    }
    public double getDoubleSlope()    {
        double doubleSlope = (double)deltaY / deltaX;
        doubleSlope = roundedToHundredth(doubleSlope);
        return doubleSlope;
    }
    public double yintercept() {
        if (yOne == yTwo)   {
            return yOne;
        }
        b = yOne - (((double) deltaY / deltaX) * xOne);
        b = roundedToHundredth(b);
        return b;
    }
    public double distance()    {
        if (yOne == yTwo)   {
            return xTwo - xOne;
        }
        double d = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        d = roundedToHundredth(d);
        return d;
    }
    public String equation()    {
        if (yOne == yTwo)    {
            return "y = " + yintercept();
        }
        if (xOne == 0 && yOne == 0)  {
            return "y = " + slopes();
        }
        if(yOne - (((double) (yTwo - yOne) / (xTwo - xOne)) * xOne) < 0)    {
            return "y = " + slopes() + " - " + Math.abs(yintercept());
        }
        return "y = " + slopes() + " + " + yintercept();
    }
    public String lineInfo()  {
        return"The equation of the line between these slopes is: " + equation() + "\nThe slope of this line is: " + getDoubleSlope() + "\nThe y-intercept of the line is: " + yintercept() + "\nThe distance between the two points is: " + distance() ;
    }
    public String coordinateForX(double x) {
        xEquation = x;
        xEquation *= getDoubleSlope();
        xEquation += yintercept();
        xEquation = roundedToHundredth(xEquation);
        return "\nThe point on this line is (" + x + ", " + xEquation + ") \n";
    }

    private double roundedToHundredth(double toRound)   {
        return Math.round(toRound * 100) / 100.0;
    }

}