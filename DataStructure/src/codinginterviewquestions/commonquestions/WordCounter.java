package codinginterviewquestions.commonquestions;

import java.util.HashMap;
import java.util.Map;

public class WordCounter
{
    public static void main(String args[])
    {
        String str = "Hello world hello java world";

        Map<String,Integer> wordcounts = new HashMap<>();

        //split the string into word
        String[] words = str.split("");

        for(String word:words)
        {
            if(!wordcounts.containsKey(word))
            {
                wordcounts.put(word,1);


            }
            else
            {
                int count = wordcounts.get(word);
                wordcounts.put(word,count+1);


            }
        }

        //Print the occurrence of each word
        for(String word:wordcounts.keySet())
        {
            System.out.println(word+":"+wordcounts.get(word));
        }
    }

}
