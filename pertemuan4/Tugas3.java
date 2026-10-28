package pertemuan4;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String goldar;
        int nik, status;
        String nama;
        System.out.println("masukan biodata");
        System.out.println("masukan nama");
        nama = input.nextLine();
        System.out.println("masukan golongan darah");
        goldar = input.nextLine();
        System.out.println("masukan NIK");
        nik = input.nextInt();
        System.out.println("golongan perkawinan");
        System.out.println("1.menikah");
        System.out.println("2.belum menikah");
        System.out.println("3.cerai(wokwowkwo)");
        System.out.println("4.sudah menikah dan punya anak");
        System.out.println("masukan status perkawinan mu");
        status = input.nextInt();
        int gajiPokok = 0;
        switch (status) {
            case 1:
                gajiPokok += 1200000;
                break;
            case 2:
                gajiPokok += 1500000;
                break;
            case 3:
                gajiPokok += 1750000;
                break;
            case 4:
                gajiPokok += 2000000;
                break;
            default:
                break;
        }
        System.out.println("nama    : " + nama);
        System.out.println("NIK     : " + nik);
        System.out.println("Goldar  : " + goldar);
        System.out.println("status  : " + status);
        System.out.println("total gaji : " + gajiPokok);
    }

}