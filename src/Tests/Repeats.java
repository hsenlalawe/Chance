package Tests;


import Infrastructure.Option;
import Infrastructure.OptionHist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static Constants.FilesUtils.*;
import static Infrastructure.Data.*;

@Tag("xx")
class Repeats {

    ArrayList<Option> rest=new ArrayList<>();
    ArrayList<OptionHist> history=new ArrayList<>();
    ArrayList<OptionHist> historyHist=new ArrayList<>();
    HashMap<String, Option> hashRest =new HashMap<>();

    @BeforeEach
    void setUp() throws Exception{
        rest=cloneRest(RESULT_ALL_OPT);
        history=cloneHist(HISTORY_TH_DEST_NAME);
        historyHist=fillHist(history);
        hashRest =cloneRestHashMap(rest);
    }
    @Test
    void RepeatsTest() throws Exception {

//        ArrayList<Option> rest=cloneRest();
//        ArrayList<OptionHist> history=cloneHist();
//        ArrayList<OptionHist> historyHist=fillHist(history);
//        HashMap<String, Option> hashRest =cloneRestHashMap(rest);

        for(int i=0;i<900;i++){
           int repeats= OptionHist.getMaxRepeatsByIndex(i);

            //{1234 -> 1234}
            if(repeats==3){
                ArrayList<Option> list=get4Choose4ByOrder(historyHist.get(i));
                for (int j=0;j<list.size();j++) {
                    hashRest.remove(list.get(j).getOpId());
                }
            }
            //{1234 -> 123x,12x4,1x34,x234 | x=0-7}
            if(repeats==2){
                ArrayList<Option> list=get4Choose3ByOrder(historyHist.get(i));
                for (int j=0;j<list.size();j++) {
                    hashRest.remove(list.get(j).getOpId());
                }
            }
        }
        System.out.println(hashRest.size());

        FileWriter csvWriter = new FileWriter(RESULT_REST2);
        hashRest.forEach((key, opt) -> {
            try {
                csvWriter.append(opt.toString());
                csvWriter.append("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        csvWriter.flush();
        csvWriter.close();

    }
    public void remove(int i,int maxRepeats){

        //{1234 -> 1234}
        if(maxRepeats==3){
            ArrayList<Option> list=get4Choose4ByOrder(historyHist.get(i));
            for (int j=0;j<list.size();j++) {
                hashRest.remove(list.get(j).getOpId());
            }
        }
        //{1234 -> 123x,12x4,1x34,x234 | x=0-7}
        if(maxRepeats==2){
            ArrayList<Option> list=get4Choose3ByOrder(historyHist.get(i));
            for (int j=0;j<list.size();j++) {
                hashRest.remove(list.get(j).getOpId());
            }
        }
    }


    public ArrayList<Option> get4Choose4ByOrder(Option opt){

        ArrayList<Option> list=new ArrayList<>();
        list.add(opt);

        return list;
    }
    // C(n,r) = n! / r! (n – r)!
    public ArrayList<Option> get4Choose3ByOrder(Option opt){

        ArrayList<Option> list=new ArrayList<>();

        for(int i=0;i<8;i++) {
            list.add(new Option(opt.getClover(),opt.getDiamond(),opt.getHeart(),Option.convertToChar(i)));
        }
         for(int i=0;i<8;i++) {
              list.add(new Option(opt.getClover(),opt.getDiamond(),Option.convertToChar(i),opt.getSpade()));
        }
        for(int i=0;i<8;i++) {
            list.add(new Option(opt.getClover(),opt.getHeart(),opt.getHeart(),opt.getSpade()));
        }
        for(int i=0;i<8;i++) {
            list.add(new Option(opt.getHeart(),opt.getDiamond(),opt.getHeart(),opt.getSpade()));
        }
        return list;
    }
}

//        for (int i=0;i<historyHist.size();i++){
//            System.out.println(i+1+") " +OptionHist.getMaxRepeatsByIndex(i));
//        }

//        HashMap<Integer, Option> hashRest = new HashMap<Integer, Option>();
//      //  HashMap<String, Option> hashRest = new HashMap<String, Option>();
//
//        for(int i=0;i<4096;i++){
//            hashRest.put(Integer.parseInt(Integer.toOctalString(i)),rest.get(i));
//            System.out.print(rest.get(i).getKeyMap()+" - ");
//            System.out.println(Integer.parseInt(Integer.toOctalString(i)));

//        for(int i=0;i<4096;i++) {
//            System.out.println(rest.get(i)+"   "+hashRest.get(rest.get(i).getKeyMap()));
//        }
//        for(int i=0;i<rest.size();i++){
//            System.out.println(rest.get(i).getOpId());
//
//        }
//        for (int i=0;i<10;i++){
//            System.out.println(i+1+") " +OptionHist.getMaxRepeatsByIndex(i));
//        }