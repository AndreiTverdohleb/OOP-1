package oop;

public class Kogtevran extends Hogwarts{
    public Kogtevran(int powerMagic, int powerTransgression) {
        super(powerMagic, powerTransgression);
    }
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(int powerMagic, int powerTransgression, int mind, int wisdom, int wit, int creativity) {
        super(powerMagic, powerTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int calculatePower() {
        return this.creativity + this.mind + this.wit + this.wisdom;

    }

    public void compare(Kogtevran kogtevran) {
        if (this.calculatePower() > kogtevran.calculatePower()) {
            System.out.println("Этот ученик сильнее");
        } else System.out.println("Этот ученик слабее");
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }
}
