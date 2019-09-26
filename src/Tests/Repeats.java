package Tests;


import Infrastructure.Option;
import Infrastructure.OptionHist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Infrastructure.Data.cloneHist;
import static Infrastructure.Data.cloneRest;

@Tag("xx")
class Repeats {

    @BeforeEach
    void setUp() throws Exception{

      ArrayList<Option> rest=cloneRest();
      ArrayList<OptionHist> history=cloneHist();

      for(int i=0;i<10;i++)
      {
          System.out.println(history.get(i).toStringCSV());
      }

    }
    @Test
    void RepeatsTest() throws Exception {

    }

}