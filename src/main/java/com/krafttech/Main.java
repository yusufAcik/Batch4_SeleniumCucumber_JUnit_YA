package com.krafttech;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    String str="samsung,'OEM Samsung Washing Machine Pulsator Washplate Cap Shipped With WA48J7700AW, WA48J7700AW/A2, WA48J7700AW/AA', 20916,"+
            "samsung,'OEM Samsung Chrome Washing Machine Washplate Pulsator Cap Shipped With WA52M7750AV, WA52M7750AV/A4, WA52M7750AW, WA52M7750AW/A4', 91995,"+
            "samsung,'SAMSUNG Washing Machine Spring Hanger, DC61-01257M', 22970,"+
            "samsung,'Samsung DC97-17022B Assy Detergent', 32959,"+
            "samsung,'Samsung DC66-00470A DAMPER SHOCK', 29981,+" +
            "samsung,'DC64-00519D Samsung Washing Machine Door Lock Washer Dryer Dishwashe -MP#GH4498 349Y49HBRG9109150', 52000,"+
            "samsung,'Samsung DC97-16991A Assembly Filter', 13000";

        String[] strArr = str.split("samsung,'");
        for (String s : strArr) {
            System.out.println(s);
        }

        Map<String,String> mapStr=new TreeMap<>();
        for (int i = 1; i <strArr.length ; i++) {
            String[] strArrEach = strArr[i].split("',");
            mapStr.put(strArrEach[1],strArrEach[0]);
        }
        System.out.println("-----------------------");

        System.out.println("mapStr = " + mapStr);

        System.out.println("------------------------");

        mapStr.forEach((k,v)->System.out.println("samsung,'"+v+"',"+k));

        System.out.println("-------------------------");

        Iterator<String> iterator = mapStr.keySet().iterator();
        Iterator<String> iterator1 = mapStr.values().iterator();

       // while (iterator.hasNext()){
       //     String key = iterator.next();
       //     System.out.println("samsung,'"+mapStr.get(key)+"',"+key);
       // }

        while (iterator.hasNext()){
            System.out.println("samsung,'"+iterator1.next()+"',"+iterator.next());
        }
    }
}