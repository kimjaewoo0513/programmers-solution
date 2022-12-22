// package level1;

// public class Q014 {
// public static void main(String[] args) {

// Solution14 s = new Solution14();

// System.out.println(s.solution("try hello world"));

// }

// }

// //이상한 문자 만들기
// class Solution14 {
// public String solution(String s) {
// String answer = "";
// String strArr[] = s.split("");
// int count = 0;

// for (String s1 : strArr) {

// if(s1.contains(" ")) {
// count = 0;
// }else {
// count++;
// }

// //짝수
// if(count % 2 == 0) {
// answer += s1.toLowerCase();
// }else {
// answer += s1.toUpperCase();
// }

// }

// return answer;
// }
// }