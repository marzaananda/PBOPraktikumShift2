package pertemuan4;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        System.out.print("masukan angka: ");
        nilai = input.nextInt();
        if (nilai % 2 == 0) {
            System.out.println(nilai + " = angka genap");

        }else{
            System.out.println(nilai + " = angka ganjil");
        }
    }
}
