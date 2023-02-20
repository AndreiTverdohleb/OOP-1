package oop;

public abstract class Hogwarts {

    private int powerMagic;
    private int powerTransgression;

    public Hogwarts(int powerMagic, int powerTransgression) {
        this.powerMagic = powerMagic;
        this.powerTransgression = powerTransgression;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getPowerTransgression() {
        return powerTransgression;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setPowerTransgression(int powerTransgression) {
        this.powerTransgression = powerTransgression;
    }

    public void compare1(Hogwarts hogwarts) {
        if (this.powerMagic + this.powerTransgression > hogwarts.powerMagic + hogwarts.powerTransgression) {
            System.out.println("Этот ученик сильнее");
        } else System.out.println("Этот ученик слабее");
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "powerMagic=" + powerMagic +
                ", powerTransgression=" + powerTransgression +
                '}';
    }
}
