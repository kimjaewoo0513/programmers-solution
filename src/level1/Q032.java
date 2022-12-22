// package level1;

// public class Q032 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         System.out.println(s.solution("1234"));
//     }
// }
// 문자열 다루기 기본
// class Solution {
//     public boolean solution(String s) {

//         boolean answer = false;

//         if(s.length() == 4 || s.length() == 6){
//             String regExp = "^[0-9]+$";
//             answer = (s.matches(regExp)) ? true : false;
//         }

//         return answer;
//     }
// }