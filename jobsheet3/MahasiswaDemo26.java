package jobsheet3;

import java.util.Scanner;
public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Mahasiswa26 []arrayOfMahasiswa = new Mahasiswa26[3];
        String dummy;
        
        
    
        for(int i=0; i <3; i++){
            arrayOfMahasiswa[i] = new Mahasiswa26();

            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");

        }
        arrayOfMahasiswa[0] = new Mahasiswa26();
        arrayOfMahasiswa[0].nim = "25410410";
        arrayOfMahasiswa[0].nama = "Reyhandhika Zikri P";
        arrayOfMahasiswa[0].kelas = "TI-1G";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa26();
        arrayOfMahasiswa[1].nim = "25410411";
        arrayOfMahasiswa[1].nama = "Rizky Ramadhan";
        arrayOfMahasiswa[1].kelas = "TI-1G";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa26();
        arrayOfMahasiswa[2].nim = "25410412";
        arrayOfMahasiswa[2].nama = "Dimas Pratama";
        arrayOfMahasiswa[2].kelas = "TI-1G";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

    System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
    System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
    System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
    System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
    System.out.println("--------------------------------------");
    System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
    System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
    System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
    System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
    System.out.println("--------------------------------------");
    System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
    System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
    System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
    System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);
    System.out.println("--------------------------------------");

    for(int i=0; i <3; i++){
        System.out.println("Data Mahasiswa ke-"+ (i+1));
        System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
        System.out.println("--------------------------------------");

        

       
        }
    }
}
