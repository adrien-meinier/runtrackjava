public class Magic {
    public static void main(String[] args) {

        Jeu jeu = new Jeu();

        // Création de cartes
        Terrain t1 = new Terrain('r');
        Terrain t2 = new Terrain('b');
        Terrain t3 = new Terrain('v');
        Creature c1 = new Creature("Nicol Bolas", 10, 10, 7);
        Creature c2 = new Creature("Bombo", 2, 5, 2);
        Creature c3 = new Creature("Shiva", 8, 8, 5);
        Sortilege s1 = new Sortilege("Boule de feu", "Inflige 3 dégâts", 4);
        Sortilege s2 = new Sortilege("Pyroblast", "Inflige 10 dégâts", 9);
        Sortilege s3 = new Sortilege("Eclair de givre!!!", "Inflige 6 dégâts", 3);

        // Ajout au jeu
        jeu.piocher(t1);
        jeu.piocher(t2);
        jeu.piocher(t3);
        jeu.piocher(c1);
        jeu.piocher(c2);
        jeu.piocher(c3);
        jeu.piocher(s1);
        jeu.piocher(s2);
        jeu.piocher(s3);

        // Affichage
        jeu.afficher();

        // Jouer des cartes
        jeu.jouer();
        jeu.jouer();

        // Affichage final
        jeu.afficher();
    }
}