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

      ArrayList<Option> rest=cloneRest();
      ArrayList<OptionHist> history=cloneHist();
      ArrayList<OptionHist> historyHist=fillHist(history);

//        historyHist.get(i).show();
    }
    @Test
    void RepeatsTest() throws Exception {

        int m1=0,m2=0,m3=0,m4=0,m5=0;

        for(int i=0;i<historyHist.size();i++){


        }

    }

}