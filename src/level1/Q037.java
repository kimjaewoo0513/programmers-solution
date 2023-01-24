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

        System.out.println("답 = " + s.solution(sizes) );
    }
}

// tip. 모든 명함들의 긴 모서리를 가로로 돌려서 겹쳐봅시다.
//      그 상태에서 지갑에 한번에 넣을 수 있으려면 세로길이는 어떻게 해야할지 상상해봅시다!
class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp;
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            if(width < sizes[i][0]) 
                width = sizes[i][0];
            if(height < sizes[i][1]) 
                height = sizes[i][1];
        }
        System.out.println("최대 가로길이  = " + width);
        System.out.println("최대 세로길이  = " + height);
        return width * height;
    }
}
