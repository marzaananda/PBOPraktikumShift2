package pertemuan4;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gajiAkhir, penjualan;
        double komisi = 0 ;
        double jasa = 0;

        System.out.println("==============laporan Sales==============");
        System.out.println("Masukan laporan");
        penjualan = input.nextDouble();
        if (penjualan == 2000000) {
            jasa = 100000;
            komisi = penjualan * 0.10;
            gajiAkhir =  jasa + komisi;
            System.out.println("hasil akhirnya : " + gajiAkhir);
        } else if (penjualan >= 2000000) {
            jasa = 200000;
            komisi = penjualan * 0.15;
            gajiAkhir =   jasa + komisi;
            System.out.println("hasil akhirnya : " + gajiAkhir);
        } else if (penjualan >= 5000000) {
            jasa = 300000;
            komisi = penjualan * 0.20;
            gajiAkhir =   jasa + komisi;
            System.out.println("hasil akhirnya : " + gajiAkhir);
        }
        System.out.println("laporan akhir penjualan");
        System.out.println("penjualan   = " + penjualan );
        System.out.println("komisi      = " + komisi );
        System.out.println("jasa        = " + jasa );

    }
}
