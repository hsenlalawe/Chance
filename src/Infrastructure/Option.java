package Infrastructure;

import java.util.Date;

public class Option {

    //Attributes
    private char Clover;
    private char Diamond;
    private char Heart;
    private char Spade;
    private Date date;
    private int id;

    //Constructors
    public Option(char clover, char diamond, char heart, char spade, Date date, int id) {
        super();
        Clover = clover;
        Diamond = diamond;
        Heart = heart;
        Spade = spade;
        this.date = date;
        this.id = id;
    }

    public Option(char clover, char diamond, char heart, char spade, int id) {
        super();
        Clover = clover;
        Diamond = diamond;
        Heart = heart;
        Spade = spade;
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



//asmhdgjhasg