package Infrastructure;

public class OptionHist extends Option {

    private int[] repeats =new int[5];   //no reason for 5 need to think about it


    public OptionHist(char clover, char diamond, char heart, char spade) {
        super(clover, diamond, heart, spade);
    }

    public void setValInIndex(int index,int val)
    {
        this.repeats[index]=val;
    }
    public int[] getRepeats() {
        return repeats;
    }

    public void setRepeats(int[] repeats) {
        this.repeats = repeats;
    }


}
