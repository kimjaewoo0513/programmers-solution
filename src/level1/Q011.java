// package level1;

// public class Q011 {
// 	public static void main(String[] args) {
// 		Q011solution s = new Q011solution();
		
// 		System.out.println(s.solution(3));
	
// 	}
// }

// /*
// 	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// 	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
//  */

// class Q011solution {
//     public long solution(long n) {
//         long answer = 0;
//         if(Math.sqrt(n) % 1 == 0) {
//         	//정수일때
//         	answer = (long) Math.pow(Math.sqrt(n) + 1, 2);
//         }else {
//         	answer = -1;
// 		}
//         return answer;
//     }
// }

