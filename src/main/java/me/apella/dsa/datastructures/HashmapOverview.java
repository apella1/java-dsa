package me.apella.dsa.datastructures;

import java.util.HashMap;

public class HashmapOverview {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Uganda", "Kampala");
        capitalCities.put("Zambia", "Lusaka");
        System.out.println(capitalCities.get("Zambia"));
        capitalCities.remove("Kenya");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        // clear() removes all the items
        // capitalCities.clear();
        System.out.println(capitalCities);
        loopingThroughHashmaps();
        System.out.println(capitalCities.values());
        System.out.println(capitalCities.keySet());
    }

    public static void loopingThroughHashmaps() {
        HashMap<String, Integer> programmingLanguages = new HashMap<>();
        programmingLanguages.put("Java", 1900);
        programmingLanguages.put("JavaScript", 1905);
        programmingLanguages.put("Python", 1300);
        programmingLanguages.put("Rust", 1400);
        programmingLanguages.put("Go", 1200);

        // looping through keys
        for (String lang : programmingLanguages.keySet()) {
            System.out.println(lang);
        }

        // looping through values
        for (Integer year : programmingLanguages.values()) {
            System.out.println(year);
        }
    }
}
