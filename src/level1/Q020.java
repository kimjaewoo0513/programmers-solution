/*
음양 더하기
class Q01 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int [] absolutes = {4,7,12};
        boolean [] signs = {true,false,true};
        System.out.println(s.solution(absolutes,signs));

    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
       
        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] *= -1;
            }
            answer +=absolutes[i];
        }
        return answer;
    }
}

*/