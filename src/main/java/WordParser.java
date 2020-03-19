import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordParser {
    public static List<String> parseForMaxWordCount(String line){
        LinkedHashMap<String, Integer> sortedWordCounter = new LinkedHashMap<>();
        if(line != null && line.trim().length() >0 ) {
            line = line.replaceAll("[^a-zA-Z0-9\\s\\'\\\\+]", "");
            line = line.trim();
            List<String> list = Stream.of(line).map(w -> w.split("\\s+")).flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            Map<String, Integer> wordCounter = list.stream()
                    .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
            wordCounter.entrySet()
                    .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(map -> sortedWordCounter.put(map.getKey(), map.getValue()));
        }
        Set<Map.Entry<String, Integer>> set = sortedWordCounter.entrySet();
        List<String> finalWord = new ArrayList<>();
        if((new ArrayList<Map.Entry<String, Integer>>(set)).size() > 0){
            finalWord.add((new ArrayList<Map.Entry<String, Integer>>(set)).get(0).getKey());
        }
        if((new ArrayList<Map.Entry<String, Integer>>(set)).size() > 1){
            finalWord.add((new ArrayList<Map.Entry<String, Integer>>(set)).get(1).getKey());
        }
        if((new ArrayList<Map.Entry<String, Integer>>(set)).size() > 2){
            finalWord.add((new ArrayList<Map.Entry<String, Integer>>(set)).get(2).getKey());
        }

        return finalWord;
    }
}
