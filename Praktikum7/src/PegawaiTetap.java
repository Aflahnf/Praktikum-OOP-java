/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 7 - Pegawai Tetap
 */

public class PegawaiTetap extends Pegawai {
    private double upah;


    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah=upah;
    }

    public void setUpah (double upah) {
        this.upah=upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public String toString() {
        String  penghasilan1="",penghasilan2="", garis="-------------------------------------------------\n";

        System.out.println("=================================================");
        System.out.println("|                PEGAWAI TETAP                  |");
        System.out.println("=================================================");

        System.out.printf("| Nama              : %-25s |\n",this.getNama());
        penghasilan1 = String.format("| Upah              : %-25s |\n",this.getUpah());
        penghasilan2 = String.format("| Pendapatan        : Rp %-22s |\n", (int)(getUpah()));

        return super.toString() + penghasilan1 + penghasilan2 + garis;
    }
}