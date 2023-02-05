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

        ArrayList<String> map1 = new ArrayList<>();
        ArrayList<String> map2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            map1.add( String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i]).toString())) );
            map2.add( String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr2[i]).toString())) );
        }

        // 두 배열을 2진수로 변환하여 list에 add 작업까지 완료

        for (String i : map1) System.out.println(i);
        for (String i : map2) System.out.println(i);

        return answer;
    }
}

/*

        String binaryString1 = Integer.toString(arr1[i],2);
        String binaryString2 = Integer.toString(arr2[i],2);
            
        if(binaryString1.length() < n){
            for (int index = 0; index < n - binaryString1.length() ; index++) 
                binaryString1 = "0" + binaryString1;
            map1.add( binaryString1 );
        }else{
            map1.add( binaryString1 );
        }

        if(binaryString2.length() < n){
            for (int index = 0; index < n - binaryString2.length() ; index++) 
                binaryString2 = "0" + binaryString2;
            map2.add( binaryString2 );
        }else{
            map2.add( binaryString2 );
        }


       이렇게 긴 식이 

        ===> 

        map1.add( String.format("%05d", Integer.parseInt(Integer.toBinaryString(arr1[i]).toString())) );

        로 정리 됨 

 */