package level1;

public class Q036 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("P", 15));
    }
}

//시저암호
// 1차 시도 : 테스트 케이스 9번 뺴고 전부 틀렸음
// 이유  : 테스트 케이스 "P", 15) 시도, 대문자 P(ascii = 90)에 15칸을 shift 시 Z(ascii = 90)을 넘어 특수문자로 감 원래는 E(ascii = 69)가 나와야함 
class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int ascii = (int)s.charAt(i);
            if(ascii == 32){
                answer += new Character((char) ascii).toString();
            }else{
                if(ascii == 122 || ascii == 90){
                    ascii -= 26-n;
                    answer += new Character((char) ascii).toString();
                }else if(ascii+n > 90 || ascii+n > 122){
                    n -= 90 - ascii;
                    ascii = 64 + n;;
                    answer += new Character((char) ascii).toString();
                }
                else{
                    ascii += n;
                    answer += new Character((char) ascii).toString();
                }
            }
        }
        
        return answer;
    }
}