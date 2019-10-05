package Infrastructure;

public class Option {

    //Attributes
    protected char clover;
    protected char diamond;
    protected char heart;
    protected char spade;
    protected String opId;

    public Option(char clover, char diamond, char heart, char spade) {
        char cl = castIfNeed(clover),
                di = castIfNeed(diamond),
                he = castIfNeed(heart),
                sp = castIfNeed(spade);
        this.clover = cl;
        this.diamond = di;
        this.heart = he;
        this.spade = sp;
        this.opId = Character.toString(cl)+di+he+sp;
    }



    //for initial
    public char castIfNeed(char ch){

        return ch=='1'?'T':ch;
    }
//    public static optionInt(int clover, int diamond, int heart, int spade) {
//
//
//    }

    public int repeat(Option other){
        int cnt=0;
        if(this.clover==other.clover)cnt++;
        if(this.diamond==other.diamond)cnt++;
        if(this.heart==other.heart)cnt++;
        if(this.spade==other.spade)cnt++;

        return cnt;
    }
    public int getKeyMapOctal()
    {
       return convertCharToOctal(this.clover)*1000+
               convertCharToOctal(this.diamond)*100+
               convertCharToOctal(this.heart)*10+
               convertCharToOctal(this.spade)*1;
    }
    public static int convertCharToOctal(char c)
    {
        if(c=='7')return 0;
        if(c=='8')return 1;
        if(c=='9')return 2;
        if(c=='T')return 3;
        if(c=='J')return 4;
        if(c=='Q')return 5;
        if(c=='K')return 6;
        if(c=='A')return 7;

    return -1;
    }
    public String getString()
    {
//        int clover=Integer.parseInt(this.clover);
//        , diamond, heart, spade;
//
//        return convertOctalToString(clover)+
//                convertOctalToString(diamond)+
//                convertOctalToString(heart)+
//                convertOctalToString(spade);
        return "";
    }
    public static String convertOctalToString(int n)
    {
        if(n==0)return "7";
        if(n==1)return "8";
        if(n==2)return "9";
        if(n==3)return "T";
        if(n==4)return "J";
        if(n==5)return "Q";
        if(n==6)return "K";
        if(n==7)return "A";

        return "0";
    }
    public static char convertToChar(int num){
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
    //ToString methods
    public String toStringCSV() {
        return  clover + "," + diamond + "," + heart + "," + spade + "\n";
    }

    @Override
    public String toString() {
        return  this.opId ;
    }

    //Getters & Setters

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

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
