package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Bevor extends Armor {

    public Bevor() {
    }

    public Bevor(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return  "\nBevor " + super.toString();
    }
}
