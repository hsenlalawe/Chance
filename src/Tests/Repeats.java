package Tests;


import Infrastructure.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Infrastructure.Data.cloneRest;

@Tag("xx")
class Repeats {

    @BeforeEach
    void setUp() throws Exception{

      ArrayList<Option> rest=cloneRest();
    for(int i=0;i<10;i++){
        System.out.println(
                rest.get(i).toStringCSV()
        );

    }


    }
    @Test
    void RepeatsTest() throws Exception {


//        System.out.println(
////                System.getProperty("user.dir")
//                FilesUtils.HISTORY_SRC_NAME
//        );





    }

}