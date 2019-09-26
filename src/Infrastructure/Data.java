package Infrastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static Constants.FilesUtils.HISTORY_TH_DEST_NAME;
import static Constants.FilesUtils.RESULT_REST;
import static Constants.InfoUtils.SIZE;


public class Data {

   // public static final int SIZE =4096;
    public static ArrayList<Option> allOptionsCh = new ArrayList<>();
    public static ArrayList<OptionInteger> allOptionsInt = new ArrayList<>();
    public static ArrayList<Option> historyCh = new ArrayList<>();
    public static ArrayList<OptionHist> historyHist = new ArrayList<>();

    public static ArrayList<OptionHist> boom(ArrayList<OptionHist> history)throws Exception{

//        for(int index=0;index<history.size();jumps++){
//
//            int placeInArray=jumps-1;
//
//            for(int index=0;index<history.size()-jumps;index++){
//                history.get(index).setValInIndex(placeInArray,history.get(index).repeat(history.get(index+jumps)));
//            }
//        }
        return history;
    }

    public static ArrayList<OptionHist> fillHist(ArrayList<OptionHist> history)throws Exception{

        for(int jumps=1;jumps<=SIZE;jumps++){

            int placeInArray=jumps-1;

            for(int index=0;index<history.size()-jumps;index++){
                history.get(index).setValInIndex(placeInArray,history.get(index).repeat(history.get(index+jumps)));
            }
        }
        return history;
    }

    public static ArrayList<Option> cloneRest()throws Exception
    {
        ArrayList<Option> rest = new ArrayList<>();
        ArrayList<String> restStr =cloneStringFrom(RESULT_REST);
        for(int i=0;i<restStr.size();i++){
            String[] splitted = restStr.get(i).split(",");
            rest.add(new Option(splitted[0].charAt(0),splitted[1].charAt(0),splitted[2].charAt(0),splitted[3].charAt(0)));
        }
        return rest;
    }
    public static ArrayList<OptionHist> cloneHist()throws Exception
    {
        ArrayList<OptionHist> history = new ArrayList<>();
        ArrayList<String> restStr =cloneStringFrom(HISTORY_TH_DEST_NAME);

        for(int i=0;i<restStr.size();i++){
            String[] splitted = restStr.get(i).split(",");
            history.add(new OptionHist(splitted[2].charAt(0),splitted[3].charAt(0),splitted[4].charAt(0),splitted[5].charAt(0)));
        }
        return history;
    }

    public static ArrayList<String> cloneStringFrom(String path)throws Exception
    {
        ArrayList<String> strList = new ArrayList<>();

        String row="";
        BufferedReader csvReader = new BufferedReader(new FileReader(path));
        while ((row = csvReader.readLine()) != null) {
            strList.add(row);
        }
        csvReader.close();
        return strList;
    }




}
