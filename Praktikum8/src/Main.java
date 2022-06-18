/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 8 - Main
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main {
    static int nomor = 0, hitung = 1;

    public static void main(String[] args) {
        Scanner Hanif = new Scanner(System.in);

        System.out.println("\n======= SELAMAT DATANG DI GAME HEROES AGAINST TITAN =======\n");
        System.out.print("Masukkan nama player anda: ");
        String nama = Hanif.nextLine();

        System.out.println("-----------------------------------------------------------");
        System.out.println("Selamat datang " + nama);
        System.out.println("Silahkan pilih salah satu diantara ketiga role dibawah ini!");
        System.out.println("1. Magician \n\tHP: 100 DEF: 10 ATK: 60");
        System.out.println("2. Healer   \n\tHP: 70  DEF: 10 ATK: 10 \n\tUnique skill: HP +25 setiap 2 turn ");
        System.out.println("3. Warrior  \n\tHP: 80  DEF: 30 ATK: 25");
        System.out.println("-----------------------------------------------------------");

        System.out.print("Masukkan nomor role yang anda inginkan: ");

        try {
            nomor = Hanif.nextInt();
        }

        catch(InputMismatchException e){
            System.out.println("Masukkan tidak sesuai!");
            System.out.println("Masukkan harus berupa angka!");
            System.out.println("Tolong masukkan nomor yang sesuai\n");
            System.out.print("Masukkan nomor role yang anda inginkan: ");

            Hanif.nextLine();
            nomor = Hanif.nextInt();
        }
        Hanif.nextLine();

        if (nomor != 1 && nomor != 2 && nomor != 3){
            System.out.println("Nomor role yang anda masukkan tidak sesuai!");
            System.out.println("Tolong masukkan nomor yang sesuai\n");
            System.out.print("Masukkan nomor role yang anda inginkan: ");

            try {
                nomor = Hanif.nextInt();
            }

            catch(InputMismatchException e){
                System.out.println("Masukkan tidak sesuai!");
                System.out.println("Masukkan harus berupa angka!");
                System.out.println("Tolong masukkan nomor yang sesuai\n");
                System.out.print("Masukkan nomor role anda: ");

                Hanif.nextLine();
                nomor = Hanif.nextInt();
            }
            Hanif.nextLine();

        }

        ArrayList <Character> player = new ArrayList<>();

        if (nomor == 1){
            player.add(new Magician());
        }

        if (nomor == 2){
            player.add(new Healer());
        }

        if (nomor == 3){
            player.add(new Warrior());
        }

        player.add(new Titan());

        System.out.println("\n==================== PERMAINAN DIMULAI ====================");
        System.out.println("Selamat datang " + nama);
        Class peran = player.get(0).getClass();
        System.out.println("Anda akan bermain sebagai " + peran.getSimpleName());

        System.out.println("\n========== STATUS ==========");
        System.out.println("---------- PLAYER ----------");
        info(player.get(0));

        System.out.println("\n---------- MUSUH -----------");
        info(player.get(1));
        System.out.println("");

        do {
            System.out.println("========== Turn " + hitung + " ===========");
            if (player.get(0).attack()) {
                player.get(1).receiveDamage(player.get(0).getAttack());
            }

            hitung +=1;
            System.out.printf("%-13s: %d%n", nama + " HP", player.get(0).getHP());
            System.out.println("Enemy HP     : " + player.get(1).getHP());

            if (player.get(1).getHP() == 0){
                break;
            }

            System.out.println("========== Turn " + hitung + " ===========");
            if (player.get(0) instanceof Healer) {
                System.out.println("Healing skill active! (HP +25)");
                ((Healer) player.get(0)).heal();
            }

            if (player.get(1).attack()) {
                player.get(0).receiveDamage(player.get(1).getAttack());
            }

            System.out.printf("%-13s: %d%n", nama + " HP", player.get(0).getHP());
            System.out.println("Enemy HP     : " + player.get(1).getHP());
            hitung +=1;
        }

        while (player.get(0).getHP() != 0 && player.get(1).getHP() != 0);
        System.out.println("\n===================== PERMAINAN SELESAI =====================");
        System.out.println("Hasil pertandingan adalah sebagai berikut");

        if (player.get(0).getHP() > 0) {
            System.out.println("Selamat " + nama + " telah memenangkan pertandingan");
        }

        if (player.get(0).getHP() == 0) {
            System.out.println("Sayang sekali " + nama + " harus kalah pada pertandingan kali ini");
        }

        System.out.println("\n========== STATUS ==========");
        System.out.println("---------- PLAYER ----------");
        info(player.get(0));

        System.out.println("\n---------- MUSUH -----------");
        info(player.get(1));

        System.out.println("\n==================TERIMAKASIH TELAH BERMAIN==================");

        System.out.println("Silahkan jalankan ulang program jika ingin bermain kembali ;)");
    }

    static void info(Character pemain){
        Class peran = pemain.getClass();
        System.out.println("Role      : " + peran.getSimpleName());
        pemain.info();
    }

}
