
// package level1;

// import java.util.ArrayList;
// import java.util.List;

// public class Q029 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int[] arr = { 5, 9, 7, 10 };
//         int divisor = 5;
//         System.out.println(s.solution(arr, divisor));
//     }
// }

// class Solution {
//     public List<Integer> solution(int[] arr, int divisor) {
//         List<Integer> answer = new ArrayList<Integer>();

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] % divisor == 0) {
//                 answer.add(arr[i]);
//                 answer.sort(null);
//                 continue;
//             }
//         }
//         if (answer.size() == 0) {
//             answer.add(-1);
//         }
//         return answer;
//     }
// }
