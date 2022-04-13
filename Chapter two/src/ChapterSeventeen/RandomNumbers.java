package ChapterSeventeen;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom secureRandom= new SecureRandom();
        System.out.println(secureRandom.ints(100,1,25));
    }
}
