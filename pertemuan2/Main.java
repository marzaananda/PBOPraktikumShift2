/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author ASUS
 */
public class Main {
//    soal no 1&2 sudah dibereskan
    
    public static void main(String[] args) {
        System.out.println("soal no 3");
        PersamaanKuadrat hitung = new PersamaanKuadrat();
        int hasilitung = hitung.rumusNya(2, 10, 5);
        System.out.println("hasil " +hasilitung);
        System.out.println("soal no 4");
        OperasiMatematika operasi = new OperasiMatematika();
        operasi.mateMatika();
        System.out.println("soal no 5");
        Segitiga luasSegitiga = new Segitiga();
        luasSegitiga.alasSegitiga();
        System.out.println("soal no 6");
        Segitiga objek = new Segitiga();
        objek.pyhtagoras();
        System.out.println("soal no 7");
        String teks = "saya suka java";
        System.out.println(teks);
        teks = teks.toUpperCase();
        System.out.println(teks);
        noLapan delapan = new noLapan();
        delapan.hitung();
        System.out.println("soal no 9");
        Suhu  noSembilan = new Suhu();
        noSembilan.konversi();
    }
}

class PersamaanKuadrat{
    int a,b,c;
    public int rumusNya(int a,int b,int c){
    this.a =  a;
    this.b = b;
    this.c = c;
    int hasil = (b*b) - (4*a*c);
    return hasil;
    }
}

class OperasiMatematika{
    public void mateMatika(){
        int a = 22;
        int b = 33;
        int pengurangan = a -b;
        int penjuumlaham = a+b;
        int perkalian = a*b;
        int pembagian = a/b;
        System.out.println("HASIL PENJUMLAHAM = " + penjuumlaham);
        System.out.println("HASIL PENGURANGAN = " + pengurangan);
        System.out.println("HASIL PERKALIAN = " + perkalian);
        System.out.println("HASIL PEMBAGIAN = " + penjuumlaham);
    }
}

class Segitiga{
        double a = 6;
        double b = 8;
    public void alasSegitiga(){
        double a = 6;
        double b = 8;
        double c =0.5* a * b;
        System.out.println("hasilnya = " + c);
    }
    public void pyhtagoras() {
        double a = 6;
        double b = 8;
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("hasil pytagoras = " + c);
        double keliling = a + b +c; 
        System.out.println("keliling nya adalah = "+keliling);
    }
}

class noLapan {
    public void hitung (){
    double keBulan= 385000;
    double keMataHari = 152100000;
    double kecepatan = 300000;
    
    double bumiKebulan = keBulan / kecepatan;
    System.out.println("hasil hitungan bumi ke bulan = " + bumiKebulan + " km/s");
    double bumiKeMataHari =  keMataHari / kecepatan;
        System.out.println("hasil hitungan bumi ke matahari = " + bumiKeMataHari + " km/s");
}
}

class Suhu{
    public void konversi(){
        double celcius = 10;
        double fahrenheit =15;
        double reamur = 5;
        
        double hasilRkc,hasilCkeF,hasilFker;
        hasilCkeF = fahrenheit * 1.8 + 32;
        hasilFker = (4.0/9.0) * (fahrenheit - 32);
        hasilRkc = (5.0 /4.0) *reamur;
        System.out.println(hasilCkeF);
        System.out.println(hasilFker);
        System.out.println(hasilRkc);
    }
}
