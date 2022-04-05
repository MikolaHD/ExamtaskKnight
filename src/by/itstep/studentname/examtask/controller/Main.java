package by.itstep.studentname.examtask.controller;

import by.itstep.studentname.examtask.model.entity.*;
import by.itstep.studentname.examtask.model.exception.ArmorIndexOutOfBoundException;
import by.itstep.studentname.examtask.model.logic.SquireAssistance;
import by.itstep.studentname.examtask.view.Printer;

public class Main {
    public static void main(String[] args) throws ArmorIndexOutOfBoundException {

        Bevor bevor = new Bevor(5.0, 10, 3.5);
        Couter couter = new Couter(7, 16,5.4);
        Cuirass cuirass = new Cuirass(6.2, 7, 6.1);
        Cuisses cuisses = new Cuisses(8, 2.3, 3.4);
        Faulds faulds = new Faulds(4.2, 1.5, 4);
        Gauntlets gauntlets = new Gauntlets(8.1, 2.6,12);
        Greaves greaves = new Greaves(10, 3, 7.2);
        Helmet helmet = new Helmet(4.8, 2, 5.1);
        Pauldron pauldron = new Pauldron(5,3,8);
        Plackart plackart = new Plackart(11, 12, 11);
        Poleyn poleyn = new Poleyn(3, 2.3, 3);
        Rerebrace rerebrace = new Rerebrace(6, 1.3, 5);
        Sabatons sabatons = new Sabatons(15, 3.2, 10);
        Vambrace vambrace = new Vambrace(13, 2, 8);




        Knight knight = new Knight();

        knight.add(bevor);
        knight.add(couter);
        knight.add(cuirass);
        knight.add(cuisses);
        knight.add(faulds);
        knight.add(gauntlets);
        knight.add(greaves);
        knight.add(helmet);
        knight.add(pauldron);
        knight.add(plackart);
        knight.add(poleyn);
        knight.add(rerebrace);
        knight.add(sabatons);
        knight.add(vambrace);



        Printer.print(knight);
        double totalWeight = SquireAssistance.calcTotalWeight(knight);
        double totalArmor = SquireAssistance.calcTotalArmor(knight);
        double totalPrice = SquireAssistance.calcTotalPrice(knight);
        Printer.print(" Total knight armor = " + totalArmor);
        Printer.print("Total knight weight = " + totalWeight);
        Printer.print("Total knight price = " + totalPrice);






    }
}
