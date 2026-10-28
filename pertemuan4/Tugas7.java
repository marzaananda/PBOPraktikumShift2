package pertemuan4;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU LUAS BANGUN DATAR");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilihan = input.nextInt();

        double luas;

        switch (pilihan) {
            case 1: {
                System.out.print("Masukkan panjang sisi: ");
                double sisi = input.nextDouble();

                luas = sisi * sisi;
                System.out.println("Luas persegi = " + luas);
                break;
            }

            case 2: {
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                luas = 0.5 * alas * tinggi;
                System.out.println("Luas segitiga = " + luas);
                break;
            }

            case 3: {
                System.out.print("Masukkan jari-jari: ");
                double jariJari = input.nextDouble();

                luas = 3.14 * jariJari * jariJari;
                System.out.println("Luas lingkaran = " + luas);
                break;
            }

            case 4: {
                System.out.print("Masukkan sisi sejajar pertama: ");
                double sisiA = input.nextDouble();

                System.out.print("Masukkan sisi sejajar kedua: ");
                double sisiB = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                luas = 0.5 * (sisiA + sisiB) * tinggi;
                System.out.println("Luas trapesium = " + luas);
                break;
            }

            case 5: {
                System.out.print("Masukkan diagonal pertama: ");
                double diagonal1 = input.nextDouble();

                System.out.print("Masukkan diagonal kedua: ");
                double diagonal2 = input.nextDouble();

                luas = 0.5 * diagonal1 * diagonal2;
                System.out.println("Luas layang-layang = " + luas);
                break;
            }

            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        input.close();
    }
}
