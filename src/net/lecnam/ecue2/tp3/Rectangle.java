package net.lecnam.ecue2.tp3;

import java.security.KeyStore;

public class Rectangle {
    double longueur;
    double largeur;
    Point origine;

    public Rectangle(Point origine, double longueur, double largeur) {
        this.origine = origine;
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double x, double y, double longueur, double largeur) {
        this.origine = new Point(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double surface() {
        return this.longueur * this.largeur;
    }

    public double retourneSurface() {
        return this.largeur * this.longueur;
    }

    public void translate(double dx, double dy) {
        this.origine.translate(dx, dy);
    }
    public boolean contient(Point point) {
        return (point.x >= this.origine.x) && (point.x <= this.origine.x + this.largeur) &&
                (point.y >= this.origine.y) && (point.y <= this.origine.y + this.longueur);
    }
    public boolean equals(Point point, double largeur, double longueur){
        return (point.x == this.origine.x) && (point.y == this.origine.y) && (longueur == this.longueur) &&
                (largeur == this.largeur);
    }
    public String toString() {
        return "Rectangle [Origine=" + this.origine
                + ", Largeur=" + this.largeur
                + ", Longueur=" + this.longueur
                + ", Surface=" + this.retourneSurface() + "]";
    }



    public static void main(String[] args) {
        // Test du Constructeur 1
        Point p = new Point(1.0, 2.0);
        Rectangle r1 = new Rectangle(p, 10.0, 5.0);

        // Test du Constructeur 2
        Rectangle r2 = new Rectangle(1.0, 2.0, 10.0, 5.0);

        // Test de la surface
        System.out.println("Surface de r2 : " + r2.retourneSurface()); // Affiche 50.0

        // Test de la translation
        System.out.println("Origine avant translation : " + r2.origine.x + ", " + r2.origine.y);
        r2.translate(1.0, 2.0);
        System.out.println("Origine après translation : " + r2.origine.x + ", " + r2.origine.y);

        // Test de la contient()
        Point pDedans = new Point(5.0, 6.0);
        Point pDehors = new Point(0.0, 0.0);

        System.out.println("r2 contient (5, 6) ? " + r2.contient(pDedans));
        System.out.println("r2 contient (0, 0) ? " + r2.contient(pDehors));

        // Test de equals()
        System.out.println("les rectangles sont indentiques ? " + r1.equals(r2));

        // Test de toString()
        System.out.println("Le rectangle r1 : " + r1.toString());
    }
}

