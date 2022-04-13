//package ChapterSeventeen;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class IntFunction {
//    public static void main(String[] args) {
//        Map<Integer, String> integerToStringMap=new HashMap<>();
//        integerToStringMap.put(10, "A");
//        integerToStringMap.put(11, "B");
//        integerToStringMap.put(12, "C");
//        integerToStringMap.put(13, "D");
//        integerToStringMap.put(14, "E");
//        integerToStringMap.put(15, "F");
//        IntFunction<String> mapToString=x -> integerToStringMap.getOrDefault(x,String.valueOf(x));
//        System.out.println(IntStream.rangeClosed(1,15))
//                .mapToObj(mapToString)
//                .collect(Collectors.joining("")));
//    }
//}
//xxc