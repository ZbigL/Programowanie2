package pl.sdaacademy.intermediate.basic.basic3Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basic3Maps {
    public static void main(String[] args) {
        String[] array = new String[]{"abc", "abc", "efghijk", "abc", "lmnopr",
                "st", "abc", "u", "vwxyz", "st", "lmnopr", "st", "u", "vwxyz"};

        Map<String, Integer> hm = new HashMap<>();
        hm = initHashMap(array);
        System.out.println(hm);

        Map<String, Integer> lhm = new LinkedHashMap<>();
        lhm = initLinkHashMap(array);
        System.out.println(lhm);

        showMap(lhm);
        showKeys(lhm);
        showValues(lhm);


    }

    public static Map initHashMap(String[] array) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!hm.containsKey(array[i])) {
                hm.put(array[i], 1);
            } else {
                int v = hm.get(array[i]) + 1;
                hm.put(array[i], v);
            }
        }
        return hm;
    }

    public static Map initLinkHashMap(String[] array) {
        Map<String, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!lhm.containsKey(array[i])) {
                lhm.put(array[i], 1);
            } else {
                int v = lhm.get(array[i]) + 1;
                lhm.put(array[i], v);
            }
        }
        return lhm;
    }

    public static void showMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String string = pair.getKey();
            Integer iloscWystapien = pair.getValue();
            System.out.printf("\nString : %s\t - ilosc wystąpien : %d", string, iloscWystapien);
        }
    }

    public static void showKeys(Map<String, Integer> map) {
        System.out.println("Wypisz klucze");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey());
        }
    }

    public static void showValues(Map<String, Integer> map) {
        System.out.println("Wypisz wartosci");
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue());
        }
    }


}
