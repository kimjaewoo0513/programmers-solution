// package level1;

// import java.util.stream.Stream;

// public class Q005 {
// 	public boolean solution(int x) {
//         boolean answer;
        
//         int[] arrX = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
//         int sum = 0;
        
//         for (int i = 0; i < arrX.length; i++) {
// 			sum +=arrX[i];
// 		}
        
//         if(x % sum == 0) {
//         	answer = true;
//         }else {
// 			answer = false;
// 		}
        
//         return answer;
//     }
// }
