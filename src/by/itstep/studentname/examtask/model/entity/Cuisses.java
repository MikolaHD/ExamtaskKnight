package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Cuisses extends Armor {

    public Cuisses() {
    }

    public Cuisses(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Cuisses" + super.toString();
    }
}
