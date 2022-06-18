/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 7 - Pegawai Harian
 */

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

public PegawaiHarian (String nama, String noKTP, double upahPerJam, int totalJam){
    super(nama, noKTP);
    this.upahPerJam = upahPerJam;
    this.totalJam = totalJam;
}
    public double getUpahPerJam() {
        return upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setUpahPerJam (double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam (int totalJam) {this.totalJam = totalJam;}

    @Override
    public String toString() {
        String duit= "",upah= "", jam= "",print = "",garis="-------------------------------------------------\n";
        System.out.println("=================================================");
        System.out.println("|                PEGAWAI HARIAN                 |");
        System.out.println("=================================================");

        System.out.printf("| Nama              : %-25s |\n",this.getNama());
        upah = String.format("| Upah/Jam          : Rp %-22s |\n",getUpahPerJam());
        jam  = String.format("| Total Jam Kerja   : %-2s.0 jam\t\t\t\t\t|\n", getTotalJam());

        if ((int) getTotalJam() <= 40) {
            duit += String.format("| Pendapatan        : Rp %-22s |\n", (int) ((40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5)));
        }

        if ((int) getTotalJam() > 40){
            duit += String.format("| Pendapatan        : Rp %-22s |\n", (int) (getUpahPerJam() * getTotalJam()));
        }

        return super.toString() + upah + jam + duit + garis;
    }

}
