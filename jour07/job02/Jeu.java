class Jeu {
    private Carte[] cartes;
    private int nbCartes;

    public Jeu() {
        cartes = new Carte[10];
        nbCartes = 0;
    }

    public void piocher(Carte c) {
        if (nbCartes < 10) {
            cartes[nbCartes] = c;
            nbCartes++;
        } else {
            System.out.println("Le jeu est plein !");
        }
    }

    public void jouer() {
        for (int i = 0; i < nbCartes; i++) {
            if (cartes[i] != null) {
                System.out.println("Carte jouée :");
                cartes[i].afficher();
                cartes[i] = null;
                return;
            }
        }
        System.out.println("Aucune carte à jouer !");
    }

    public void afficher() {
        System.out.println("Contenu du jeu :");
        for (int i = 0; i < nbCartes; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
            } else {
                System.out.println("Emplacement vide");
            }
        }
    }
}
