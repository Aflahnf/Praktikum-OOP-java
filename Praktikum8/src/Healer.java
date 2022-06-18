/*
Nama  : Aflah Hanif Nadanta
Nim   : 215150707111020
Kelas : Teknologi Informasi - E

Praktikum - Tugas 8 - Healer
 */

public class Healer extends Character {
    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        double kesempatan;

        //Pada Healer, kesempatan mengenai lawan adalah 85%
        kesempatan = Math.random() * 10;
        if (kesempatan <= 8.5 && kesempatan > 0){
            return true;
        }

        else{
            return false;
        }
    }

}
