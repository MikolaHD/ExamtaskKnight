package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Vambrace extends Armor {
    public Vambrace() {
    }

    public Vambrace(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Vambrace" + super.toString();
    }
}
