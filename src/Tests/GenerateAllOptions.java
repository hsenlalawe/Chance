package Tests;

import Infrastructure.Option;
import Infrastructure.OptionInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("first")
class GenerateAllOptions {

    private ArrayList<Option> data = new ArrayList<>();
    private ArrayList<OptionInteger> dataInt = new ArrayList<>();
    private final String DEST_PATH="/Users/hsenlalawe/Chance/Results/Revive";
    private final String FILE_NAME ="rest";


    @BeforeEach
    void setUp() {
        //7,8,9,10,J,Q,K,A
        for (int iClover = 0; iClover < 8; iClover++) {
            for (int iDiamond = 0; iDiamond < 8; iDiamond++) {
                for (int iHeart = 0; iHeart < 8; iHeart++) {
                    for (int iSpade = 0; iSpade < 8; iSpade++) {
                        dataInt.add(new OptionInteger(iClover, iDiamond, iHeart, iSpade));
                    }
                }
            }
        }
        for (OptionInteger oi:dataInt) {
            data.add(oi.convertToOption());
        }
    }
    @Test
    void GenerateAllOptionsTest() throws Exception {

        FileWriter csvWriter = new FileWriter(DEST_PATH+"/"+FILE_NAME);
        for (Option opt : data) {
            csvWriter.append(opt.toStringCSV());
        }

        csvWriter.flush();
        csvWriter.close();

        File outFile = new File(DEST_PATH+"/"+FILE_NAME);
        assertEquals(outFile.isFile(),true);
    }
}