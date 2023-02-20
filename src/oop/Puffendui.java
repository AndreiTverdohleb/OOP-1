package oop;

public class Puffendui extends Hogwarts {

    public Puffendui(int powerMagic, int powerTransgression) {
        super(powerMagic, powerTransgression);
    }

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendui(int powerMagic, int powerTransgression, int industriousness, int loyalty, int honesty) {
        super(powerMagic, powerTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    private int calculatePower() {
        return this.industriousness + this.honesty + this.loyalty;

    }

    public void compare(Puffendui puffendui) {
        if (this.calculatePower() > puffendui.calculatePower()) {
            System.out.println("Этот ученик сильнее");
        } else System.out.println("Этот ученик слабее");
    }

    @Override
    public String toString() {
        return "Puffendui{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}