package pertemuan6;

import java.util.Scanner;

public class Tugas4 {
    public void nomber4() {
        Scanner in = new Scanner(System.in);
        int data;
        System.out.println("masukan jumlah data");
        data = in.nextInt();
        String[] nama = new String[data];
        String[] status = new String[data];
        int[] nilai = new int[data];
        for (int i = 0; i < data; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.println("masukan nama: ");
            in.nextLine();
            nama[i] = in.nextLine();
            System.out.println("masukan nilai : ");
            nilai[i] = in.nextInt();
            if (nilai[i] > 50) {
                status[i] = "lulus";
            } else {
                status[i] = "tidak lulus";
            }
        }
        System.out.println("============daftar nilai==============");
        System.out.println("--------------------------------------");
        System.out.println("nama            nilai           status");
        System.out.println("--------------------------------------");
        for (int i = 0; i < data; i++) {
            System.out.println(nama[i] + "          " + nilai[i] + "            " + status[i]);
        }
    }
}