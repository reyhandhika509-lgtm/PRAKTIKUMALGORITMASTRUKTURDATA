package BruteForceDivideConquer.minggu5;


public class Mahasiswa26main {
   public static void main(String[] args) {
        
        Mahasiswa26[] mhs = {
            new Mahasiswa26("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa26("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa26("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa26("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa26("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa26("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa26("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa26("Hadi", "220101008", 2020, 82, 84)
        };

        nilaiProcesor data = new nilaiProcesor();
        int utsTertinggi = nilaiProcesor.maxUTS(mhs, 0, mhs.length - 1);
        int utsTerendah = nilaiProcesor.minUTS(mhs, 0, mhs.length - 1);

        
        double rataUAS = nilaiProcesor.rataUAS(mhs);

      
        System.out.println("=== HASIL LATIHAN PRAKTIKUM ===");
        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + utsTertinggi);
        data.tampilkanMahasiswaUTSTertinggi(mhs, utsTertinggi);

        System.out.println("\nNilai UTS terendah (Divide and Conquer): " + utsTerendah);
        data.tampilkanMahasiswaUTSTerendah(mhs, utsTerendah);

        System.out.println("\nRata-rata nilai UAS (Brute Force): " + rataUAS);
        };
        
        

    }
  