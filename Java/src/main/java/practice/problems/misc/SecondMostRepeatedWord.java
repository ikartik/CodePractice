package practice.problems.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by kartik on 13/09/17.
 */
public class SecondMostRepeatedWord {

    public static void main(String[] args) {

        String sentence[] = {"he", "is", "the", "man", "is", "not", "an", "animal", "he", "is", "good"};

        System.out.println(findFirstRepeatedWord(sentence));
        System.out.println(findSecondMostFrequentWord(sentence));
    }

    static String findFirstRepeatedWord(String[] sentence){

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < sentence.length; i++){
            Integer value = map.get(sentence[i]);
            map.put(sentence[i], value!=null?value+1:1);
        }

        for(int i = 0; i < sentence.length; i++){
            if(map.get(sentence[i]) > 1)
                return sentence[i];
        }

        return null;
    }
    static String findSecondMostFrequentWord(String[] sentence){

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < sentence.length; i++){
            Integer value = map.get(sentence[i]);
            map.put(sentence[i], value!=null?value+1:1);
        }

        int max1 = 0;
        int max2 = 0;

        for(Integer freq : map.values()){
            if(freq > max1){
                max1 = freq;
                max2 = max1;
            }
            else if(freq < max2)
                max2 = freq;
        }

        for(Map.Entry<String, Integer> set: map.entrySet()){
            if(set.getValue() == max2){
                return set.getKey();
            }
        }
        return null;
    }

}
