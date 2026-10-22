package pertemuan3;

import java.io.*;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) throws IOException {
        // no 1
        Scanner Input = new Scanner(System.in);
        System.out.print("Scanner - Masukkan angka: ");
        int angka = Input.nextInt();
        System.out.print("Scanner - Masukkan kata : ");
        String kataScanner = Input.next();
        System.out.println("Hasil Scanner -> Angka: " + angka + ", Kata: " + kataScanner);
        
        // no2
        BufferedReader masuk = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("\nBufferedReader - Masukkan angka: ");
        int angka2 = Integer.parseInt(masuk.readLine());
        
        System.out.print("BufferedReader - Masukkan kata : ");
        String kata = masuk.readLine();
        
        System.out.println("Hasil BufferedReader -> Angka: " + angka2 + ", Kata: " + kata);
    }
}
