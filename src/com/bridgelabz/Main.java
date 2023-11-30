package com.bridgelabz;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> mp = new HashMap<>(10);
        String input = "To be or not to be";

        String[] words = input.split(" ");

        // store all the word in map
        for(String word : words){
            if(mp.getValue(word) == null){
                mp.put(word,1);
            }else{
                mp.put(word,mp.getValue(word)+1);
            }
        }

        // print the frequencies of each word
        System.out.println("Frequencies :");
        for(String word : words){
            System.out.println(word + " : " + mp.getValue(word));
        }

    }
}