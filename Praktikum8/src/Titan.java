/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 8 - Titan
 */

public class Titan extends Character {
    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

    @Override
    public boolean attack() {
        double kesempatan;

        //Pada Titan, kesempatan mengenai lawan adalah 40%
        kesempatan = Math.random() * 10;
        if (kesempatan <= 4.0 && kesempatan > 0){
            return true;
        }

        else{
            return false;
        }
    }

}
