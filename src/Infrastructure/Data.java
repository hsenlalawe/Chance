package Infrastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Data {

    public static ArrayList<Option> allOptionsCh = new ArrayList<>();
    public static ArrayList<OptionInteger> allOptionsInt = new ArrayList<>();
    public static ArrayList<Option> historyCh = new ArrayList<>();
    public static ArrayList<OptionHist> historyHist = new ArrayList<>();

    public static ArrayList<OptionHist> boom(ArrayList<OptionHist> history)throws Exception{


        return history;
    }

    public static ArrayList<OptionHist> fillHist(ArrayList<OptionHist> history)throws Exception{

        for(int jumps=1;jumps<=history.size();jumps++){

            int placeInArray=jumps-1;

            for(int index=0;index<history.size()-jumps;index++){
                history.get(index).setValByIndex(placeInArray,history.get(index).repeat(history.get(index+jumps)));
            }
        }
        for(int index=0;index<OptionHist.getMaxRepeats().length;index++){
            int max=0;
            for(int i=0;i<history.size();i++){
               if(history.get(i).repeatsByIndex(index)>max)max=history.get(i).repeatsByIndex(index);

            }
            OptionHist.setMaxRepeats(index,max);
        }

        return history;
    }

    public static ArrayList<Option> cloneRest(String path)throws Exception
    {
        ArrayList<Option> rest = new ArrayList<>();
        ArrayList<String> restStr =cloneStringFrom(path);
        for(int i=0;i<restStr.size();i++){
            String[] splitted = restStr.get(i).split(",");
            rest.add(new Option(splitted[0].charAt(0),splitted[1].charAt(0),splitted[2].charAt(0),splitted[3].charAt(0)));
        }
        return rest;
    }
    public static ArrayList<OptionHist> cloneHist(String path)throws Exception
    {
        ArrayList<OptionHist> history = new ArrayList<>();
        ArrayList<String> historyStr =cloneStringFrom(path);

        for(int i=0;i<historyStr.size();i++){
            String[] splitted = historyStr.get(i).split(",");
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
    public static HashMap<String,Option> cloneRestHashMap(ArrayList<Option> rest)throws Exception {

        HashMap<String, Option> hashRest = new HashMap<String, Option>();

        for(int i=0;i<rest.size();i++) {
            hashRest.put(rest.get(i).getOpId(), rest.get(i));
        }
        return hashRest;
    }

}
