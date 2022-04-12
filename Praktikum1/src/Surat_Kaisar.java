/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 1 - Surat Kaisar
 */

import java.util.Scanner;

public class Surat_Kaisar {
    static int Geser_brp, A;
    static String Kalimat, Kalimat2 = "";
    static char huruf2;

    public static void main(String[] args) {
        Scanner Aflah = new Scanner(System.in);

        Kalimat = Aflah.nextLine();
        Geser_brp = Aflah.nextInt();

        Translator(Kalimat, Geser_brp);
    }

    public static void Translator(String huruf,int angka){
        for(A=0; A < huruf.length(); A++){
                //Menggeser satu karakter pada setiap perulangan
            huruf2 = huruf.charAt(A);

                //jika huruf berada anatara a dan z


            if ((huruf2 >= 'A' )&& (huruf2 <= 'Z')){
                //Menggeser huruf
                huruf2 = (char) (huruf2 + angka);

                //Jika pergeseran huruf lebih dari 'Z'
                if (huruf2>'Z'){
                    huruf2 = (char)(huruf2 + 'A' - 'Z' - 1);
                    //System.out.println("Y");

                }
                Kalimat2 += huruf2;

            }
            else if (huruf2 >= 'a' && huruf2 <= 'z'){

                //Menggeser huruf
                huruf2 = (char) (huruf2 + angka);

                //Jika pergeseran huruf lebih dari 'z'
                if (huruf2 > 'z'){
                    huruf2 = (char)(huruf2 + 'a' - 'z' - 1);
                    //System.out.println("P");
                }
                Kalimat2 += huruf2;
            }
            else {
                Kalimat2 += huruf2;
            }
    }
        System.out.println(Kalimat2);


    }
}
