package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("first")
class LimitHistoryTo1000 {

    private ArrayList<String> data =new ArrayList<>();
    private final String FILE_NAME ="Chance";
    private final String DEST_PATH="/Users/hsenlalawe/Chance/Results/History";

    @BeforeEach
    void setUp() throws Exception{

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(DEST_PATH+"/"+FILE_NAME));

        for(int i=0;i<1000;i++) {
           if( (row = csvReader.readLine()) != null) {
               data.add(row);
           }
        }
        csvReader.close();

    }
    @Test
    void LimitHistoryTo1000Test() throws Exception{

        FileWriter csvWriter = new FileWriter(DEST_PATH+"/"+FILE_NAME);
        for (String rowData : data) {
            csvWriter.append(rowData);
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        File outFile = new File(DEST_PATH+"/"+FILE_NAME);
        assertEquals(outFile.isFile(),true);

    }
}