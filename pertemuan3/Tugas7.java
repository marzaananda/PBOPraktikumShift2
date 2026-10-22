package pertemuan3;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MESIN CETAK NOVEL (1 Lembar / Detik) ===");

        System.out.print("Masukkan Jumlah Novel yang Akan Dicetak : ");
        int jumlahNovel = input.nextInt();

        System.out.print("Masukkan Tebal Lembar Per Novel         : ");
        int tebalLembar = input.nextInt();

        long totalLembar = (long) jumlahNovel * tebalLembar;
        long totalDetik = totalLembar;

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("\n-------------------------------------------");
        System.out.println("            ESTIMASI WAKTU CETAK           ");
        System.out.println("-------------------------------------------");
        System.out.println("Total Lembar Harus Dicetak : " + totalLembar + " lembar");
        System.out.println("Total Waktu Dalam Detik    : " + totalDetik + " detik");
        System.out.println("-------------------------------------------");
        System.out.println("Waktu Diperlukan           : ");
        System.out.println(hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");
        System.out.println("-------------------------------------------");

        input.close();
    }
}
