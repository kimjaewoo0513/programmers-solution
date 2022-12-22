
/*
나머지가 1이되는 수 찾기
public class Q02 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(10);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if( n % i == 1 ){
                answer = i;
                System.out.println(answer);
                break;
            }

        }
        return answer;
    }
}

 */