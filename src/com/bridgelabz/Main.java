package com.bridgelabz;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>(10);
        String input = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situation";

        String[] words = input.split(" ");

        // store all the word in map
        for(String word : words){
            if(mp.getValue(word) == null){
                mp.put(word,1);
            }else{
                mp.put(word,mp.getValue(word)+1);
            }
        }

        // print the frequencies of each word before removing
        System.out.println("Frequencies :");
        for(String word : words){
            System.out.println(word + " : " + mp.getValue(word));
        }

        //remove the word "avoidable"
        mp.removeKey("avoidable");

        // print the frequencies of each word after removing
        System.out.println("Frequencies :");
        for(String word : words){
            System.out.println(word + " : " + mp.getValue(word));
        }


    }
}