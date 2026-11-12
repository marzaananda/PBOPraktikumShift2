package pertemuan5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumlah bilangan : ");
        int b= in.nextInt();

        if (b<=0){
            System.out.println("bilangsn harus lebih dari 0");
        }
        double total = 0;
        for (int i = 0; i < b; i++) {
            System.out.print("bilangan ke-" + i +":") ;
            double a=in.nextDouble();
            total += a;
        }
        double rata =total/b;
        System.out.println("hasil");
        System.out.println("total keseluruhan: "+ total);
        System.out.println("rata-rata: "+ rata);

    }

}
