package pertemuan3;

import java.util.Scanner;

public class Tugas6 {
    public class SelisihWaktu {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=== PROGRAM MENGHITUNG SELISIH WAKTU ===");

            
            System.out.println("\n--- Waktu Pertama ---");
            System.out.print("Jam   : ");
            int jam1 = input.nextInt();
            System.out.print("Menit : ");
            int menit1 = input.nextInt();
            System.out.print("Detik : ");
            int detik1 = input.nextInt();

            
            System.out.println("\n--- Waktu Kedua ---");
            System.out.print("Jam   : ");
            int jam2 = input.nextInt();
            System.out.print("Menit : ");
            int menit2 = input.nextInt();
            System.out.print("Detik : ");
            int detik2 = input.nextInt();

            
            int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
            int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

            
            int selisihDetik = Math.abs(totalDetik2 - totalDetik1);

            
            int selisihJam = selisihDetik / 3600;
            int sisaDetik = selisihDetik % 3600;
            int selisihMenit = sisaDetik / 60;
            int detikSisa = sisaDetik % 60;

            
            System.out.println("\n-------------------------------------------");
            System.out.printf("Waktu 1 : %02d:%02d:%02d\n", jam1, menit1, detik1);
            System.out.printf("Waktu 2 : %02d:%02d:%02d\n", jam2, menit2, detik2);
            System.out.println("-------------------------------------------");
            System.out.printf("Selisih : %d Jam, %d Menit, %d Detik\n", selisihJam, selisihMenit, detikSisa);
            System.out.println("-------------------------------------------");

            input.close();
        }
    }
}