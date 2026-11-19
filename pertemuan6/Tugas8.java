package pertemuan6;

// Tugas8 mewarisi Tugas7 (otomatis juga merupakan turunan Thread)
public class Tugas8 extends Tugas7 {
    private int nomorThread;

    // Nama konstruktor wajib sama dengan nama kelas (Tugas8)
    public Tugas8(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    // Override ulang method run() milik Tugas7
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread Anak ke-" + nomorThread + " sedang memproses langkah " + i);
            try {
                Thread.sleep((long) (Math.random() * 500));
            } catch (InterruptedException e) {
                System.out.println("Thread ke-" + nomorThread + " terganggu.");
            }
        }
        System.out.println(">>> Thread Anak ke-" + nomorThread + " SELESAI.");
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Menjalankan 1 thread dari Tugas7
        Tugas7 t7 = new Tugas7();
        t7.start();

        // Menjalankan 3 thread dari Tugas8
        for (int i = 1; i <= 3; i++) {
            Tugas8 t8 = new Tugas8(i);
            t8.start();
        }
    }
}
