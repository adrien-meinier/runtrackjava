class Creature extends Carte {
    private String nom;
    private int degats;
    private int pointsVie;

    public Creature(String nom, int degats, int pointsVie, int cout) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.pointsVie = pointsVie;
        System.out.println("Création d'une Créature");
    }

    @Override
    public void afficher() {
        System.out.println("Créature - coût: " + cout +
                ", nom: " + nom +
                ", dégâts: " + degats +
                ", vie: " + pointsVie);
    }
}
