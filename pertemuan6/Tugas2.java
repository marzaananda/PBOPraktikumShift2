package pertemuan6;

public class Tugas2 {
    public void nomber2() {
        String[] mobil = { "tesla", "suzuki", "civic", "mazda", "bmw" };
        System.out.println("sebelum");
        for (int i = 0; i < mobil.length; i++) {
            System.out.print(mobil[i] + ",");
        }
        System.out.println();
        mobil[1] = "SUBUWU >//<";
        System.out.println("perubahannya");
        for (int i = 0; i < mobil.length; i++) {
            System.out.print(mobil[i] + ",");
        }
        System.out.println();
        System.out.println(mobil[1]);
    }
}
