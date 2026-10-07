import java.util.Scanner;

public class StudiKasus212 {
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String namaMahasiswa;
    String jenisLomba;
    int jumlahDokumen, peringkatJuara, statusPkm;

    System.out.print("Masukkan nama mahasiswa: ");
    namaMahasiswa = sc.nextLine();
    System.out.print("Masukkan jenis lomba (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
    jenisLomba = sc.nextLine();

    if (jenisLomba.equalsIgnoreCase("belmawa") || jenisLomba.equalsIgnoreCase("bakorma")
            || jenisLomba.equalsIgnoreCase("mandiri")) {

        System.out.print("Masukkan jumlah dokumen yang dikumpulkan: ");
        jumlahDokumen = sc.nextInt();
        System.out.print("Masukkan peringkat juara (1, 2, atau 3): ");
        peringkatJuara = sc.nextInt();

        if (jumlahDokumen == 4)
            if (peringkatJuara > 0 && peringkatJuara < 4)

                System.out.println("Selamat " + namaMahasiswa + ", Anda mendapatkan dana penghargaan");
            else
                System.out.println("Maaf " + namaMahasiswa + ", Dokumen anda kurang lengkap");

        else if (jumlahDokumen < 4 && jumlahDokumen >= 0)
            if (peringkatJuara > 0 && peringkatJuara < 4)
                System.out.println(
                        "Maaf " + namaMahasiswa + ", Dokumen anda kurang lengkap " + (4 - jumlahDokumen) + " dokumen");

        sc.close();
    }
}