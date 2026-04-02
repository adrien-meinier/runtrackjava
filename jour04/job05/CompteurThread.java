package jour04.job05;

class CompteurThread extends Thread {
    private int debut = 0;
    private int fin = 0;
    private int resultat = 0;

    public CompteurThread(int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
    }

    public void run() {
        for (int i = debut; i <= fin; i++) {
            resultat++;
        }
    }

    public int getResultat() {
        return resultat;
    }
}

