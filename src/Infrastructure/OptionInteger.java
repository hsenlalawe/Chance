package Infrastructure;

public class OptionInteger {
    //Attributes
    private int clover;
    private int diamond;
    private int heart;
    private int spade;

    public OptionInteger(int clover, int diamond, int heart, int spade) {
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
    public int getClover() {
        return clover;
    }

    public void setClover(int clover) {
        this.clover = clover;
    }

    public int getDiamond() {
        return diamond;
    }

    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

    public int getHeart() {
        return heart;
    }

    public void setHeart(int heart) {
        this.heart = heart;
    }

    public int getSpade() {
        return spade;
    }

    public void setSpade(int spade) {
        this.spade = spade;
    }

    //Methods
    public Option convertToOption(){
        return new Option(convertToChar(this.clover),convertToChar(this.diamond),convertToChar(this.heart),convertToChar(this.spade));
    }
    public char convertToChar(int num){
           switch (num) {
               case 0: return '7' ;
               case 1: return '8' ;
               case 2: return '9' ;
               case 3: return 'T' ;
               case 4: return 'J' ;
               case 5: return 'Q' ;
               case 6: return 'K' ;
               case 7: return 'A' ;

           }
           return 'X';
    }
}
