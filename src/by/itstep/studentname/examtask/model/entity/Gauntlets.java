package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Gauntlets extends Armor {

    public Gauntlets() {
    }

    public Gauntlets(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Gauntlets" + super.toString();
    }
}
