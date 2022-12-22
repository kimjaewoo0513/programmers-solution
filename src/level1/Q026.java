/*
두 정수 사이의 합

public class Q07 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, 5));
    }
}

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b){
            int temp = a;
            a = b;
            b = temp;

            for (int i = a; i <= b; i++) {
                answer +=i;
            }
        }else if( a == b ){
            answer = a;
        }else{
            for (int i = a; i <= b; i++) {
                answer +=i;
            }
        }
        return answer;
    }
}

*/