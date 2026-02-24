package jobsheet3;

public class DataDosen26 {
    public void dataSemuaDosen(Dosen26[] arrayOfDosen) {
        for (Dosen26 d : arrayOfDosen) {
            d.tampilInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen26 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen26[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int pria = 0, wanita = 0;

        for (Dosen26 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                pria++;
            } else {
                totalWanita += d.usia;
                wanita++;
            }
        }

        if (pria > 0)
            System.out.println("Rata-rata usia dosen Pria   : " + (totalPria / pria));
        if (wanita > 0)
            System.out.println("Rata-rata usia dosen Wanita : " + (totalWanita / wanita));
    }

    public void infoDosenPalingTua(Dosen26[] arrayOfDosen) {
        Dosen26 tertua = arrayOfDosen[0];

        for (Dosen26 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("=== DOSEN PALING TUA ===");
        tertua.tampilInfo();
    }

    public void infoDosenPalingMuda(Dosen26[] arrayOfDosen) {
        Dosen26 termuda = arrayOfDosen[0];

        for (Dosen26 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("=== DOSEN PALING MUDA ===");
        termuda.tampilInfo();
    }
}
