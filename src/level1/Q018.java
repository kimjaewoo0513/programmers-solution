/*

부족한 금액 계산하기

public class Q09 {
    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.solution(3, 20, 4));
    }    
}

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) 
            totalPrice += price*i;

        if( money < totalPrice ){
            return answer = totalPrice - money;
        }else{
            return 0;    
        }
    }
}

*/