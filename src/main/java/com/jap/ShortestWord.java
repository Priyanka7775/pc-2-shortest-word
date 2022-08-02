package com.jap;


public class ShortestWord {
    public static void main(String[] args) {
        String [] str;
        str = new String[] {"Java","Programming","Language"};
        ShortestWord y= new ShortestWord();
        String shortestWord =y.findShortestWord(str);
        System.out.println(shortestWord);

    }

    //Write the logic to find the shortest word from the String array inside
    // the below method and return the shortest word.
    public String findShortestWord(String[] words) {
        int minLength = words[0].length();
        String shortestWord=words[0];
        for(int i=0;i<words.length;i++){
            String word=words[i];
            int length=word.length();
            if(minLength>length){
                minLength=length;
                shortestWord=word;
            }
        }

        return shortestWord;

    }
}
