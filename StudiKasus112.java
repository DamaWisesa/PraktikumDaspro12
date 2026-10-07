import java.util.Scanner;

public class StudiKasus112 {
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup, uangBayar;
    int totalHarga, diskon, totalBayar;
    int kembalian, kurang;

    System.out.print("Masukkan jumlah cup yang dibeli: ");
    jumlahCup = sc.nextInt();
    System.out.print("Masukkan uang yang dibayar: ");
    uangBayar = sc.nextInt();

    totalHarga = hargaPerCup * jumlahCup;
    diskon = 0;
    System.out.println("Total harga: " + totalHarga);

    if (totalHarga >= 100000) {
        diskon = (int) (totalHarga * 0.1);
    }

    totalBayar = totalHarga - diskon;
    System.out.println("Total harga: " + totalHarga);
    System.out.println("Diskon: " + diskon);
    System.out.println("Total bayar: " + totalBayar);

    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang yang dibayar kurang: " + kurang);
    }

    sc.close();

}