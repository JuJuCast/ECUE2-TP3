package net.lecnam.ecue2.tp3;

public class Dessin {
    // Attributs
    private Rectangle[] lesRectangles; // Le tableau de 10 cases
    private int nbRectangles;          // Le nombre de rectangles réellement présents

    // Constructeur
    public Dessin() {
        this.lesRectangles = new Rectangle[10]; // On réserve un tableau de 10 emplacements
        this.nbRectangles = 0;                  // Au départ, aucun rectangle n'est présent
    }

    public void ajouter(Rectangle r) {
        if (this.nbRectangles < 10) {
            this.lesRectangles[this.nbRectangles] = r; // 1. On place le rectangle dans la case libre
            this.nbRectangles++;                        // 2. On passe à la case suivante
        } else {
            System.out.println("Le dessin est plein !");
        }
    }

    public static void main(String[] args) {
        // 1. Instancier le dessin
        Dessin d = new Dessin();

        // 2. Créer des rectangles
        Rectangle r1 = new Rectangle(1.0, 2.0, 10.0, 5.0);
        Rectangle r2 = new Rectangle(0.0, 0.0, 4.0, 3.0);

        // 3. Les ajouter au dessin
        d.ajouter(r1);
        d.ajouter(r2);
    }
}