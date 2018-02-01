package ternary;

public class Discipline {

    private int discId;
    private String name;
    private int credits;
    
    public Discipline() {}

    public Discipline(int discId, String name, int credits) {
    	this.discId = discId;
    	this.name = name;
        this.credits = credits;
    }

    public int getDiscId() {
        return discId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}