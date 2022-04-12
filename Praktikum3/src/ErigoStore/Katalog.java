/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 3 - Studi Kasus Erigo Store Malang
Mengolah Katalog
 */

package ErigoStore;

public class Katalog {

    final int a = 100000;
    final int b = 125000;
    final int c = 175000;

    static String NamaBarang, NamaJaket;
    static int harga, JumlahBarang, PotonganHarga, HargaAwal, Tagihan;

    Katalog(String KodeJaket, int  JmlhBarang){
        this.JumlahBarang = JmlhBarang;
        this.NamaBarang = KodeJaket;
    }

    void getHJaketA(){
        if (JumlahBarang <= 100){
            this.harga    = 100000;
            PotonganHarga = 0;
        }

        if (JumlahBarang >= 101){
            this.harga    = 95000;
            PotonganHarga = -5000;
        }

    }

    void getHJaketB(){
        if (JumlahBarang <= 100){
            this.harga    = 125000;
            PotonganHarga = 0;
        }

        if (JumlahBarang >= 101){
            this.harga    = 120000;
            PotonganHarga = -5000;
        }

    }

    void getHJaketC(){
        if (JumlahBarang <= 100){
            this.harga    = 175000;
            PotonganHarga =  0;
        }
        if (JumlahBarang >= 101){
            this.harga    = 160000;
            PotonganHarga = -15000;
        }

    }


    void getTagihan()
    {
        if(NamaBarang.equals("a")){
            NamaJaket = "Jaket A";
            HargaAwal = a;
            this.getHJaketA();
        }

        if(NamaBarang.equals("b")){
            NamaJaket = "Jaket B";
            HargaAwal = b;
            this.getHJaketB();
        }

        if(NamaBarang.equals("c")){
            NamaJaket = "Jaket C";
            HargaAwal = c;
            this.getHJaketC();
        }

        Tagihan = harga * JumlahBarang;

        System.out.println("| Nama barang    :\t\t\t\t" + NamaJaket + " |");
        System.out.printf("| Harga satuan   : %20d |", HargaAwal);
        System.out.printf("\n| Potongan Harga : %20d |", PotonganHarga);
        System.out.printf("\n| Harga akhir    : %20d |", harga);
        System.out.printf("\n| Jumlah barang  : %20d |", JumlahBarang);
        System.out.printf("\n| Total tagihan  : %20d |",Tagihan);
    }


}
