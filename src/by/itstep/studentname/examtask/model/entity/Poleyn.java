package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Poleyn extends Armor {

    public Poleyn() {
    }

    public Poleyn(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Poleyn" + super.toString();
    }
}
