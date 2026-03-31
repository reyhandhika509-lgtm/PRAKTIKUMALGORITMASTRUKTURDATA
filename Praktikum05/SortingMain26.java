package Praktikum05;

public class SortingMain26 {
    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};
        int b[]= {30, 20, 2, 8, 14};
        Sorting26 dataurut1 = new Sorting26(a,a.length);
        
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data Sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        
        Sorting26 dataurut2 = new Sorting26(b,b.length );
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectinSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        
        int c[]= {40, 10, 4, 9, 3};
        Sorting26 dataurut3 = new Sorting26(c,c.length);
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data Sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();

    }
}
