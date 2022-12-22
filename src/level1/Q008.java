// package level1;

// public class Q008 {
// 	public int[] solution(int n, int m) {
//         int[] answer = new int[2];
        
//         int min = (n < m) ? n : m;
//         int result = 0;
        
//         for (int i = 1; i <= min; i++) {
//         	if(n % i == 0 && m % i == 0) {
//         		result=i;
//         	}
// 		}
        
//         answer[0] = result;
//         answer[1] = n * m / result;
        
//         return answer;
//     }
// }
