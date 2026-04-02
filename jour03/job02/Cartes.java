abstract class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public abstract void afficher();
}
