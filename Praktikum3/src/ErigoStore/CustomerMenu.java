/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 3 - Studi Kasus Erigo Store Malang
Main Program
 */

package ErigoStore;
import java.util.*;

public class CustomerMenu {
    //Main Program

    public static void main(String[] args) {
        Scanner AflahHanif = new Scanner(System.in);

        System.out.println("\n-----------------------------------------");
        System.out.println("| Selamat datang di Erigo Store Malang  |\n|" +
                "\tBerikut ini adalah katalog jaket\t|");
        System.out.println("-----------------------------------------");
        System.out.println("| Kode Barang | Nama Barang |   Harga   |");
        System.out.println("=========================================");
        System.out.println("|      a      |   Jaket A   |   100.000 |");
        System.out.println("|      b      |   Jaket B   |   125.000 |");
        System.out.println("|      c      |   Jaket C   |   175.000 |");
        System.out.println("-----------------------------------------");
        System.out.println("|\t\t\tSelamat Berbelanja\t\t\t|");
        System.out.println("-----------------------------------------");

        System.out.print("\nSilahkan masukkan kode barang yang ingin anda beli : ");
        String KodeJaket = AflahHanif.nextLine();

        System.out.print("Silahkan masukkan jumlah barang yang ingin anda beli : ");
        int JumlahJaket = AflahHanif.nextInt();

        Katalog Belanjaan = new Katalog(KodeJaket, JumlahJaket);

        System.out.println("\n-----------------------------------------");
        System.out.println("|\t\t\tErigo Store Malang\t\t\t|");
        System.out.println("=========================================");
        Belanjaan.getTagihan();
        System.out.println("\n-----------------------------------------");
        System.out.println("|\t   Terimakasih Telah Berbelanja\t    |");
        System.out.println("-----------------------------------------");
    }
}
