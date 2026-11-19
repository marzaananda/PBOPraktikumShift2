package pertemuan6;

// Harus menambahkan "extends Thread"
public class Tugas7 extends Thread {
    
    // Nama method wajib "run()", bukan "nomber7()"
    @Override 
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tugas 7 - thread berjalan ke-" + i);
            try {
                Thread.sleep(1000); // Jeda 1 detik (5000 = 5 detik)
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu: " + e.getMessage());
            }
        }
        System.out.println("Tugas 7 done");
    }
}
