package pertemuan5;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("jumlah bilangan yang ingin di masukan berapa? :");
        int angka = in.nextInt();
        for(int i = 1;i<angka;i++){
            System.out.print("masukan bilangan " +i +":");
            int masuk=in.nextInt();
            if(masuk > i){
                i = angka;
            }
        }
        System.out.println("angka besar nya adalah: "+angka);
    }
}
