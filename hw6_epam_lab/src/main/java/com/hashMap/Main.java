package com.hashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String line = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
        String value = line.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        String[] wordsArray = value.split("\\s+");
        HashMap wordsMap = new HashMap();

        for (int i = 0; i < wordsArray.length; i++) {
            wordsMap.put(new Integer[i].length, wordsArray[i]);
        }

        wordsMap.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));

    }
}
