/*
가운데 글자 가져오기

public class Q06 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("qwer"));
    }
}

class Solution {
    public String solution(String s) {
        String ss = "";
        if(s.length() % 2 == 0){
            ss = s.substring(s.length()/2-1, s.length()/2+1);
        }else{
            ss = String.valueOf(s.charAt(s.length()/2));
        }

        return ss;
    }
}
*/