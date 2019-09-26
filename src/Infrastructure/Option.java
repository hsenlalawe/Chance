package Infrastructure;

public class Option {

    //Attributes
    protected char clover;
    protected char diamond;
    protected char heart;
    protected char spade;

    public Option(char clover, char diamond, char heart, char spade) {
        this.clover = castIfNeed(clover);
        this.diamond = castIfNeed(diamond);
        this.heart = castIfNeed(heart);
        this.spade = castIfNeed(spade);

    }
    public char castIfNeed(char ch){

        return ch=='1'?'T':ch;
    }

    public int repeat(Option other){
        int cnt=0;
        if(this.clover==other.clover)cnt++;
        if(this.diamond==other.diamond)cnt++;
        if(this.heart==other.heart)cnt++;
        if(this.spade==other.spade)cnt++;

        return cnt;
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
