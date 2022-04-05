package by.itstep.studentname.examtask.model.entity;

import by.itstep.studentname.examtask.model.entity.abstracts.Armor;
import by.itstep.studentname.examtask.model.exception.ArmorIndexOutOfBoundException;

public class Knight {
    private Armor[] armors;

    public Knight() {
        armors = new Armor[0];

    }

    public Knight(Armor[] armors) {
        this.armors = armors;

    }

    public Armor getArmor(int index) throws ArmorIndexOutOfBoundException {
        if (index >= 0 && index < armors.length) {
            return armors[index];
        } else {
            throw new ArmorIndexOutOfBoundException();
        }
    }

    public int getSizeOfArmors() {
        return armors.length;
    }


    public void add(Armor armor) {
        Armor[] temp = new Armor[armors.length + 1];
        int i = 0;
        for (; i < armors.length; i++) {
            temp[i] = armors[i];
        }

        temp[i] = armor;
        armors = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\n List of armor for knight : ");
        for (Armor armor : armors) {
            builder.append(armor).append("\n");
        }
        return builder.toString();
    }

}
