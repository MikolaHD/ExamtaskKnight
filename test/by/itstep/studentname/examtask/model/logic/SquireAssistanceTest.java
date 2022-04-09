package by.itstep.studentname.examtask.model.logic;

import by.itstep.studentname.examtask.model.entity.Bevor;
import by.itstep.studentname.examtask.model.entity.Helmet;
import by.itstep.studentname.examtask.model.entity.Knight;

import static org.junit.Assert.*;

import by.itstep.studentname.examtask.model.entity.Poleyn;

import org.junit.Test;

public class SquireAssistanceTest {


    @Test

    public void testCalcTotalPricePositive() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 5, 5));
        knight.add(new Bevor(3.3, 5, 5));
        knight.add(new Helmet(1.5, 5, 5));
        double expected = 10;
        double actual = SquireAssistance.calcTotalPrice(knight);
        assertEquals(expected, actual, 0);

    }

    @Test

    public void testCalcTotalWeightPositive() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 5, 5));
        knight.add(new Bevor(3.3, 5, 5));
        knight.add(new Helmet(1.5, 5, 5));
        double expected = 15;
        double actual = SquireAssistance.calcTotalWeight(knight);

        assertEquals(expected, actual, 0);
    }

    @Test

    public void testCalcTotalArmorPositive() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 5, 4));
        knight.add(new Bevor(3.3, 5, 5));
        knight.add(new Helmet(1.5, 5, 5));
        double expected = 14;
        double actual = SquireAssistance.calcTotalArmor(knight);

        assertEquals(expected, actual, 0);

    }


}
