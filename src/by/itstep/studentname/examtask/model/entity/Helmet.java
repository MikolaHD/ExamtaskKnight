package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Helmet extends Armor {

    public Helmet() {
    }

    public Helmet(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Helmet" + super.toString();
    }
}
