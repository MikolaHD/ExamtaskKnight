package by.itstep.studentname.examtask.model.logic;

import by.itstep.studentname.examtask.model.entity.Knight;
import by.itstep.studentname.examtask.model.entity.abstracts.Armor;
import by.itstep.studentname.examtask.model.exception.ArmorIndexOutOfBoundException;

public class KnightTreasurer {

    public static Knight sortByPriceAsc(Knight knight) {
        try {
            for (int i = 0; i < knight.getSizeOfArmors() - 1; i++) {
                for (int j = 0; j < knight.getSizeOfArmors() - 1 - i; j++) {
                    if (knight.getArmor(j).getPrice() > knight.getArmor(j + 1).getPrice()) {
                        Armor temp = knight.getArmor(j);
                        knight.setArmors(j, knight.getArmor(j + 1));
                        knight.setArmors(j + 1, temp);
                    }
                }
            }

        } catch (ArmorIndexOutOfBoundException e) {
            e.printStackTrace();
        }

        return knight;
    }

    public static Knight sortByArmorAsc(Knight knight) {
        try {
            for (int i = 0; i < knight.getSizeOfArmors() - 1; i++) {
                for (int j = 0; j < knight.getSizeOfArmors() - 1 - i; j++) {
                    if (knight.getArmor(j).getArmor() > knight.getArmor(j + 1).getArmor()) {
                        Armor temp = knight.getArmor(j);
                        knight.setArmors(j, knight.getArmor(j + 1));
                        knight.setArmors(j + 1, temp);
                    }
                }
            }

        } catch (ArmorIndexOutOfBoundException e) {
            e.printStackTrace();
        }
        return knight;
    }

    public static Knight sortByWeightAsc(Knight knight) {
        try {
            for (int i = 0; i < knight.getSizeOfArmors() - 1; i++) {
                for (int j = 0; j < knight.getSizeOfArmors() - 1 - i; j++) {
                    if (knight.getArmor(j).getWeight() > knight.getArmor(j + 1).getWeight()) {
                        Armor temp = knight.getArmor(j);
                        knight.setArmors(j, knight.getArmor(j + 1));
                        knight.setArmors(j + 1, temp);
                    }
                }
            }

        } catch (ArmorIndexOutOfBoundException e) {
            e.printStackTrace();
        }
        return knight;
    }

    public static Knight sortByNameAsc(Knight knight) {

        try {
            for (int i = 0; i < knight.getSizeOfArmors() - 1; i++) {
                for (int j = 0; j < knight.getSizeOfArmors() - 1 - i; j++) {
                    if (knight.getArmor(j).toString().compareTo(knight.getArmor(j + 1).toString()) > 0) {
                        Armor temp = knight.getArmor(j);
                        knight.setArmors(j, knight.getArmor(j + 1));
                        knight.setArmors(j + 1, temp);
                    }
                }
            }

        } catch (ArmorIndexOutOfBoundException e) {
            e.printStackTrace();
        }

        return knight;
    }

    public static Knight sortByNameDesc(Knight knight) {
        String s;
        try {
            for (int i = 0; i < knight.getSizeOfArmors() - 1; i++) {
                for (int j = 0; j < knight.getSizeOfArmors() - 1 - i; j++) {
                    if (knight.getArmor(j).toString().compareTo(knight.getArmor(j + 1).toString()) < 0) {
                        Armor temp = knight.getArmor(j);
                        knight.setArmors(j, knight.getArmor(j + 1));
                        knight.setArmors(j + 1, temp);
                    }
                }
            }

        } catch (ArmorIndexOutOfBoundException e) {
            e.printStackTrace();
        }
        return knight;
    }


}
