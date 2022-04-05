package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Greaves extends Armor {

    public Greaves() {
    }

    public Greaves(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Greaves" + super.toString();
    }
}
