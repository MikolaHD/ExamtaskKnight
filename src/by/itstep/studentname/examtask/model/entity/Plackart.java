package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Plackart extends Armor {

    public Plackart() {
    }

    public Plackart(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return "Plackart" + super.toString();
    }
}
