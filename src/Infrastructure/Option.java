package Infrastructure;

public class Option {

    //Attributes
    private char Clover;
    private char Diamond;
    private char Heart;
    private char Spade;

    public Option(char clover, char diamond, char heart, char spade) {
        Clover = clover;
        Diamond = diamond;
        Heart = heart;
        Spade = spade;
    }
    //ToString methods
    public String toStringCSV() {
        return  Clover + "," + Diamond + "," + Heart + "," + Spade + "\n";
    }
    @Override
    public String toString() {
        return "Chance [Clover= " + Clover + ", Diamond= " + Diamond + ", Heart= " + Heart + ", Spade= " + Spade + "]";
    }

    //Getters & Setters
    public char getClover() {
        return Clover;
    }

    public void setClover(char clover) {
        Clover = clover;
    }

    public char getDiamond() {
        return Diamond;
    }

    public void setDiamond(char diamond) {
        Diamond = diamond;
    }

    public char getHeart() {
        return Heart;
    }

    public void setHeart(char heart) {
        Heart = heart;
    }

    public char getSpade() {
        return Spade;
    }

    public void setSpade(char spade) {
        Spade = spade;
    }
}
