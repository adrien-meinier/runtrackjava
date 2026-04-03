package jour04.job06;

class SommeThread extends Thread {
    private int[] tableau;
    private int somme = 0;

    public SommeThread(int[] tableau) {
        this.tableau = tableau;
    }

    public void run() {
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
    }

    public int getSomme() {
        return somme;
    }
}
