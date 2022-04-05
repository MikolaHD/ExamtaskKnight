package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Sabatons extends Armor {

    public Sabatons() {
    }

    public Sabatons(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Sabatons" + super.toString();
    }
}
