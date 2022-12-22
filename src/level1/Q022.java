
/*
약수의 개수와 덧셈
import java.util.ArrayList;

public class Q03 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println( s.solution(13, 17));
    }
}

class Solution {
    public int solution(int left, int right) {
        
        int sum = 0;

        //약수와 약수의 개수
        ArrayList<Integer> divisor = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                
                if( i % j == 0 ){
                    divisor.add(j);
                    continue;
                }
            }
            int temp = i;
            if(divisor.size() % 2 != 0) temp *= -1;
            divisor.clear();
            sum +=temp;
        }

        return sum;
    }
} 











####################참고용

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}


 */
