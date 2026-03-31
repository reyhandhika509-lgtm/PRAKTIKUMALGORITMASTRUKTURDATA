package Praktikum05;

public class DataDosen26 {
    Dosen26[] dataDosen = new Dosen26[10];
    int idx;

    public void tambah(Dosen26 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Bubble Sort ASC (termuda → tertua)
    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j+1].usia) {
                    Dosen26 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j+1];
                    dataDosen[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort DSC (tertua → termuda)
    public void SortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen26 temp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }
}
// package Praktikum05;
// public class DataDosen26 {
//     class DataDosen {
//     Dosen26[] dataDosen = new Dosen26[10];
//     int idx;

//     void tambah(Dosen26 dsn) {
//         if (idx < dataDosen.length) {
//             dataDosen[idx] = dsn;
//             idx++;
//             System.out.println("Data dosen Berhasil ditembahkan");
//         }else{
//             System.out.println("Data dosen sudah penuh! Maksimal 10 data");
//         }
//     }

//     void tampil() {
//         if ( idx ==0){
//             System.out.println("Belum ada data dosen.");
//         }else{
//             System.out.println("=== Data Dosen ===");
//             for (int i =0;i < idx; i++){
//                 dataDosen[i].tampilkanInformasi();
//             }
//         }
//     }
//     // Bubble Sort ASC (usia termuda ke tertua)
//        void SortingASC() {
//         if (idx <= 1) {
//             System.out.println("Data kurang dari 2, tidak perlu sorting.");
//             return;
//         }
//         for (int i = 0; i < idx - 1; i++) {
//             for (int j = 0; j < idx - i - 1; j++) {
//                     Dosen26 temp = dataDosen[j];
//                     dataDosen[j] = dataDosen[j + 1];
//                     dataDosen[j + 1] = temp;
//                 }
//             }
//              System.out.println("Sorting ASC (Bubble Sort) selesai.");
//         }
        
//          void sortingDSC() {
//         if (idx <= 1) {
//             System.out.println("Data kurang dari 2, tidak perlu sorting.");
//             return;
//         }
//         for (int i = 0; i < idx - 1; i++) {
//             int maxIdx = i;
//             for (int j = i + 1; j < idx; j++) {
//                 if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
//                     maxIdx = j;
//                 }
//             }
//             Dosen26 temp = dataDosen[maxIdx];
//             dataDosen[maxIdx] = dataDosen[i];
//             dataDosen[i] = temp;
//         }
//         System.out.println("Sorting DSC (Selection Sort) selesai.");
//     }

//     // Insertion Sort (ascending) - untuk melengkapi class diagram
//     void insertionSort() {
//         if (idx <= 1) {
//             System.out.println("Data kurang dari 2, tidak perlu sorting.");
//             return;
//         }
//         for (int i = 1; i < idx; i++) {
//             Dosen26 key = dataDosen[i];
//             int j = i - 1;
//             while (j >= 0 && dataDosen[j].usia > key.usia) {
//                 dataDosen[j + 1] = dataDosen[j];
//                 j--;
//             }
//             dataDosen[j + 1] = key;
//         }
//         System.out.println("Insertion Sort (ascending) selesai.");
//     }
// }
//     }
    

