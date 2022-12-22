// package level1;

// import java.util.ArrayList;
// import java.util.List;

// public class Q033 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int [] arr = {1,1,3,3,0,1,1};
//         System.out.println(s.solution(arr));
//     }
// }
// //같은 숫자는 싫어
// class Solution {
//     public List<Integer> solution(int []arr) {
//         List<Integer> answer = new ArrayList<>();

//         for (int i = 0; i < arr.length; i++) {
//             if(!answer.isEmpty()){
//                 if (answer.get(answer.size() - 1) == arr[i]) {
//                     continue;
//                 }else{
//                     answer.add(arr[i]);
//                 }
//             }else{
//                 answer.add(arr[i]);
//             }
 
//         }
//         return answer;
//     }
// }