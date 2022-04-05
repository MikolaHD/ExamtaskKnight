package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

public class Cuirass extends Armor {

    public Cuirass() {
    }

    public Cuirass(double price, double weight, double armor) {
        super(price,weight,armor);
    }

    @Override
    public String toString() {
        return "Cuirass" + super.toString();
    }
}
