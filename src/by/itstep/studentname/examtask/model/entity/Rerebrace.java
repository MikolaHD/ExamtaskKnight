package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Rerebrace extends Armor {

    public Rerebrace() {
    }

    public Rerebrace(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Rerebrace" + super.toString();
    }
}
