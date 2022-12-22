// package level1;

// import java.util.Arrays;

// public class Q010 {
// public static void main(String[] args) {
// Solution s = new Solution();

// int[] arr = {4,3,2,1};

// System.out.println(s.solution(arr));

// }
// }

// /*
// ** stream은 for loop 보다 수행속도가 좋지 않다.
// ** 간결한 코드를 위해 라이브러리 사용.
// */

// class Solution {
// public int[] solution(int[] arr) {
// int[] answer = {};
// int item = Arrays.stream(arr).min().getAsInt();
// if (arr.length <= 1) return new int[]{ -1 };
// answer = Arrays.stream(arr)
// .filter(i -> i != item )
// .toArray();

// return answer;
// }
// }
