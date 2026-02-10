package Jobsheet1;
import java.util.Scanner;

public class PraktikumPerulangan {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double nim, nilaiAkhir;

        System.out.print("Masukkan NIM anda :");
        nim = sc.nextDouble();
        
        nilaiAkhir = nim % 100;

        if (nilaiAkhir < 10){
            nilaiAkhir += 10;
            System.out.println("Nilai Akhir Anda Adalah : " + nilaiAkhir);
        }else {
            System.out.println("Nilai Akhir Anda Adalah : " + nilaiAkhir);
        }
        for (int i = 1; i <= nilaiAkhir; i++){
            if (i == 10|| i == 15){
                continue;
            }else if (i % 2 == 1){
                System.out.print("*" + "");
            }else if (i % 3 == 0){
                System.out.print("#" + "");
            }else {
                System.out.print(i + "");
            }
        }
    }
}
