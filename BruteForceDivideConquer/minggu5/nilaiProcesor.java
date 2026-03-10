package BruteForceDivideConquer.minggu5;

public class nilaiProcesor {
    public static int maxUTS(Mahasiswa26[] arr, int left, int right) {
        if (left == right) {
            return arr[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int maxKiri = maxUTS(arr, left, mid);
        int maxKanan = maxUTS(arr, mid + 1, right);
        return Math.max(maxKiri, maxKanan);
    }

    public static int minUTS(Mahasiswa26[] arr, int left, int right) {
        if (left == right) {
            return arr[left].nilaiUTS;
        }
        int mid = (left + right) / 2;
        int minKiri = minUTS(arr, left, mid);
        int minKanan = minUTS(arr, mid + 1, right);
        return Math.min(minKiri, minKanan);
    }

    public static double rataUAS(Mahasiswa26[] arr) {
        int total = 0;
        for (Mahasiswa26 m : arr) {
            total += m.nilaiUAS;
        }
        return (double) total / arr.length;
    }
    public void tampilkanMahasiswaUTSTertinggi(Mahasiswa26[] arr, int maxNilai){
        System.out.println("Mahasiswa dengan nilai UTS Tertinggi ("+ maxNilai +"):");
        boolean ada = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].nilaiUTS == maxNilai){
                arr[i].tampildata();
                System.out.println("------------------------------");
                ada =true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada data.");
    }
}
     public void tampilkanMahasiswaUTSTerendah(Mahasiswa26[] arr, int minNilai) {
        System.out.println("Mahasiswa dengan nilai UTS terendah (" + minNilai + "):");
        boolean ada = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].nilaiUTS == minNilai) {
                arr[i].tampildata();
                System.out.println("-------------------------");
                ada = true;
            }
        }

        if (!ada) {
            System.out.println("Tidak ada data.");
        }
    }
}