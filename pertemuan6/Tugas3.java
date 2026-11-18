package pertemuan6;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public void nomber3() {
        Scanner in = new Scanner(System.in);
        System.out.println("masukan jumlah elemen");
        int array = in.nextInt();
        int[] data = new int[array];
        System.out.println("masukan nilai elemennya");
        for (int i = 0; i < array; i++) {
            data[i] = in.nextInt();

        }
        int besar = data[0];
        int kecil = data[0];
        System.out.println("hasil nya");
        for (int i = 0; i < array; i++) {
            System.out.print("[" + data[i] + "]");
            if (data[i] > besar) {
                besar = data[i];
            }
            if (data[i] < kecil) {
                kecil = data[i];
            }
        }
        System.out.println();
        System.out.println("nilai terbesar : " + besar);
        System.out.println("nilai terkecil : " + kecil);
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        int rata = sum / array;
        System.out.println("nilai rata rata nya adalah : " + rata);
        System.out.println("ganjil & genap");
        System.out.print("genap : ");
        int tempData = 0;
        for (int i = 0; i < array; i++) {
            if (data[i] % 2 == 0) {
                System.out.print(data[i] + " ");
            }
            tempData += data[i];
        }
        System.out.println();
        System.out.println("hasil penjumlahan : " + tempData);
        System.out.println();
        // System.out.println();
        // System.out.print("ganjil: ");
        // for (int i = 0; i < array; i++) {
        // if (data[i] % 2 == 1) {
        // System.out.print(data[i] + " ");
        // }
        // }

        Arrays.sort(data);
        System.out.println("urutan " + Arrays.toString(data));

    }

}
