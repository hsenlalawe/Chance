package Tests;

import Infrastructure.OptionInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static Infrastructure.Data.allOptionsCh;
import static Infrastructure.Data.allOptionsInt;

@Tag("xx")
class InitArrays {

    @BeforeEach
    void setUp() {

        //7,8,9,10,J,Q,K,A
        for (int iClover = 0; iClover < 8; iClover++) {
            for (int iDiamond = 0; iDiamond < 8; iDiamond++) {
                for (int iHeart = 0; iHeart < 8; iHeart++) {
                    for (int iSpade = 0; iSpade < 8; iSpade++) {
                        allOptionsInt.add(new OptionInteger(iClover, iDiamond, iHeart, iSpade));
                    }
                }
            }
        }
        for (OptionInteger oi:allOptionsInt) {
            allOptionsCh.add(oi.convertToOption());
        }
    }

    @Test
    void GenerateAllOptionsTest() throws Exception{

        System.out.println("allOptionsInt size: "+
                allOptionsInt.size());
        System.out.println("allOptionsCh size: "+
                allOptionsCh.size());
    }
}