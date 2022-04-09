package by.itstep.studentname.examtask.model.entity.abstracts;

public class Armor {
    private double price;
    public double weight;
    public double armor;

    public Armor() {
    }

    public Armor(double price, double weight, double armor) {
        this.price = price;
        this.weight = weight;
        this.armor = armor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        if (armor > 0) {
            this.armor = armor;
        }
    }

    public static double getRandom(double min, double max) {
        double x = (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    @Override
    public String toString() {
        return "{" +
                "price = " + price +
                ", weight = " + weight +
                ", armor = " + armor +
                '}';
    }
}
