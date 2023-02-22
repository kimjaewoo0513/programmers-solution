// package level1;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;
// import java.util.TreeSet;

// public class Q042 {
//     public static void main(String[] args) {
//         Solution s = new Solution();

//         int [] numbers = {2,1,3,4,1};
//         System.out.println(s.solution(numbers));
//     }
// }
//두 개 뽑아서 더하기
// class Solution {
//     public int[] solution(int[] numbers) {
//         Arrays.sort(numbers);
//         List<Integer> list = new ArrayList<>();

//         for (int i = 0; i < numbers.length; i++) {
//             if(i >= 1 && numbers[i] == numbers[i-1]) 
//                 continue;
//             for (int j = i; j < numbers.length; j++) {
//                 if(j+1==numbers.length)
//                     break;
//                 list.add(numbers[i] + numbers[j+1]);
//             }
//         }

//         TreeSet<Integer> set = new TreeSet<>(list);
//         list = new ArrayList<>(set);
//         int[] answer = new int[list.size()];

//         for (int i = 0; i < list.size(); i++) {
//             answer[i] = list.get(i);
//         }
//         return answer;
//     }
// }

// 1,1,2,3,4
// 11 2
// 12 3
// 13 4
// 14 5
// 23 5
// 24 6
// 34 7




