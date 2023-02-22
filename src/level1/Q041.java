// package level1;

// public class Q041 {

//     public static void main(String[] args) {
//         Solution ss = new Solution();
//         String s = "2three45sixseven";
//         System.out.println(ss.solution(s));
//     }
// }

// // 숫자 문자열과 영단어
// class Solution {
//     public int solution(String s) {
//         int answer = 0;

//         String [] engNumber = {"zero","one","two","three","four","five","six","seven","eight","nine"};

//         for (int i = 0; i < engNumber.length; i++) {
//             String replaceNumber = Integer.toString(i);
//             if(s.contains(engNumber[i]))
//                 s = s.replaceAll(engNumber[i], replaceNumber);
//             else
//                 continue;
//         }
//         return answer = Integer.parseInt(s);
//     }
// }