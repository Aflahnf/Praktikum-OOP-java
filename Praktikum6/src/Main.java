/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 6 - Main
 */

public class Main {
    static Manusia manusia[];
    static MahasiswaFILKOM mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println("=================================================");
        System.out.println("|                   MANUSIA                     |");
        System.out.println("=================================================");

        manusia[0] = new Manusia("Kaido", "215151207121043", true, false);
        manusia[1] = new Manusia("Linlin", "215612120712", false, true);
        manusia[2] = new Manusia("Shanks", "215113212924", true, true);

        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MahasiswaFILKOM
        mahasiswa = new MahasiswaFILKOM[3];
        System.out.println("=================================================");
        System.out.println("|                  MAHASISWA                    |");
        System.out.println("=================================================");
        mahasiswa[0] = new MahasiswaFILKOM("205150600111003", 3.6, "Boa Hancock", "199925029109", false, true);
        mahasiswa[1] = new MahasiswaFILKOM("195150200111002", 3.5, "Nami", "2003829374609", false, false);
        mahasiswa[2] = new MahasiswaFILKOM("215150707111037", 3.9, "Kaido", "2002682923106", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println("===================================================");
        System.out.println("|                      PEKERJA                    |");
        System.out.println("===================================================");
        pekerja[0] = new Pekerja(8, 30, "195102439283", "Garp", "2933242352524", true, true);
        pekerja[1] = new Pekerja(8, 20, "200325829957", "Robin", "243245245224", false, true);
        pekerja[2] = new Pekerja(9, 25, "2002257291648", "Sengoku", "203245244642", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manager[3];
        System.out.println("===================================================");
        System.out.println("|                    MANAGER                      |");
        System.out.println("===================================================");
        manager[0] = new Manager(1199, 7, 23, "200125229106", "Vivi", "2001647422", false, true);
        manager[1] = new Manager(1723, 9, 24, "200525729106", "Luffy", "19874563630", true, true);
        manager[2] = new Manager(1212, 9, 25, "200325129106", "Jinbei", "193475135111", true, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        // Jumlah warga
        System.out.println("=================================================");
        System.out.println("|                DAFTAR TOTAL WARGA             |");
        System.out.println("=================================================");
        System.out.printf("| Jumlah Manusia    :  %24d |\n", manusia.length);
        System.out.printf("| Jumlah Mahasiswa  :  %24d |\n",mahasiswa.length);
        System.out.printf("| Jumlah Pekerja    :  %24d |\n",pekerja.length);
        System.out.printf("| Jumlah Manager    :  %24d |\n",manager.length);
        System.out.println("-------------------------------------------------");

    }
}