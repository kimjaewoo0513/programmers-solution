package level1;

public class Q044 {
    public static void main(String[] args) {
        Solution s = new  Solution();
        int [] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(s.solution(numbers, hand));
    }
}

//[카카오 인턴] 키패드 누르기
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        Integer leftThumbsStartPosition = 10;
        Integer rightThumbsStartPosition = 12;

        // 다시 String 으로 바꾸기 

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("왼손 위치 ==== " + leftThumbsStartPosition);
            System.out.println("오른손 위치 ==== " + rightThumbsStartPosition);
            System.out.println("눌러야할 숫자 ==== " + numbers[i]);

            int leftThumbsMinuse = 0;
            int rightThumbsMinuse = 0;

            switch (numbers[i]) {
                case 1:
                case 4:
                case 7:
                    answer += "L";
                    leftThumbsStartPosition = numbers[i];
                    System.out.println("사용한 손 ==== " + "L");
                    break;
                case 3:
                case 6:
                case 9:
                    answer += "R";
                    rightThumbsStartPosition = numbers[i];
                    System.out.println("사용한 손 ==== " + "R");
                    break;
                case 2:
                case 5:
                case 8:
                case 0:

                    if(numbers[i] - leftThumbsStartPosition == 3){
                        leftThumbsMinuse = 1;
                        answer += "L";
                        leftThumbsStartPosition = numbers[i];
                        System.out.println("사용한 손 ==== " + "L");
                    }else if(numbers[i] - rightThumbsStartPosition == 3){
                        rightThumbsMinuse = 1;
                        answer += "R";
                        rightThumbsStartPosition = numbers[i];
                        System.out.println("사용한 손 ==== " + "R");
                    }else{

                    leftThumbsMinuse =  Math.abs( numbers[i] - leftThumbsStartPosition) ;
                    rightThumbsMinuse =  Math.abs( numbers[i] - rightThumbsStartPosition);

                    if(leftThumbsMinuse != rightThumbsMinuse){
                        boolean closerNumber = (leftThumbsMinuse < rightThumbsMinuse) ? true : false;
                        if( closerNumber ){
                            answer += "L";
                            leftThumbsStartPosition = numbers[i];
                            System.out.println("사용한 손 ==== " + "L");
                        }else{
                            answer += "R";
                            rightThumbsStartPosition = numbers[i];
                            System.out.println("사용한 손 ==== " + "R");

                        }
                    }else{
                        answer += hand.substring(0, 1).toUpperCase();
                        if(hand == "right"){
                            rightThumbsStartPosition = numbers[i];
                            System.out.println("사용한 손 ==== " + "R");
                        }else{
                            leftThumbsStartPosition = numbers[i];
                            System.out.println("사용한 손 ==== " + "L");
                        }

                    }
                }

                    break;
            }
        }

        return answer;
    }
}
