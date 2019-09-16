package Infrastructure;

public class Option {

    //Attributes
    private char clover;
    private char diamond;
    private char heart;
    private char spade;

    public Option(char clover, char diamond, char heart, char spade) {
        this.clover = clover;
        this.diamond = diamond;
        this.heart = heart;
        this.spade = spade;

    }
    //ToString methods
    public String toStringCSV() {
        return  clover + "," + diamond + "," + heart + "," + spade + "\n";
    }

    @Override
    public String toString() {
        return "Chance [Clover= " + clover + ", Diamond= " + diamond + ", Heart= " + heart + ", Spade= " + spade + "]";
    }

    //Getters & Setters
    public char getClover() {
        return clover;
    }

    public void setClover(char clover) {
        this.clover = clover;
    }

    public char getDiamond() {
        return diamond;
    }

    public void setDiamond(char diamond) {
        this.diamond = diamond;
    }

    public char getHeart() {
        return heart;
    }

    public void setHeart(char heart) {
        this.heart = heart;
    }

    public char getSpade() {
        return spade;
    }

    public void setSpade(char spade) {
        this.spade = spade;
    }
}
