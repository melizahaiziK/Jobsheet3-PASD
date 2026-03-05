import java.util.Scanner;
public class MatakuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah11 [] arrayOfMatakuliah = new Matakuliah11[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {

            arrayOfMatakuliah[i] = new Matakuliah11();

            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("Sks          : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("---------------------------");
        }
    }
}
