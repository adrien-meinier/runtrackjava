public abstract class Character {
    protected String nom;
    protected int pointsDeVie;
    protected int attaque;

    public Character(String nom, int pointsDeVie, int attaque) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
    }

    public abstract void attack(Character target);

    public void takeDamage(int dmg) {
        pointsDeVie -= dmg;
        if (pointsDeVie < 0) {
            pointsDeVie = 0;
        }
    }

    public boolean isAlive() {
        return pointsDeVie > 0;
    }

    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getAttaque() {
        return attaque;
    }
}
