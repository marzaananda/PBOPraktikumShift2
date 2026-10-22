package pertemuan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas5 {
        public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("=== HITUNG BUAH IBU SISCA ===");
            
            System.out.print("Masukkan jumlah mangga awal yang dibeli : ");
            int manggaAwal = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jumlah mangga yang busuk        : ");
            int manggaBusuk = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jumlah tetangga yang diberi jambu: ");
            int jumlahTetangga = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan jumlah jambu per tetangga      : ");
            int jambuPerTetangga = Integer.parseInt(reader.readLine());

            
            int totalJambu = jumlahTetangga * jambuPerTetangga;
            int manggaBagus = manggaAwal - manggaBusuk;
            int totalBuahBagus = manggaBagus + totalJambu;
            int totalBuahAwal = manggaAwal + totalJambu;

            
            System.out.println("\n-------------------------------------------");
            System.out.println("          RINCIAN BUAH IBU SISCA           ");
            System.out.println("-------------------------------------------");
            System.out.println("Total Jambu Dibeli           : " + totalJambu + " pcs");
            System.out.println("Total Mangga Dibeli Awal     : " + manggaAwal + " pcs");
            System.out.println("Mangga Busuk (Dikembalikan)  : " + manggaBusuk + " pcs");
            System.out.println("Mangga Bagus Tersisa         : " + manggaBagus + " pcs");
            System.out.println("-------------------------------------------");
            System.out.println("Total Semua Buah Awal Dibeli : " + totalBuahAwal + " pcs");
            System.out.println("Total Buah Bagus Saat Ini    : " + totalBuahBagus + " pcs");
            System.out.println("-------------------------------------------");

        } catch (IOException e) {
            System.err.println("Terjadi kesalahan input/output: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Input harus berupa angka bulat!");
        }
    }
}
