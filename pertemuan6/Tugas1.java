package pertemuan6;

public class Tugas1 {
    public void nomber1() {
        int[] angka = new int[5];
        angka[0] = 10;
        angka[1] = 20;
        System.out.println("cara 1");
        System.out.print(angka[0] + ",");
        System.out.print(angka[1]);
        System.out.println();

        int[] angka2 = { 10, 20, 30, 40, 50 };
        System.out.println("cara  ke 2");
        for (int i = 0; i < angka2.length; i++) {
            System.out.print(angka2[i] + ",");
        }
        System.out.println();
        int[] angka3 = new int[] { 10, 20, 30, 40, 50 };
        System.out.println("cara ke 3");
        for (int i = 0; i < angka3.length; i++) {
            System.out.print(angka3[i] + ",");
        }
        System.out.println();
    }
}
