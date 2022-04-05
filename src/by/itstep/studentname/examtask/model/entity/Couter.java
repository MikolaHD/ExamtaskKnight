package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Couter extends Armor {

    public Couter() {
    }

    public Couter(double price, double weight, double armor) {
        super(price, weight, armor);
    }

    @Override
    public String toString() {
        return '\n' + "Couter" + super.toString();
    }
}
