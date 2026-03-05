import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen11 [] arrayOfDosen11 = new Dosen11[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data dosen ke- " + (i+1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen11[i] = new Dosen11(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------");
        }

        System.out.println("Data Dosen :");
        int no = 1;
        for (Dosen11 dsn : arrayOfDosen11) {
            System.out.println("Data Dosen ke-" +no);
            System.out.println("Kode           : " + dsn.kode);
            System.out.println("Nama           : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + dsn.usia);
            System.out.println("---------------------------"); 

            no++;
        }
    }
}
