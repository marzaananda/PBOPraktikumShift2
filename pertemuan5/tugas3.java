package pertemuan5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        int n = in.nextInt() ;
        int k = 1;
        for(int i =1; i<= n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
        }
    }
}
