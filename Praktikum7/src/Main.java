import java.util.ArrayList;

/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 7 - Main
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Pegawai> pegawai = new ArrayList<>();
        System.out.println(" ");

        //Pegawai Tetap
        pegawai.add(new PegawaiTetap("Kaido", "3374856573921111", 2700000));
        pegawai.add(new PegawaiTetap("Mihawk", "30017493556478399", 3500000));
        pegawai.add(new PegawaiTetap("Trafalgar D Water Law", "3229456385771723", 4300000));

        //Pegawai Harian
        pegawai.add(new PegawaiHarian("Hyogoro", "3176354638461723", 8650, 45));
        pegawai.add(new PegawaiHarian("Edward Newgate", "3145597483673528", 8750, 40));
        pegawai.add(new PegawaiHarian("Vinsmoke Sanji", "390385537567811", 8550, 55));

        //Sales
        pegawai.add(new Sales("Momonosuke", "3306638573927121", 45, 77000));
        pegawai.add(new Sales("Bartolomeow Kuma", "311385751837811", 55, 66000));
        pegawai.add(new Sales("Kinjishi no Shiki", "3193835576449988", 50, 55000));

        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
