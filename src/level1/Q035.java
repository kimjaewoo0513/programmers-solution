// package level1;

// import java.util.Arrays;

// public class Q035 {
//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int[] d = {1,3,2,5,4};
//         int budget = 9;
//        System.out.println( s.solution(d, budget) );
//     }
// }

// //예산
// class Solution {
//     public int solution(int[] d, int budget) {
//         int answer = 0;
//         Arrays.sort(d);

//         // 배열의 수를 모두 더했을때 예산보다 작거나 같을때 그대로 배열의 길이 반환
//         int sum1 = 0;
//         int sum2 = 0;

//         for (int i : d) sum1+=i;
//         if(sum1 <= budget){
//             return d.length;
//         }else{

//             for (int i = 0; i < d.length; i++) {
//                 sum2+=d[i];

//                 if( budget < sum2){
//                     answer = i;
//                     break;
//                 }else{
//                     answer = d.length;
//                     continue;
//                 }
//             }
//             return answer;
//         }


//     }
// }