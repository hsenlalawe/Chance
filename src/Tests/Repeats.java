package Tests;


import Infrastructure.Option;
import Infrastructure.OptionHist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Infrastructure.Data.*;

@Tag("xx")
class Repeats {

    @BeforeEach
    void setUp() throws Exception{

//        historyHist.get(i).show();
    }
    @Test
    void RepeatsTest() throws Exception {

        ArrayList<Option> rest=cloneRest();
        ArrayList<OptionHist> history=cloneHist();
        ArrayList<OptionHist> historyHist=fillHist(history);


        System.out.print("653: A,Q,A,7>> ");

//        for (int j=0;j<HISTORY_SIZE;j++){}
//            for (int k=0;k<HISTORY_SIZE;k++){ System.out.print(k+" ");}
//        for(int i=0;i<historyHist.size();i++) {
//           System.out.print(i+": ");
//            historyHist.get(i).show();
//        }



//        int m1=0,m2=0,m3=0,m4=0,m5=0;
//
//        for(int i=0;i<historyHist.size();i++){
//            if(historyHist.get(i).repeatsAtIndex(0)>m1)m1=historyHist.get(i).repeatsAtIndex(0);
//            if(historyHist.get(i).repeatsAtIndex(1)>m2)m2=historyHist.get(i).repeatsAtIndex(1);
//            if(historyHist.get(i).repeatsAtIndex(2)>m3)m3=historyHist.get(i).repeatsAtIndex(2);
//            if(historyHist.get(i).repeatsAtIndex(3)>m4)m4=historyHist.get(i).repeatsAtIndex(3);
//            if(historyHist.get(i).repeatsAtIndex(4)>m5)m5=historyHist.get(i).repeatsAtIndex(4);
//        }
//        System.out.print("max 1: "+m1
//                +", max 2: "+m2
//                +", max 3: "+m3
//                +", max 4: "+m4
//                +", max 5: "+m5
//        );
        // C(n,r) = n! / r! (n – r)!
    }

}