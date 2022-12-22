// package level1;

// import java.util.Arrays;
// import java.util.stream.IntStream;
// import java.util.stream.Stream;

// public class Q012 {
// }
// /*
// for (int i = 0; i < arr.length / 2; i++) {
//     int temp = arr[i];
//     arr[i] = arr[arr.length - i - 1];
//     arr[arr.length - i - 1] = temp;
// }
// */


// class SSolution {
//     public long solution(long n) {
    	
//         long answer = 0;
        
//         int[] arr = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        
//         Arrays.sort(arr);
        
//         for (int i = 0; i < arr.length / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[arr.length - i - 1];
//             arr[arr.length - i - 1] = temp;
//         }
        
//         ;
        
//         answer = Long.parseLong( String.join("", IntStream.of(arr).mapToObj(String::valueOf).toArray(String[]::new)) );
//         return answer;
//     }
// }