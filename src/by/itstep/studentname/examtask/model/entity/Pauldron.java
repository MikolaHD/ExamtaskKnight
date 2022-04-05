package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Pauldron extends Armor {

    public Pauldron() {
    }

    public Pauldron(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Pauldron" + super.toString();
    }
}
