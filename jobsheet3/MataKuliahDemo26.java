package jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo26 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah26 []arrayOfMatakuliah = new Matakuliah26[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++){
            System.out.println("Masukkan Data Mata Kuliah ke-"+(i+1));
            System.out.print("kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");
            
            arrayOfMatakuliah[i] = new Matakuliah26(kode, nama,sks,jumlahJam);
        }
    }
}
