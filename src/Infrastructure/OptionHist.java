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

    public void show(){
        System.out.println( this.clover + "," + diamond + "," + heart + "," + spade
                + ">> "+repeats[0]+": "+repeats[1]+": "+repeats[2]+": "
                + repeats[3]+": "+repeats[4]+": "
        );
    }
    public int repeatsAtIndex(int index){

        return repeats[index];
    }


}
