package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah elemen: ");
        int elemen = sc.nextInt();
        sum sm = new sum(elemen);
        for(int i=0;i<elemen;i++){
            System.out.print("Masukkan Keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = sc.nextDouble();
      }
      System.out.println("Total Keuntungan Menggunakan BruteForce: "+sm.totalBF());
      System.out.println("Total Keuntungan mengguna Dive and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
