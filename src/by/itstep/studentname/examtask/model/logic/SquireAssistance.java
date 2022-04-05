package by.itstep.studentname.examtask.model.logic;

import by.itstep.studentname.examtask.model.entity.Knight;
import by.itstep.studentname.examtask.model.entity.abstracts.Armor;
import by.itstep.studentname.examtask.model.exception.ArmorIndexOutOfBoundException;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class SquireAssistance {

    public static double calcTotalPrice(Knight knight) {
        double total = 0;

        try {

            for (int i = 0; i < knight.getSizeOfArmors(); i++) {

                Armor armor = knight.getArmor(i);
                total += armor.getPrice();
            }

        } catch (ArmorIndexOutOfBoundException exc) {
            System.err.println(exc);
        }

        return total;
    }

    public static double calcTotalWeight(Knight knight) {
        double total = 0;

        try {

            for (int i = 0; i < knight.getSizeOfArmors(); i++) {

                Armor armor = knight.getArmor(i);
                total += armor.getWeight();
            }

        } catch (ArmorIndexOutOfBoundException exc) {
            System.err.println(exc);
        }

        return total;
    }

    public static double calcTotalArmor(Knight knight) {
        double total = 0;

        try {

            for (int i = 0; i < knight.getSizeOfArmors(); i++) {

                Armor armor = knight.getArmor(i);
                total += armor.getArmor();
            }

        } catch (ArmorIndexOutOfBoundException exc) {
            System.err.println(exc);
        }

        return total;
    }

}
