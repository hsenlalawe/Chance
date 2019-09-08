package Infrastructure;

import java.util.Date;

public class OptionEx extends Option{

    //Attributes
    private Date date;
    private int id;

    //Constructors
    public OptionEx(char clover, char diamond, char heart, char spade, Date date, int id) {
        super(clover,diamond,heart,spade);
        this.date = date;
        this.id = id;
    }

    public OptionEx(char clover, char diamond, char heart, char spade, int id) {
        super(clover,diamond,heart,spade);
        this.id = id;
    }

//    @Override
//    public String toString() {
//        return "Chance [Clover= " + Clover + ", Diamond= " + Diamond + ", Heart= " + Heart + ", Spade= " + Spade + "]";
//    }

    //Getters & Setters
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