package level1;

public class Q037 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] sizes1 = {  {60, 50}
                           ,{30, 70}
                           ,{60, 30}
                           ,{80, 40} };

        int[][] sizes = {    {10, 7}
                            ,{12, 3}
                            ,{8, 15}
                            ,{14, 7}
                            ,{5, 15} };

        System.out.println( s.solution(sizes) );
    }
}


/*
    최소 직사각형
    1. 모든 배열의 0번째 요소끼리 비교 -> 가장 큰 값, 가장 작은 값 저장
    2. 모든 배열의 1번째 요소끼리 비교 -> 가장 큰 값, 가장 작은 값 저장
    3. 가장 큰 세로 길이가 가장 큰 가로 길이보다 작거나 같고, 그 배열의 가로 길이가 가장 큰 세로 길이 보다 작거나 같을 때
       순서를 바꾸고 계산 시작.
 */
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;

        int maxW = sizes[0][0];
        int minW = sizes[0][0];

        int maxH = sizes[0][1];
        int minH = sizes[0][1];

        for (int i = 0; i < sizes.length; i++) {
            if(maxW < sizes[i][0]) maxW = sizes[i][0];
            if(minW > sizes[i][0]) minW = sizes[i][0];


            // 예제 2번에서 순서 바귀지 않는 현상 있음
            if(maxH <= maxW && sizes[i][0] <= maxH){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if(maxH < sizes[i][1]) maxH = sizes[i][1];
            if(minH > sizes[i][1]) minH = sizes[i][1];
        }

        return answer = maxH * maxW;
    }
}
