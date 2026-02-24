package jobsheet3;

import java.util.Scanner;

public class DosenDemo26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Dosen26[] arrayOfDosen = new Dosen26[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=Pria, false=Wanita): ");
            Boolean jk = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen26(kode, nama, jk, usia);
            System.out.println();
        }

        System.out.println("=== DATA DOSEN ===");

        for (Dosen26 d : arrayOfDosen) {
            d.tampilInfo();
        }

        
    }
}
