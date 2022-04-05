package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Faulds extends Armor {

    public Faulds() {
    }

    public Faulds(double price, double weight, double armor) {
       super(price,weight,armor);
    }


    @Override
    public String toString() {
        return "Faulds" + super.toString();
    }
}
