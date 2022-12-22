/*
없는 숫자 더하기
 
public class Q08 {
    public static void main(String[] args) {
        Solution s=  new Solution();
        int [] arr = {5,8,4,0,6,7,9};
        System.out.println(s.solution(arr));
    }
}

class Solution {
    public int solution(int[] numbers) {
        final int zeroToNineSum = 45;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++)
            sum += numbers[i];
        return zeroToNineSum - sum;
    }
}

*/