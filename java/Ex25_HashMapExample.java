import java.util.HashMap;
import java.util.Map;
class Ex25_HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> categories = new HashMap<>();
        categories.put("Music", 2);
        categories.put("Food", 1);
        categories.put("Sports", 1);

        for (Map.Entry<String, Integer> entry : categories.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

