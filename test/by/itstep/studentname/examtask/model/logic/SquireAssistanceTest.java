package by.itstep.studentname.examtask.model.logic;

import by.itstep.studentname.examtask.model.entity.Bevor;
import by.itstep.studentname.examtask.model.entity.Helmet;
import by.itstep.studentname.examtask.model.entity.Knight;
import static org.junit.Assert.*;
import org.junit.Test;

public class SquireAssistanceTest {

    @Test

    public   void testCalcTotalPricePositive(){
        double expected = 10;

        Knight knight = new Knight();

        knight.add(new Bevor(5.3, 0, 21));
        knight.add(new Helmet(-1, 2, 3.222222));

        double actual = SquireAssistance.calcTotalPrice(knight);
        assertEquals(expected,actual, 0);

    }
}
