// package level1;

// public class Q028 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         String[] arr = { "Jane", "Kim" };
//         System.out.println(s.solution(arr));
//     }
// }

// // 서울에서 김서방 찾기
// class Solution {
//     public String solution(String[] seoul) {
//         String answer = "";
//         String kim = "Kim";

//         for (int i = 0; i < seoul.length; i++) {
//             if (seoul[i].equals(kim)) {
//                 answer = "김서방은 " + i + "에 있다";
//                 break;
//             }
//             continue;
//         }
//         return answer;

//     }
// }