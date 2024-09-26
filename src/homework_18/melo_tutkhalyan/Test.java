package homework_18.melo_tutkhalyan;

public class Test {
    public static void main(String[] args) {
        GenericMap<Integer, String> genericMap = new GenericMap<>();
        Integer l = 0;
        for (int i = 0; i < 20; i++) {
            genericMap.put(l++,l + "");

        }

         System.out.println(genericMap.containsKey(5));
        System.out.println(genericMap.containsValue("9"));
    }
}
