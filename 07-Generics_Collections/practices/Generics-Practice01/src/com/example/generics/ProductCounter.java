package com.example.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    // Create a Counting Map
    Map<String, Integer> countingMap  = new HashMap<>(); //sin ordenar <cod, cant>
    // Create a Name Mapping Map
    Map<String, String> nameMapping = new TreeMap<>(); //ordenado <descrip, cod>

    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");

        // Create Product Counter Object and process data
        ProductCounter p = new ProductCounter(productNames);
        p.processList(parts);
        p.printReport();
    }

    public ProductCounter(Map productNames) {
        // Your code here
        this.nameMapping = productNames;
    }

    public void processList(String[] list) {
        // your code here
        Integer contvalor = 0;
        for (int i = 0; i< list.length; i++)
        {
            if (countingMap.containsKey(list[i])){
                contvalor = countingMap.get(list[i]);
                contvalor++;
                countingMap.put(list[i], contvalor);
            }
            else
            {
                countingMap.put(list[i], 1);
            }
        }
    }

    public void printReport() {
        // Your code here
        
        System.out.println("=== Product Report ===");
        for (String key:this.nameMapping.keySet())
        {   
            System.out.println("Name: " + key + "\t\tCount: "+ countingMap.get(nameMapping.get(key))+"\n");
        }
    }
  
}
