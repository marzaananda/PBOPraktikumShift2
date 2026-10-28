package pertemuan4;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        System.out.println("silahkan masukan tahun lahir mu");

        int tahun;

        Scanner input = new Scanner(System.in);
        tahun = input.nextInt();
        if (tahun % 4 == 0) {
            System.out.println("tahun " + tahun + " adalah kabisat");
        } else {
            System.out.println("bukan kabisat");
        }
    }
}
