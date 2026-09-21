package net.lecnam.ecue2.tp3;

public class Dessin {
    // Attributs
    private Rectangle[] lesRectangles;
    private int nbRectangles;

    // Constructeur
    public Dessin() {
        this.lesRectangles = new Rectangle[10];
        this.nbRectangles = 0;
    }

    // Ajoute un rectangle dans le tableau s'il reste de la place
    public void ajouter(Rectangle r) {
        if (this.nbRectangles < 10) {
            this.lesRectangles[this.nbRectangles] = r;
            this.nbRectangles++;
        } else {
            System.out.println("Le dessin est plein !");
        }
    }

    // Recherche et retourne le plus grand rectangle
    public Rectangle retournePlusGrandRectangle() {
        if (this.nbRectangles == 0) {
            return null;
        }

        Rectangle plusGrand = this.lesRectangles[0];

        for (int i = 1; i < this.nbRectangles; i++) {
            if (this.lesRectangles[i].surface() > plusGrand.surface()) {
                plusGrand = this.lesRectangles[i];
            }
        }

        return plusGrand;
    }

    // Calcule la somme des surfaces de tous les rectangles
    public double surfaceTotale() {
        double somme = 0;
        for (int i = 0; i < this.nbRectangles; i++) {
            somme += this.lesRectangles[i].surface();
        }
        return somme;
    }

    // Translate tous les rectangles du dessin
    public void translateTous(double dx, double dy) {
        for (int i = 0; i < this.nbRectangles; i++) {
            this.lesRectangles[i].translate(dx, dy);
        }
    }

    public static void main(String[] args) {
        Dessin d = new Dessin();

        Rectangle r1 = new Rectangle(1.0, 2.0, 10.0, 5.0);
        Rectangle r2 = new Rectangle(0.0, 0.0, 4.0, 3.0);
        Rectangle r3 = new Rectangle(0.0, 0.0, 12.0, 6.0);

        d.ajouter(r1);
        d.ajouter(r2);
        d.ajouter(r3);

        System.out.println("Surface totale du dessin : " + d.surfaceTotale());

        // Test de la translation globale
        System.out.println("Le rectangle le plus grand est : " + d.retournePlusGrandRectangle());

        // Test du plus grand rectangle
        Rectangle plusGrand = d.retournePlusGrandRectangle();

    }
}