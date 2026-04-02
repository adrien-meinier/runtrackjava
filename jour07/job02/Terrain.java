class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0); // coût toujours 0
        this.couleur = couleur;
        System.out.println("Création d'un Terrain");
    }

    @Override
    public void afficher() {
        System.out.println("Terrain - coût: " + cout + ", couleur: " + couleur);
    }
}