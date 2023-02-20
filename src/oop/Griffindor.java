package oop;

public class Griffindor extends Hogwarts{
    public Griffindor(int powerMagic, int powerTransgression) {
        super(powerMagic, powerTransgression);
    }
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(int powerMagic, int powerTransgression, int nobility, int honor, int courage) {
        super(powerMagic, powerTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    private int calculatePower() {
        return this.nobility + this.honor + this.courage;

    }

    public void compare(Griffindor griffindor) {
        if (this.calculatePower() > griffindor.calculatePower()) {
            System.out.println("Этот ученик сильнее");
        } else System.out.println("Этот ученик слабее");
    }



    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}' +super.toString();
    }
}
