package pertemuan5;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        int hasil=0;
        for (int i = 0; i<angka; i++) {
            if (i%2 ==1) {
                System.out.print(i+" ");
                hasil +=i;
            }
        }
        System.out.println("hasil nya: " + hasil);
    }
}
