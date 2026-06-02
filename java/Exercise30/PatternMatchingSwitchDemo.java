public class PatternMatchingSwitchDemo {
    public static void main(String[] args) {
        Object value = "Community Learning Portal";

        String message = switch (value) {
            case Integer number -> "Integer value: " + number;
            case String text -> "String with length " + text.length();
            case null -> "Value is null";
            default -> "Unknown type";
        };

        System.out.println(message);
    }
}