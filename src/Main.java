import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubstring("aaaaaaaaaaaaaa", new String[]{"aa", "aa"}));
    }

}

class Solution {
    // 202403230458 again
    public List<Integer> findSubstring(String s, String[] words) {
        return null;
    }


//    // 20240323 again
//    public List<Integer> findSubstring(String s, String[] words) {
//        List<String> sList = new ArrayList<>();
//        List<String> wordsList = List.of(words);
//        Map<String, Integer> closestStrMap = Arrays.stream(words).distinct().collect(Collectors.toMap(a -> a, b -> s.indexOf(b)));
//        List<Integer> result = new ArrayList<>();
//        for (Map.Entry<String, Integer> map :
//                closestStrMap.entrySet()) {
//
//
//            String sCopy = s.substring(map.getValue());
//            while (sCopy.length() >= words[0].length()) {
//                sList.add(sCopy.substring(0, words[0].length()));
//                sCopy = sCopy.replaceFirst(sCopy.substring(0, words[0].length()), "");
//            }
//            List<String> wordsCopyList = wordsList.stream().collect(Collectors.toList());
//            List<String> middleList = new ArrayList<>();
//
//            for (String str : sList) {
//                if (wordsList.contains(str)) {
//                    if (!wordsCopyList.contains(str)) {
//                        wordsCopyList.add(middleList.get(0));
//                        middleList.remove(0);
//                        continue;
//                    }
//                    wordsCopyList.remove(str);
//                    middleList.add(str);
//                } else {
//                    middleList = new ArrayList<>();
//                    wordsCopyList = wordsList.stream().collect(Collectors.toList());
//                }
//                System.out.println(middleList);
//                if (middleList.size() == words.length) {
//                    String joiningStr = middleList.stream().collect(Collectors.joining());
//                    int firstIndexOf = s.indexOf(joiningStr);
//                    int lastIndexOf = s.lastIndexOf(joiningStr);
//                    if (firstIndexOf != -1) {
//                        result.add(s.indexOf(joiningStr));
//                        if (firstIndexOf != lastIndexOf) {
//                            if (s.equals(s.substring(0).repeat(s.length()))) {
//                                String strForFilterSameLetter = s;
//                                int i = 0;
//                                while (strForFilterSameLetter.length() >= joiningStr.length()) {
//                                    strForFilterSameLetter = strForFilterSameLetter.substring(0, joiningStr.length() - words[0].length());
//                                    result.add(i++);
//                                }
//                            } else {
//                                String strForRemoveDuplicates = s;
//                                firstIndexOf = strForRemoveDuplicates.indexOf(joiningStr);
//                                lastIndexOf = strForRemoveDuplicates.lastIndexOf(joiningStr);
//                                while (firstIndexOf != lastIndexOf) {
//                                    result.add(lastIndexOf);
//                                    strForRemoveDuplicates = strForRemoveDuplicates.replaceFirst(joiningStr, "");
//                                    firstIndexOf = strForRemoveDuplicates.indexOf(joiningStr);
//                                    lastIndexOf = strForRemoveDuplicates.lastIndexOf(joiningStr);
//                                }
//                            }
//                        }
//                    }
//                    wordsCopyList.add(middleList.get(0));
//                    middleList.remove(0);
//                }
//            }
//        }
//        return result.stream().distinct().sorted().collect(Collectors.toList());
//    }

    //    public List<Integer> findSubstring(String s, String[] words) {
//        String[] strArray = new String[s.length()/words[0].length()];
//        int i = 0;
//        while (s.length() != 0) {
//            strArray[i++] = s.substring(0, words[0].length());
//            s = s.replaceFirst(s.substring(0, words[0].length()), "");
//        }
//        String initStr = Arrays.stream(words).collect(Collectors.joining());
////        while (initStr.length() != 0) {
////            initStr = initStr.replaceFirst(initStr.substring(0, words[0].length()), "");
////        }
//        System.out.println(Arrays.toString(strArray));
//        System.out.println(Arrays.toString(words));
//        return null;
//String str = s;
//        for (int i = 0; i < words.length; i++) {
//        str = str.replaceFirst(words[i], String.valueOf(i));
//    }
//    List<Character> charList = new ArrayList<>();
//    List<String> strList = new ArrayList<>();
//    List<Integer> result = new ArrayList<>();
//        for (Character cha : str.toCharArray()) {
//        if (Character.isDigit(cha)) {
//            if (charList.contains(cha) && charList.size() == words.length - 1) {
//                charList.remove(cha);
//                strList.remove(words[Integer.valueOf(String.valueOf(cha))]);
//            }
//            charList.add(cha);
//            strList.add(words[Integer.valueOf(String.valueOf(cha))]);
//        } else {
//            charList = new ArrayList<>();
//            strList = new ArrayList<>();
//        }
//        if (charList.size() == words.length) {
//            charList.remove(0);
//            strList.remove(0);
//            result.add(s.indexOf(strList.stream().collect(Collectors.joining())));
//        }
//    }
//        return result.stream().sorted().collect(Collectors.toList());
//    }
}