package ChapterSix;

public class ReverseDigits {
    public static void main(String[] args) {
        String digit=" 4561";
        reverseDigit(digit);
    }
    public static void reverseDigit(String digit){
        for (int count = digit.length()-1; count >=0 ; count--) {
            System.out.printf("%c",digit.charAt(count));
            
        }
        
    }
}
