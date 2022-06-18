/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 5 - Praktikum - Pengenalan Arraylist
RentArchive
 */

import java.util.ArrayList;

public class RentArchive{

    ArrayList <CarRent> rentData = new ArrayList<>();

    public void Rent(CarRider rider, Car car, int rentDur){

        if(car.isStatus()){
            CarRent newCarRent = new CarRent(rider,car,rentDur);
            rentData.add(newCarRent);
            System.out.println("Mobil berhasil disewa");
            car.setStatus("false");
        }
        else {
            System.out.println("Maaf, mobil sudah disewa");
        }
    }

    public void info(){
        String Kosong = " ";
        System.out.println("|" + "=".repeat(36)+ "|");
        System.out.println("|\t\t  INFORMASI PELANGGAN \t\t |");
        System.out.println("|" + "=".repeat(36)+ "|");

        for(CarRent rent : rentData){
            System.out.printf("|%6s%30s|", rent.getCar().isStatus(), Kosong ) ;

            System.out.printf("\n| NAMA PEMINJAM   : %16s |", rent.getRider().getName());
            System.out.printf("\n| NO HP           : %16s |", rent.getRider().getPhone());
            System.out.printf("\n| TIPE MOBIL      : %16s |", rent.getCar().getCarType());
            System.out.printf("\n| NO POLISI       : %16s |", rent.getCar().getPolNum());
            System.out.printf("\n| LAMA RENTAL     : %11s hari |", rent.getRentDur());
            System.out.println("\n|" + "-".repeat(36) + "|");

        }


    }
}




