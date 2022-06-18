/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 5 - Praktikum - Pengenalan Arraylist
CarData
 */

import java.util.ArrayList;

public class CarData {

    ArrayList<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){

        Car newCar = new Car(carType, polNum, merk, true);
        carList.add(newCar);
    }

    public void listOfCar(){
        String Kosong = " ";
        System.out.println("\n|" + "=".repeat(31) + "|");
        System.out.printf("|\t\t  DAFTAR MOBIL  \t\t|\n");
        System.out.print("|" + "=".repeat(31) + "|");

        for(Car car : carList){
            System.out.printf("\n| TIPE MOBIL : %16s |", car.getCarType());
            System.out.printf("\n| NO. POLISI : %16s |", car.getPolNum());
            System.out.printf("\n| MERK MOBIL : %16s |", car.getMerk());
            System.out.printf("\n|" + "-".repeat(31) + "|");
        }

        System.out.println("");


    }

}
