/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 7 - Sales
 */

public class Sales extends Pegawai  {
    private double komisi;
    private int penjualan;

    public Sales(String nama, String noKTP,int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setPenjualan (int penjualan ) { this.penjualan = penjualan;}

    public void setKomisi (double komisi ) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        String barang = "",uang = "", duit = "", garis="-------------------------------------------------\n";

        System.out.println("=================================================");
        System.out.println("|                    SALES                      |");
        System.out.println("=================================================");

        System.out.printf("| Nama              : %-25s |\n",this.getNama());
        barang = String.format("| Total Penjualan   : %-2s.0\t\t\t\t\t\t|\n", getPenjualan());
        uang = String.format("| Besaran Komisi    : %-25s |\n", getKomisi());
        duit = String.format("| Pendapatan        : Rp %-22s |\n", (int) (getPenjualan() * getKomisi()));

        return super.toString() + barang + uang + duit + garis;
    }
}


