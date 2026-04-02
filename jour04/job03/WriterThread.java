package jour04.job03;

import java.io.RandomAccessFile;
import java.io.IOException;

// Thread pour écrire une partie de la chaîne
class WriterThread extends Thread {
    private String content;
    private long position;

    public WriterThread(String content, long position) {
        this.content = content;
        this.position = position;
    }

    @Override
    public void run() {
        try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw")) {
            file.seek(position); // position dans le fichier
            file.writeBytes(content);
        } catch (IOException e) {
            System.out.println("Erreur thread : " + e.getMessage());
        }
    }
}
