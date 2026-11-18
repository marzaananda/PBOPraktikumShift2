package pertemuan6;

import java.util.Scanner;

public class Tugas6 {
    public void nomber6() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("masukan jumlah elemen");
            int array = in.nextInt();
            if (array <= 0 ) {
                System.out.println("harus angka");
            }
            int[] data = new int[array];
            System.out.println("masukan nilai elemennya");

            for (int i = 0; i < array; i++) {
                data[i] = in.nextInt();

            }

            int sum = 0;
            for (int num : data) {
                sum += num;
            }
            double rata = (double) sum / array;
            System.out.println("nilai rata rata nya adalah : " + rata);
        } catch (Exception e) {
            System.out.println("salah input mas");
        }
    }
}
