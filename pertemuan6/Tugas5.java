package pertemuan6;

import java.util.Scanner;

public class Tugas5 {
    public void nomber5() {
        Scanner in = new Scanner(System.in);
        System.out.print("masukan baris:");
        int baris = in.nextInt();
        System.out.print("masukan kolom:");
        int kolom = in.nextInt();
        int[][] array = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("[" + i + "][" + i + "] = ");
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("hasil");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
        int hasil=0;
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil += array[i][j];
            }
        }
        System.out.println("hasil array " + hasil);

    }
}
