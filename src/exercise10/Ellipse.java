package exercise10;

public class Ellipse extends Figure{

    private Point startPoint;
    private double side 1;
    private double b;

    public Ellipse() {
      super(new Point(0,0) , 1 , 1);

    }

    public Ellipse(Point startPoint, double side1, double side2) {
        super(new Point(startPoint), side1, side2);


    }

    public Ellipse(Ellipse otherEllipse) {
        startPoint = new Point(otherEllipse.startPoint);
        side1 = otherEllipse.side1;
        side2 = otherEllipse.side2;
    }


    public double calculatePerimeter() {
        return Math.PI * (3.0 * (side1 + side2) - Math.sqrt((3.0 * side1 + side2) * (side1 + 3.0 * side2)));
    }

    public double calculateArea() {
        return Math.PI * side1 * side2;
    }

    public String getType() {
        return (side1 == side2) ? "Circle" : "Ellipse";
    }

    public boolean equal(Ellipse otherEllipse) {
        boolean sameSide1 = Utils.equals(side1, otherEllipse.side1);
        boolean sameSide2 = Utils.equals(side2, otherEllipse.side2);
        boolean sameSide1Reversed = Utils.equals(side1, otherEllipse.side2);
        boolean sameSideBReversed = Utils.equals(side2, otherEllipse.side2);

        return (sameA && sameB) || (sameAReversed && sameBReversed);
    }

    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle
        double solution = Math.pow((click.getX()- startPoint.getX()),2)/(Math.pow(side2,2));

        return false;
    }
}
