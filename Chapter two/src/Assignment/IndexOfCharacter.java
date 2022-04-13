package Assignment;

import java.util.ArrayList;
import java.util.List;

public class IndexOfCharacter {
    public static void main(String[] args) {
        String state = "MiSSiSSippi";
        List<Integer> list = new ArrayList<Integer>();

        for(int count = 0; count < state.length(); count++){
            if(String.valueOf(state.charAt(count)).equalsIgnoreCase("S")){
                list.add(count);
            }
        }
        System.out.println(list);
    }
}
