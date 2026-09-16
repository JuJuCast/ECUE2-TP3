package net.lecnam.ecue2.tp3;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double x, double y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Point autrePoint = (Point) obj;

        return this.x == autrePoint.x && this.y == autrePoint.y;
    }
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
    public double retourneDistance(Point p) {
        double distx = p.x - this.x;
        double disty = p.y - this.y;

        return Math.sqrt(distx * distx + disty * disty);
    }

    public static void main(String[] args) {
        Point point1 = new Point(3, 5);
        Point point2 = new Point(6, 10);
        System.out.println("Nouveau x : " + point1.x);
        System.out.println("Nouveau y : " + point1.y);

        point1.translate(2, 4);
        System.out.println("Test equals : " + point1.equals(point1));

        point1.toString();
        System.out.println(point1.toString());

        point1.retourneDistance(point2);
        System.out.println("La distance entre le point 1 et 2 est de "+point1.retourneDistance(point2)+" unités");



    }
}