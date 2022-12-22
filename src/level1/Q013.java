// package level1;

// import java.util.stream.Stream;

// public class Q013 {
// public static void main(String[] args) {

// Solution13 s = new Solution13();

// System.out.println(s.solution(12345));

// }

// }

// //자연수 뒤집어 배열로 만들기
// class Solution13 {
// public int[] solution(long n) {
// int[] answer =
// Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
// int[] reverseArr = new int[answer.length];
// for (int i = answer.length -1, j=0; i >= 0; i--,j++) {
// reverseArr[j] = answer[i];
// }
// return reverseArr;
// }
// }