package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DownloadHistory {

    //TODO: https://code-examples.net/en/q/15a9700

    private final String CHROME_DRIVER="webdriver.chrome.driver";
    private final String FILE_NAME ="history";
    private final String DEST_PATH="/Users/hsenlalawe/Chance/Results/History";


    private String baseUrl = "https://www.pais.co.il/chance/archive.aspx";
    private String expectedTitle = "מפעל הפיס - צ'אנס | ארכיון תוצאות";
    private String actualTitle = "";
    private String imgPath="/images/ic_download.png";
    private String chromeDriverPath="/Users/hsenlalawe/drivers/chromedriver";


    @org.junit.jupiter.api.BeforeEach
    void setUp() throws InterruptedException {

        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty(CHROME_DRIVER, chromeDriverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        Thread.sleep(1000);  // Let the user actually see something!

        // get the actual value of the title
        actualTitle = driver.getTitle();

        Thread.sleep(1000);

        assertEquals(expectedTitle, actualTitle);

        WebElement element = driver.findElement((By.xpath("//img[@src='"+imgPath+"']")));
        element.click();

        Thread.sleep(3000);

        driver.close();
    }

    @Test
    void DownloadHistoryTest() throws Exception{

        String path="/Users/hsenlalawe/Downloads/" + FILE_NAME + ".csv";

        File csvFile = new File(path);
        assertEquals(csvFile.isFile(),true);

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        csvReader.readLine();  //for ignore first row
        ArrayList<String> data =new ArrayList<>();
        while ((row = csvReader.readLine()) != null) {
        data.add(row);
        }
        csvReader.close();

        FileWriter csvWriter = new FileWriter(DEST_PATH+"/"+FILE_NAME);
        for (String rowData : data) {
            csvWriter.append(rowData);
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

        File outFile = new File(DEST_PATH+"/"+FILE_NAME);
        assertEquals(outFile.isFile(),true);


     //   String home = System.getProperty("user.home");
        //File file = new File(home+"/Downloads/" + fileName + ".csv");

//        CkCsv csv = new CkCsv();
//        boolean success;
//        success = csv.LoadFile("/Users/hsenlalawe/Downloads/" + FILE_NAME + ".csv");
//        assertEquals(success,true);
//
//        success=csv.DeleteRow(0);
//        assertEquals(success,true);
//
//        //  Write the updated CSV to a string and display:
//        String csvDoc;
//        csvDoc = csv.saveToString();
//        System.out.println(csvDoc);
//
//        //  Save the CSV to a file:
//        success = csv.SaveFile(DEST_PATH);
//        assertEquals(success,true);




    }
}