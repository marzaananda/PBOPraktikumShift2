package pertemuan6;

public class Tugas9 {
    public void nomber9(){
        int[] age = {12,4,5,2,6};
        System.out.println("cara 1");
        for (int i = 0; i < age.length; i++) {
            System.out.print(age[i]+" ");
        }
        System.out.println();
        System.out.println("cara 2");
        for(int panjang:age){
            System.out.print(panjang+" ");
        }
    }
}
