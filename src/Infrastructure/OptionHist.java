package Infrastructure;

import static Constants.InfoUtils.HISTORY_SIZE;

public class OptionHist extends Option {

    private int[] repeatsByOrder =new int[HISTORY_SIZE];
    private static int[] maxRepeats =new int[HISTORY_SIZE];

    private int[] repeatsNoByOrder =new int[5];

    public OptionHist(char clover, char diamond, char heart, char spade) {
        super(clover, diamond, heart, spade);
    }

    public void setValInIndex(int index,int val)
    {
        this.repeatsByOrder[index]=val;
    }

    public int[] getRepeatsByOrder() {
        return repeatsByOrder;
    }

    public void setRepeatsByOrder(int[] repeatsByOrder) {
        this.repeatsByOrder = repeatsByOrder;
    }

    public void show() {
        System.out.print(this.clover + "," + diamond + "," + heart + "," + spade
                + ">> ");

        for (int i = 0; i < HISTORY_SIZE/3; i++)
            System.out.print(repeatsByOrder[i] + ": ");
        System.out.println("");

    }
    public int repeatsAtIndex(int index){

        return repeatsByOrder[index];
    }

    public static int[] getMaxRepeats() {
        return maxRepeats;
    }

    public static void setMaxRepeats(int index ,int val) {
            maxRepeats[index]=val;
    }
}
