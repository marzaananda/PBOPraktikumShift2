package pertemuan3;

import java.io.*;

public class Tugas2 {
    public static void main(String[] args) {
        String filename = "transaksi.dat";

        
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("=== INPUT DATA PEMBELANJAAN ===");
            System.out.print("Nama          : ");
            String nama = reader.readLine();

            System.out.print("Total Belanja : ");
            double totalBelanja = Double.parseDouble(reader.readLine());

            System.out.print("Diskon (%)    : ");
            double diskonPersen = Double.parseDouble(reader.readLine());

            System.out.print("Bayar         : ");
            double bayar = Double.parseDouble(reader.readLine());

            
            dos.writeUTF(nama);
            dos.writeDouble(totalBelanja);
            dos.writeDouble(diskonPersen);
            dos.writeDouble(bayar);

            System.out.println("\nData transaksi berhasil disimpan ke file.\n");

        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat menulis data: " + e.getMessage());
        }

        
        
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {

            String nama = dis.readUTF();
            double totalBelanja = dis.readDouble();
            double diskonPersen = dis.readDouble();
            double bayar = dis.readDouble();

            
            double nominalDiskon = (diskonPersen / 100) * totalBelanja;
            double totalSetelahDiskon = totalBelanja - nominalDiskon;
            double kembalian = bayar - totalSetelahDiskon;

            
            System.out.println("=== STRIP PEMBAYARAN (READ FROM FILE) ===");
            System.out.println("Nama          : " + nama);
            System.out.printf("Total Belanja : Rp %,.2f\n", totalBelanja);
            System.out.printf("Diskon (%%)    : %.1f%%\n", diskonPersen);
            System.out.printf("Total Akhir   : Rp %,.2f\n", totalSetelahDiskon);
            System.out.printf("Bayar         : Rp %,.2f\n", bayar);
            System.out.printf("Kembalian     : Rp %,.2f\n", kembalian);
            System.out.println("=========================================");

        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca data: " + e.getMessage());
        }
    }
}
