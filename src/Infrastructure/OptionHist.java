package Infrastructure;

public class OptionHist extends Option {

    private int[] repets =new int[5];   //no reason for 5 need to think about it


    public OptionHist(char clover, char diamond, char heart, char spade) {
        super(clover, diamond, heart, spade);
    }

    public int[] getRepets() {
        return repets;
    }

    public void setRepets(int[] repets) {
        this.repets = repets;
    }


}
