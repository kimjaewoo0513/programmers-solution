// package level1;

// public class Q007 {
// 	public int solution(int num) {
//     	if(num == 1) {
//     		return 0;
//     	}else {
//     		int counter = 0;
//             counter = func(num, counter);
//             return counter;
//     	}
        
//     }
    
//     public static int func(long num, int counter) {
//     	if(counter <= 500) {
//     		if(num != 1) {
//         		if(num % 2 == 0) {
//         			num = num / 2;
//         			counter++;
//         		}
//         		else if(num % 2 == 1) {
//         			num = (num *3) + 1;
//         			counter++;
//         		}
//         		return func(num, counter);
//         	}else {
//         		return counter;
//         	}
//     	}else {
// 			return -1;
// 		}
    	
//     }
// }
