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
        return deltaY + "/"+ deltaX + "x";
    }
    public double getDoubleSlope()    {
        double intSlope = (double)deltaY / deltaX;
        intSlope = Math.round(intSlope * 100) / 100.0;
        return intSlope;
    }
    public double intercept() {
        b = yOne - (((double) deltaY / deltaX) * xOne);
        b = Math.round(b * 100) / 100.0;
        return b;
    }
    public double distance()    {
        double d = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        d = Math.round(d * 100) / 100.0;
        return d;
    }
    public String lineInfo()  {
        return"The equation of the line between these slopes is: y = " + slopes() + " + " + intercept() + "\nThe slope of this line is: " + getDoubleSlope() + "\nThe y-intercept of the line is: " + intercept() + "\nThe distance between the two points is: " + distance() ;
    }
    public String coordinateForX(double x) {
        xEquation = x;
        xEquation *= getDoubleSlope();
        xEquation += intercept();
        return "The point on this line is (" + x + ", " + xEquation + ")";
    }

}
