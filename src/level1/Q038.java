package level1;

import java.util.ArrayList;

public class Q038 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 5;
        int arr1[] = {9, 20, 28, 18, 11};
        int arr2[] = {30, 1, 21, 17, 28};
        System.out.println(s.solution(n, arr1, arr2));
        
    }
}

//비밀지도
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        ArrayList<Integer> map1 = new ArrayList<>();
        ArrayList<Integer> map2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String binaryString1 = Integer.toBinaryString(arr1[i]);
            String binaryString2 = Integer.toBinaryString(arr2[i]);

            // map1(i)의 길이가 n보다 작을때 n만큼 앞에 0을 붙여주는 작업 필요
            if(){

            }

            map1.add( Integer.parseInt(binaryString1) );
            map2.add( Integer.parseInt(binaryString2) );
        }

        for (Integer i : map2) System.out.println(i);

        return answer;
    }
}