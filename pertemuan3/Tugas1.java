package pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NPM (NIK)    : ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama        : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Alamat      : ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Jabatan     : ");
        String jabatan = input.nextLine();

        double p1 = 2000000;
        double p2 = 300000;
        double p3 = 200000;
        double p4 = 150000;

        double totalGaji = p1 + p2 + p3 + p4;
        double pajakPenghasilan = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajakPenghasilan;

        System.out.println("\n-------------------------------------------");
        System.out.println("            SLIP GAJI PEGAWAI              ");
        System.out.println("-------------------------------------------");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("-------------------------------------------");
        System.out.printf("Gaji Pokok (P1)      : Rp %,.2f\n", p1);
        System.out.printf("Tunjangan Jabatan(P2): Rp %,.2f\n", p2);
        System.out.printf("Tunjangan Istri (P3) : Rp %,.2f\n", p3);
        System.out.printf("Tunjangan Anak (P4)  : Rp %,.2f\n", p4);
        System.out.println("-------------------------------------------");
        System.out.printf("Total Gaji           : Rp %,.2f\n", totalGaji);
        System.out.printf("Pajak Penghasilan(10%): Rp %,.2f\n", pajakPenghasilan);
        System.out.printf("Gaji Bersih          : Rp %,.2f\n", gajiBersih);
        System.out.println("-------------------------------------------");

        input.close();
    }
}
