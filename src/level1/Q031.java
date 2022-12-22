// package level1;

// import java.util.Arrays;
// import java.util.Collections;

// public class Q031 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         System.out.println(s.solution("Zbcdefg"));
//     }
    
// }
// 문자열 내림차순으로 배치하기
// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String [] arr = s.split("");
        
//         Arrays.sort(arr, Collections.reverseOrder());
//         answer = String.join(answer, arr);
//         return answer;
//     }
// }