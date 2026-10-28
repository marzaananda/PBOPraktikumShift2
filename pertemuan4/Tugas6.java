package pertemuan4;

import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double belanja = 0;
        int pilih = 0;
        double bayar;
        
        do {
            System.out.println("berbelanja");
            System.out.println("1.beli beras 1kg    = 50000");
            System.out.println("2.beli minyak 1kg   = 30000");
            System.out.println("3.beli sayur 1kg    = 20000");
            pilih =input.nextInt();
            switch (pilih) {
                case 1:
                    belanja += 50000;
                    break;
                case 2:
                    belanja += 30000;
                    break;
                case 3:
                    belanja += 20000;
                    break;
                default:
                    break;
            }
        } while (pilih != 4);
        System.out.println("jumlah belanja " + belanja);
        System.out.println("apakah anda member??");
        char member = input.next().charAt(0);

        if (member == 'y'){
            if (belanja > 500000) {
                belanja =belanja - 50000;
            }else if (belanja > 100000){
                belanja = belanja - 10000;
            }
        }else{
            if (belanja > 100000) {
                belanja = belanja -10000;
            }
        }
        System.out.println("total belanja : " + belanja);
        
        System.out.println("pembayaran....");
        bayar = input.nextDouble();
        System.out.println("uang pembayaran : " + bayar);
        if (bayar < belanja) {
            System.out.println("uang kurang");
        }else{
            bayar = bayar - belanja;
        }
        System.out.println("uang kembalian " + bayar );

    }
}
