package oop;

public class Slizerin extends Hogwarts {

    public Slizerin(int powerMagic, int powerTransgression) {
        super(powerMagic, powerTransgression);
    }

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(int powerMagic, int powerTransgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(powerMagic, powerTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    private int calculatePower() {
        return this.cunning + this.ambition + this.determination + this.lustForPower + this.resourcefulness;

    }

    public void compare(Slizerin slizerin) {
        if (this.calculatePower() > slizerin.calculatePower()) {
            System.out.println("Этот ученик сильнее");
        } else System.out.println("Этот ученик слабее");
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}