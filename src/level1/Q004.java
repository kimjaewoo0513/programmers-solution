// package level1;

// import java.util.Collections;

// public class Q004 {
// 	public String solution(String phone_number) {
//     	int translatedNumber = phone_number.substring(0, phone_number.length()-4).length();
//     	String last4Number = phone_number.substring(phone_number.length()-4, phone_number.length());
//     	String starts = String.join("", Collections.nCopies(translatedNumber, "*"));
    	
//         String answer = starts + last4Number;
//         return answer;
//     }
// }
