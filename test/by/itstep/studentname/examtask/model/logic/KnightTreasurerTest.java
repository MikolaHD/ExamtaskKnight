package by.itstep.studentname.examtask.model.logic;

import by.itstep.studentname.examtask.model.entity.*;
import org.junit.Assert;
import org.junit.Test;

public class KnightTreasurerTest {

    @Test

    public void testSortByPriceAsc() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 1, 3));
        knight.add(new Bevor(3.3, 2, 6));
        knight.add(new Helmet(1.5, 3, 4));
        knight.add(new Rerebrace(2.5, 7, 9));

        Knight expected = KnightTreasurer.sortByPriceAsc(knight);
        Assert.assertEquals(expected, knight);

    }

    @Test

    public void testSortByArmorAsc() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 1, 3));
        knight.add(new Bevor(3.3, 2, 6));
        knight.add(new Helmet(1.5, 3, 4));
        knight.add(new Rerebrace(2.5, 7, 9));

        Knight expected = KnightTreasurer.sortByArmorAsc(knight);
        Assert.assertEquals(expected, knight);

    }

    @Test

    public void testSortByWeightAsc() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 1, 3));
        knight.add(new Bevor(3.3, 2, 6));
        knight.add(new Helmet(1.5, 3, 4));
        knight.add(new Rerebrace(2.5, 7, 9));

        Knight expected = KnightTreasurer.sortByWeightAsc(knight);
        Assert.assertEquals(expected, knight);

    }

    @Test

    public void testSortByNameAsc() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 1, 3));
        knight.add(new Bevor(3.3, 2, 6));
        knight.add(new Helmet(1.5, 3, 4));
        knight.add(new Rerebrace(2.5, 7, 9));

        Knight expected = KnightTreasurer.sortByNameAsc(knight);
        Assert.assertEquals(expected, knight);

    }

    @Test

    public void testSortByNameDesc() {
        Knight knight = new Knight();
        knight.add(new Poleyn(5.2, 1, 3));
        knight.add(new Bevor(3.3, 2, 6));
        knight.add(new Helmet(1.5, 3, 4));
        knight.add(new Rerebrace(2.5, 7, 9));

        Knight expected = KnightTreasurer.sortByNameAsc(knight);
        Assert.assertEquals(expected, knight);

    }


}
