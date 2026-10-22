package pertemuan3;

import java.util.Scanner;

public class Tugas4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAYA SENTRIPETAL (Fc) ===");
        
        System.out.print("Masukkan Massa (M) dalam kg        : ");
        double m = input.nextDouble();

        System.out.print("Masukkan Kecepatan (V) dalam m/s   : ");
        double v = input.nextDouble();

        System.out.print("Masukkan Jari-jari (r) dalam meter : ");
        double r = input.nextDouble();

        if (r == 0) {
            System.out.println("Error: Jari-jari (r) tidak boleh bernilai nol (0)!");
        } else {
            
            double fc = (m * Math.pow(v, 2)) / r;

            System.out.println("\n-------------------------------------------");
            System.out.printf("Gaya Sentripetal (Fc) = %.2f Newton\n", fc);
            System.out.println("-------------------------------------------");
        }

        input.close();
    }
}
