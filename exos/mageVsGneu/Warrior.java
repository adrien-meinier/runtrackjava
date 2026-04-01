public class Warrior extends Character {

    public Warrior(String nom, int pointsDeVie, int attaque) {
        super(nom, pointsDeVie, attaque);
    }

    @Override
    public void attack(Character target) {
        System.out.println(nom + " COUP DE BOULE !");
        target.takeDamage(attaque); 
    }
}
