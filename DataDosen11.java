public class DataDosen11 {
    void dataSemuaDosen(Dosen11[] arrayOfDosen){
        int no = 1;
        for (Dosen11 dsn : arrayOfDosen){
            System.out.println("Data Dosen ke-" + no++);
            System.out.println("Kode : " + dsn.kode);
            System.out.println("Nama : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia : " + dsn.usia);
            System.out.println("------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen11) {
        int pria = 0;
        int wanita = 0;

        for (Dosen11 dsn : arrayOfDosen11) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println();
    }
    void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen){
        int pria = 0;
        int wanita = 0;
        int totalPria = 0;
        int totalWanita = 0;

        for (Dosen11 dsn : arrayOfDosen){
            if(dsn.jenisKelamin){
                pria++;
                totalPria += dsn.usia;
            } else {
                wanita++;
                totalWanita += dsn.usia;
            }
        }
        System.out.println("Rata-rata usia dosen pria : " + (totalPria/pria));
        System.out.println("Rata-rata usia dosen wanita : " + (totalWanita/wanita));
        System.out.println();
    }
    void infoDosenPalingTua(Dosen11[] arrayOfDosen){
        Dosen11 tertua = arrayOfDosen[0];

        for (Dosen11 dsn : arrayOfDosen){
            if(dsn.usia > tertua.usia){
                tertua = dsn;
            }
        }
        System.out.println("Dosen Paling Tua : ");
        System.out.println("Nama : " + tertua.nama);
        System.out.println("Usia : " + tertua.usia);
        System.out.println();
    }
     void infoDosenPalingMuda(Dosen11[] arrayOfDosen){
        Dosen11 termuda = arrayOfDosen[0];

        for (Dosen11 dsn : arrayOfDosen){
            if(dsn.usia < termuda.usia){
                termuda = dsn;
            }
        }
        System.out.println("Dosen Paling Muda : ");
        System.out.println("Nama : " + termuda.nama);
        System.out.println("Usia : " + termuda.usia);
    }
}

