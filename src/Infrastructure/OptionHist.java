package Infrastructure;

public class OptionHist extends Option {

    private int[] repeatsByOrder =new int[5];   //no reason for 5 need to think about it
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

    public void show(){
        System.out.println( this.clover + "," + diamond + "," + heart + "," + spade
                + ">> "+ repeatsByOrder[0]+": "+ repeatsByOrder[1]+": "+ repeatsByOrder[2]+": "
                + repeatsByOrder[3]+": "+ repeatsByOrder[4]+": "
        );
    }
    public int repeatsAtIndex(int index){

        return repeatsByOrder[index];
    }


}
