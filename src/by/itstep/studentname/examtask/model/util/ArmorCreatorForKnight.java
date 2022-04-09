package by.itstep.studentname.examtask.model.util;

import by.itstep.studentname.examtask.model.entity.*;
import by.itstep.studentname.examtask.model.entity.abstracts.Armor;

import java.util.ArrayList;


public class ArmorCreatorForKnight {
    private static final double MAX = 20;
    private static final double MIN = 1;

    public static Knight create(int count) {

        Knight knight = new Knight();

        ArrayList<Armor> armorArrayList = new ArrayList<>();
        armorArrayList.add(new Bevor(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Couter(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Cuirass(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Cuisses(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Faulds(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Gauntlets(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Greaves(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Helmet(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Pauldron(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Plackart(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Poleyn(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Rerebrace(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Sabatons(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));
        armorArrayList.add(new Vambrace(Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX), Armor.getRandom(MIN, MAX)));

        for (int i = 0; i < count; i++) {

            for (int j = 0; j < armorArrayList.size(); j++) {
                Armor armor = armorArrayList.get(j);
                knight.add(armor);
            }
        }
        return knight;
    }
}
