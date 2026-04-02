class Sortilege extends Carte {
    private String nom;
    private String description;

    public Sortilege(String nom, String description, int cout) {
        super(cout);
        this.nom = nom;
        this.description = description;
        System.out.println("Création d'un Sortilège");
    }

    @Override
    public void afficher() {
        System.out.println("Sortilège - coût: " + cout +
                ", nom: " + nom +
                ", description: " + description);
    }
}
