package Praktikum05;

import java.util.Scanner;

public class DataDosenMain26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen26 data = new DataDosen26();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampil data dosen");
            System.out.println("3. Sorting ASC (Bubble Sort - termuda ke tertua)");
            System.out.println("4. Sorting DSC (Selection Sort - tertua ke termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

             switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (L/P): ");
                    String jk = sc.nextLine();
                    boolean gender;
                    if (jk.equalsIgnoreCase("L")) {
                        gender = true;
                    } else if (jk.equalsIgnoreCase("P")) {
                        gender = false;
                    } else {
                        System.out.println("Input tidak valid, gunakan L atau P. Default Perempuan.");
                        gender = false;
                    }
                    System.out.print("Masukkan usia dosen: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen26 dsn = new Dosen26(kode, nama, gender, usia);
                    data.tambah(dsn);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.SortingASC();
                    System.out.println("Data setelah sorting ASC:");
                    data.tampil();
                    break;

                case 4:
                    data.SortingDSC();
                    System.out.println("Data setelah sorting DSC:");
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}