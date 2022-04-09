package by.itstep.studentname.examtask.controller;

import by.itstep.studentname.examtask.model.entity.Knight;
import by.itstep.studentname.examtask.model.exception.ArmorIndexOutOfBoundException;
import by.itstep.studentname.examtask.model.logic.KnightTreasurer;
import by.itstep.studentname.examtask.model.logic.SquireAssistance;
import by.itstep.studentname.examtask.model.util.ArmorCreatorForKnight;
import by.itstep.studentname.examtask.view.Printer;

import java.util.Scanner;


public class Main {

    public static void main(String[] args)  {
        Printer.print("Hello. Input number of knight's which you want to dress: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Knight knight;
        knight = ArmorCreatorForKnight.create(number);

        Printer.print(knight);
        Printer.print("Total sum for knight's armor is : " + SquireAssistance.calcTotalPrice(knight) + " gold");
        Printer.print("Sorting Knight's armor by price is : " + KnightTreasurer.sortByPriceAsc(knight));
        Printer.print("Sorting Knight's armor by protection is : " + KnightTreasurer.sortByArmorAsc(knight));
        Printer.print("Sorting Knight's armor by weight is : " + KnightTreasurer.sortByWeightAsc(knight));
        Printer.print("Sorting Knight's armor nameASC is : " + KnightTreasurer.sortByNameAsc(knight));
        Printer.print("Sorting Knight's armor nameDESC is : " + KnightTreasurer.sortByNameDesc(knight));


    }
}
