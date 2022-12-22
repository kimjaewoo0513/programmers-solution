// package level1;

// public class Q027 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         System.out.println(s.solution("pPoooyY"));
//     }
// }

// // 문자열 내 p와 y의 개수
// class Solution {
//     boolean solution(String s) {
//         boolean answer;
//         s = s.toLowerCase();
//         int p = s.length() - s.replace("p", "").length();
//         int y = s.length() - s.replace("y", "").length();

//         if (p == y) {
//             answer = true;
//         } else {
//             answer = false;
//         }

//         return answer;
//     }
// }