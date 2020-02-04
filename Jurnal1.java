package jurnal1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal1 {

    private static Object ww;

    String nik;
    String Nama;
    String ttl;
    String jk;
    int goldar;
    int pilih;

    Scanner del = new Scanner(System.in);

    ArrayList<String> nnik = new ArrayList();
    ArrayList<String> nnama = new ArrayList();
    ArrayList<String> tttl = new ArrayList();
    ArrayList<String> jjk = new ArrayList();
    ArrayList goldarr = new ArrayList();

    public static void main(String[] args) throws IOException {

        Jurnal1 Jurnal1 = new Jurnal1();
        Jurnal1.pilih();

    }

    void inputan() throws IOException {
        System.out.print("Masukan NIK Anda              : ");
        String nik = del.next();
        nnik.add(nik);
        System.out.print("Nama Anda                     : ");
        String nama = del.next();
        nnama.add(nama);
        System.out.print("Masukan Tempat,tgl lhr Anda   : ");
        String ttl = del.next();
        tttl.add(ttl);
        System.out.print("Jenis Kelamin                 : ");
        String jk = del.next();
        jjk.add(jk);
        System.out.print("Golongan Darah Anda           : ");
        int goldar = del.nextInt();
        if (goldar == 1) {
            goldarr.add("A");
        } else if (goldar == 2) {
        goldarr.add("B");
        } else if (goldar == 3) {
           goldarr.add("AB");
        } else if (goldar == 4) {
            goldarr.add("O");
        }

        pilihan();

    }

    void tampilan() throws IOException {
        for (int i = 0; i < nnik.size(); i++) {
            System.out.println("NIK        :" + nnik.get(i));
            System.out.println("Nama       :" + nnama.get(i));
            System.out.println("TTL        :" + tttl.get(i));
            System.out.println("JK         :" + jjk.get(i));
            System.out.println("Goldar     :" + goldarr.get(i));
            System.out.println("-----------------------------------");
        }

        pilih();
    }

    void pilih() throws IOException {
        System.out.println("-------MENU PILIHAN------");
        System.out.println("-   1.Inputan           -");
        System.out.println("-   2.Tampilan          -");
        System.out.println("-   3.Keluar            -");
        System.out.println("-------------------------");

        System.out.print("Masukan Pilihan : ");
        pilih = del.nextInt();

        switch (pilih) {
            case 1:
                inputan();
                break;
            case 2:
                tampilan();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Coba Inputkan Ulang");
                pilih();
                break;
        }
    }

    void pilihan() throws IOException {
        System.out.println("-------MENU PILIHAN------");
        System.out.println("-   1.Mencetak Data     -");
        System.out.println("-   2.Tambah Data Baru  -");
        System.out.println("-   3.Menu            -");
        System.out.println("-------------------------");

        System.out.print("Masukan Pilihan : ");
        pilih = del.nextInt();

        switch (pilih) {
            case 1:
                tampilan();
                break;
            case 2:
                inputan();
                break;
            case 3:
                pilih();
            default:
                System.out.println("Coba Inputkan Ulang");
                pilih();
                break;
        }

    }
}
