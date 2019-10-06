package collections;

import shapes.Point;

class UncomparablePoint implements Comparable {
    private double x;
    private double y;

    public UncomparablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point: x = " + this.x + " "+ "y = " + this.y;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        Point otherPoint = (Point)other ;
        return (Double.compare(this.x, otherPoint.getX()) == 0) && (Double.compare(this.y, otherPoint.getY()) == 0);
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public int compareTo(Object other) {
        double thisDistanceToOrigin = getPointDistanceToOrigin(this.x, this.y);
        Point otherPoint = (Point) other;
        double otherDistanceToOrigin = getPointDistanceToOrigin(otherPoint.getX(), otherPoint.getY());
        return Double.compare(thisDistanceToOrigin, otherDistanceToOrigin);
    }

    private double getPointDistanceToOrigin(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2);
    }


}
