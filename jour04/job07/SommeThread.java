package jour04.job07;

class SommeThread extends Thread {
    private int[] tableau;
    private int debut;
    private int fin;
    private int somme = 0;

    public SommeThread(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
    }

    public void run() {
        for (int i = debut; i < fin; i++) {
            somme += tableau[i];
        }
    }

    public int getSomme() {
        return somme;
    }
}
