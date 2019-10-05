package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static Constants.FilesUtils.HISTORY_20TH_DEST_NAME;
import static Constants.FilesUtils.HISTORY_DEST_NAME;

public class LimitHistoryTo20K {
    private ArrayList<String> data =new ArrayList<>();

    @BeforeEach
    void setUp() throws Exception{

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(HISTORY_DEST_NAME));

        for(int i=0;i<20000;i++) {
            if( (row = csvReader.readLine()) != null) {
                data.add(row);
            }
        }
        csvReader.close();
    }

    @Test
    void LimitHistoryTo20K() throws Exception{

        FileWriter csvWriter = new FileWriter(HISTORY_20TH_DEST_NAME);
        for (String rowData : data) {
            csvWriter.append(rowData);
            csvWriter.append("\n");
        }
        csvWriter.flush();
        csvWriter.close();
    }

}