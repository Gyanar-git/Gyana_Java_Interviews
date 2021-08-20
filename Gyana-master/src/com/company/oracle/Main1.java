package com.company.oracle;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
The first line of data would then be interpreted as
  2343225 is the customerId
  2345 is the contractId
  us_east is the geozone
  RedTeam is the teamcode
  ProjectApple is the projectcode
  3445s is the buildduration
 */

public class Main1 {
    public static void main(String[] args) {
        //Input String
        String str = "2343225,2345,us_east,RedTeam,ProjectApple,3445s\n" +
                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211s\n" +
                "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322s\n" +
                "1233456,2345,us_west,BlueTeam,ProjectDate,2221s\n" +
                "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122s";

        getUniQueRecords(str);
    }

    private static void getUniQueRecords(String str) {
        String[] tokens = str.split("\\s");
        List<String> collect = Arrays.stream(tokens).collect(Collectors.toList());

        GyanMultiValMap<String , String> uniqueCustId = new GyanMultiValMap<>();
        GyanMultiValMap<String , String> uniqueCustId1 = new GyanMultiValMap<>();
        GyanMultiValMap<String , String> uniqueCustI2 = new GyanMultiValMap<>();
        GyanMultiValMap<String , String> uniqueCustI3 = new GyanMultiValMap<>();


        for(String c:collect){
            String[] split = c.split(",");
            //The number of unique customerId for each contractId
            uniqueCustId = getUniQueData(split[1],split[0],uniqueCustId);

            //The number of unique customerId for each geozone.
            uniqueCustId1 = getUniQueData(split[2],split[0],uniqueCustId1);

            //The average buildduration for each geozone.Need to calculate the average
            uniqueCustI2 = getUniQueData(split[2],split[5],uniqueCustI2);

            //The list of unique customerId for each geozone."
            uniqueCustI3 = getUniQueData(split[2],split[0],uniqueCustI3);


        }

        System.out.println("The number of unique customerId for each contractId:-" +uniqueCustId.toString());
        System.out.println("The number of unique customerId for each geozone:-" +uniqueCustId1.toString());
        //This average we need to calculate per keys which is not handled
        System.out.println("The average build duration for each geozone:-" +uniqueCustI2.toString());
        System.out.println("The list of unique customerId for each geozone.:-" +uniqueCustI3.toString());
    }


    /**
     *
     * @param key
     * @param val
     * @param myMap
     * @return
     */
    private static GyanMultiValMap<String ,String> getUniQueData(String key, String val,
                                                                  GyanMultiValMap<String , String> myMap) {
        myMap.put(key,val);
        return myMap;
    }
}
