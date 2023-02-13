package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Q039 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String [] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        s.solution(strings, n);
        
    }
}

//문자열 내 마음대로 정렬하기
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        int stringLength = strings.length;
        String[] answer = new String[stringLength];

        LinkedHashMap<Integer, Character> lhm = new LinkedHashMap<>();
        for (int i = 0; i < strings.length; i++) {
            char s = strings[i].charAt(n);
            lhm.put(i, s);
        }

        List<Map.Entry<Integer, Character>> entryList = new LinkedList<>(lhm.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Character> entry : entryList){
            list.add(entry.getKey());
        }

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[list.get(i)];
            System.out.println(answer[i]);
        }

        return answer;
    }
}
