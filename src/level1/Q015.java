// package level1;

// public class Q015 {
// public static void main(String[] args) {

// Solution15 s = new Solution15();

// System.out.println(s.solution(12));

// }

// }

// //약수의 합
// class Solution15 {
// public int solution(int n) {
// int answer = 0;
// int [] arr = new int[n];

// for (int i = 1; i <= n; i++) {
// if( n % i == 0 ) {
// arr[i-1] = n;
// System.out.println((arr[i-1]));
// }
// }

// return answer;
// }
// }