package com.company.oracle.java;

import java.util.*;
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

public class Main {
    public static void main(String[] args) {
        String str = "2343225,2345,us_east,RedTeam,ProjectApple,3445\n" +
                "1223456,2345,us_west,BlueTeam,ProjectBanana,2211\n" +
                "3244332,2346,eu_west,YellowTeam3,ProjectCarrot,4322\n" +
                "1233456,2345,us_west,BlueTeam,ProjectDate,2221\n" +
                "3244132,2346,eu_west,YellowTeam3,ProjectEgg,4122";
        getUniQueRecords(str);
    }

    /**
     *
     * @param str
     */
    private static void getUniQueRecords(String str) {
        String[] tokens = str.split("\\s");
        List<String> projectListRowWise = Arrays.stream(tokens).collect(Collectors.toList());
        //The number of unique customerId for each contractId.
        getNoOfCustIDsForContractId(projectListRowWise);

        //The number of unique customerId for each Geozone.
        getNoOfUniQueCustIDsForGeoZone(projectListRowWise);

        //The list of unique customerId for each Geozone
        getListOfUniqueCustIdsForgeoZone(projectListRowWise);

        //The average build duration for each Geozone.
        getAverageBuildDurationForGeoZone(projectListRowWise);
    }

    /**
     *
     * @param projectListRowWise
     */
    private static void getAverageBuildDurationForGeoZone(List<String> projectListRowWise) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (String projectData : projectListRowWise) {
            String[] split = projectData.split(",");
            if (split.length > 0) {
                String key = split[2];
                if (map.containsKey(key)) {
                    map.get(key).add(split[5]);
                } else {
                    map.put(key, new LinkedList<>(Arrays.asList(new String[]{split[5]})));
                }
            }
        }
        getAverage(map);
    }

    /**
     *
     * @param map
     */
    private static void getAverage(HashMap<String, List<String>> map) {
        Map<String, Double> results = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            Double average = calcAverage(entry.getValue());
            results.put(entry.getKey(), average);
        }
        dispAverageByGeoZone(results);
    }

    /**
     *
     * @param results
     */
    private static void dispAverageByGeoZone(Map<String, Double> results) {
        Iterator<Map.Entry<String, Double>> iterator = results.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            System.out.println("The average build duration for the Geo Zone:-" + entry.getKey() +
                    "and value is = " + entry.getValue());
        }
    }

    /**
     *
     * @param values
     * @return
     */
    private static Double calcAverage(List<String> values) {
        double result = 0;
        for (String value : values) {
            result += Double.parseDouble(value);
        }
        return result / values.size();
    }

    /**
     *
     * @param projectListRowWise
     */
    private static void getListOfUniqueCustIdsForgeoZone(List<String> projectListRowWise) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (String projectData : projectListRowWise) {
            String[] split = projectData.split(",");
            if (split.length > 0) {
                String key = split[1];
                if (map.containsKey(key)) {
                    map.get(key).add(split[0]);
                } else {
                    map.put(key, new LinkedList<>(Arrays.asList(new String[]{split[0]})));
                }
            }
        }
        dispUniqueRecords(map , Boolean.FALSE);
    }

    /**
     *
     * @param projectListRowWise
     */
    private static void getNoOfCustIDsForContractId(List<String> projectListRowWise) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (String projectData : projectListRowWise) {
            String[] split = projectData.split(",");
            if (split.length > 0) {
                String key = split[1];
                if (map.containsKey(key)) {
                    map.get(key).add(split[0]);
                } else {
                    map.put(key, new LinkedList<>(Arrays.asList(new String[]{split[0]})));
                }
            }
        }
        dispUniqueRecords(map,Boolean.TRUE);
    }

    /**
     *
     * @param projectListRowWise
     */
    private static void getNoOfUniQueCustIDsForGeoZone(List<String> projectListRowWise) {
        final HashMap<String, List<String>> map = new HashMap<>();
        for (String projectData : projectListRowWise) {
            String[] split = projectData.split(",");
            if (split.length > 0) {
                String key = split[2];
                if (map.containsKey(key)) {
                    map.get(key).add(split[0]);
                } else {
                    map.put(key, new LinkedList<>(Arrays.asList(new String[]{split[0]})));
                }
            }
        }
        dispUniqueRecords(map , Boolean.TRUE);
    }

    /**
     *
     * @param map
     * @param sizeToReturn
     */
    private static void dispUniqueRecords(HashMap<String, List<String>> map,Boolean sizeToReturn) {

        Iterator<Map.Entry<String, List<String>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<String>> entry = iterator.next();
            if(sizeToReturn == Boolean.TRUE) {
                System.out.println("The number of unique customerId for the contractId:-" + entry.getKey() +
                        "and the size is = " + entry.getValue().size());
            }else{
                System.out.println("The number of unique customerId for the contractId:-" + entry.getKey() +
                        "and the size is = " + entry.getValue());
            }
        }
    }

}
