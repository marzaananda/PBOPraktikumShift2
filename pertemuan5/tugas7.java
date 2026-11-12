package pertemuan5;

public class tugas7 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("-------------cara 1 (i++)-----------------");
        while (i<5) {
            System.out.println("nilai i :"+(i++));
        }
        System.out.println("nilai akhir: " + i);

        System.out.println("-------------cara 2 (++i)-----------------");
        int j = 0;
        while (j<5) {
            System.out.println("nilai i : "+ (++j));
        }
        System.out.println("nilai akhir i " + j);
    }
}


    