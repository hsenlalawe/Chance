package Constants;

public final class FilesUtils {

    /**  directories */
    public static final String PRJ_DIR =   System.getProperty("user.dir").toString();
    public static final String HOME_DIR =   System.getProperty("user.home").toString();


    /** Selenium  */
    public static final String CHROME_DRIVER="webdriver.chrome.driver";
    public static final String CHROME_DRIVER_PATH= PRJ_DIR +"/Drivers/chromedriver";

    /** Files  */
    public static final String HISTORY_DEST_NAME= PRJ_DIR +"/Results/History/Chance";
    public static final String HISTORY_TH_DEST_NAME= PRJ_DIR +"/Results/History/ChanceTh";
    public static final String HISTORY_SRC_NAME= HOME_DIR +"/Downloads/Chance.csv";
    public static final String RESULT_ALL_OPT= PRJ_DIR +"/Results/Revive/rest";


}
