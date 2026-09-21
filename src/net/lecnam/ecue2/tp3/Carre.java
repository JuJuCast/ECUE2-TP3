package net.lecnam.ecue2.tp3;

public class Carre {
    // Attributs
    private Point origine;
    private double cote;

    // Constructeurs
    public Carre(Point origine, double cote) {
        this.origine = origine;
        this.cote = cote;
    }

    public Carre(double x, double y, double cote) {
        this.origine = new Point(x, y);
        this.cote = cote;
    }

    // Méthodes métier
    public double surface() {
        return this.cote * this.cote;
    }

    public double perimetre() {
        return 4 * this.cote;
    }

    public void translate(double dx, double dy) {
        this.origine.translate(dx, dy);
    }

    // Affichage
    @Override
    public String toString() {
        return "Carre [origine=" + this.origine + ", cote=" + this.cote + "]";
    }

    // Comparaison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carre autre = (Carre) obj;
        return this.cote == autre.cote && this.origine.equals(autre.origine);
    }
    public static void main(String[] args) {
        // Création d'un carré à l'origine (1, 2) avec un côté de 4
        Carre c1 = new Carre(1.0, 2.0, 4.0);

        System.out.println("--- Test du Carre ---");
        System.out.println(c1);
        System.out.println("Surface : " + c1.surface());
        System.out.println("Périmètre : " + c1.perimetre());

        // Test de la translation
        c1.translate(3.0, 1.0);
        System.out.println("Après translation (dx=3, dy=1) : " + c1);

        // Test d'égalité
        Carre c2 = new Carre(4.0, 3.0, 4.0);
        System.out.println("c1 est égal à c2 ? " + c1.equals(c2)); 
    }
}
