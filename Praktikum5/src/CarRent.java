/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Tugas 5 - Praktikum - Pengenalan Arraylist
CarRent
 */

public class CarRent {

    private CarRider rider ;
    private Car car ;
    private int rentDur ;

    CarRent(CarRider rider, Car car, int rentDur){
        this.rider = rider ;
        this.car = car ;
        this.rentDur = rentDur ;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }

}
