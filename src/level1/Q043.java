// package level1;

// public class Q043 {
//     public static void main(String[] args) {
//         Solution s = new  Solution();
//         String t = "10203";
//         String p = "15";// {"500220839878"	"7"} , {"10203"	"15"}

//         System.out.println(s.solution(t, p));
//     }
// }

// //크기가 작은 부분문자열
// class Solution {
//     public int solution(String t, String p) {
//         int answer = 0;

//         //t.length() - p.length() + 1  => p의 길이 만큼 잘려서 나오는 수의 갯수
//         for (int i = 0; i < t.length() - p.length() + 1; i++) {
//             if(Long.parseLong( t.substring(i, i+p.length())) <= Long.parseLong(p)){
//                 answer++;
//             }
//         }

//         return answer;
//     }
// }
