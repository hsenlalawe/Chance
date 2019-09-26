package Infrastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static Constants.FilesUtils.HISTORY_SRC_NAME;

public class Data {

    public static ArrayList<Option> allOptionsCh = new ArrayList<>();
    public static ArrayList<OptionInteger> allOptionsInt = new ArrayList<>();
    public static ArrayList<Option> historyCh = new ArrayList<>();
    public static ArrayList<OptionHist> historyHist = new ArrayList<>();



    public static ArrayList<Option> cloneRest()throws Exception
    {
        ArrayList<Option> rest = new ArrayList<>();
        ArrayList<String> restStr = new ArrayList<>();

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(HISTORY_SRC_NAME));

        while ((row = csvReader.readLine()) != null) {
            restStr.add(row);
        }
        csvReader.close();

        for(int i=0;i<restStr.size();i++){
            String[] splitted = restStr.get(i).split(",");
            System.out.print(splitted[0].charAt(0)+"   "+splitted[1].charAt(0)+"   "+splitted[2].charAt(0)+"   "+splitted[3].charAt(0));
            rest.add(new Option(splitted[0].charAt(0),splitted[1].charAt(0),splitted[2].charAt(0),splitted[3].charAt(0)));
        }
        return rest;
    }

    public static ArrayList<Option> getAllOptionsCh() {
        return allOptionsCh;
    }

    public static void setAllOptionsCh(ArrayList<Option> allOptionsCh) {
        Data.allOptionsCh = allOptionsCh;
    }

    public static ArrayList<OptionInteger> getAllOptionsInt() {
        return allOptionsInt;
    }

    public static void setAllOptionsInt(ArrayList<OptionInteger> allOptionsInt) {
        Data.allOptionsInt = allOptionsInt;
    }

    public static ArrayList<Option> getHistoryCh() {
        return historyCh;
    }

    public static void setHistoryCh(ArrayList<Option> historyCh) {
        Data.historyCh = historyCh;
    }

    public static ArrayList<OptionHist> getHistoryHist() {
        return historyHist;
    }

    public static void setHistoryHist(ArrayList<OptionHist> historyHist) {
        Data.historyHist = historyHist;
    }

}
