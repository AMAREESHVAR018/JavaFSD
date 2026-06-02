class Ex30_PatternMatchingSwitchDemo {
    public static void main(String[] args) {
        Object value = "Community Learning Portal";

        String message;
        if (value == null) {
            message = "Value is null";
        } else if (value instanceof Integer) {
            Integer number = (Integer) value;
            message = "Integer value: " + number;
        } else if (value instanceof String) {
            String text = (String) value;
            message = "String with length " + text.length();
        } else {
            message = "Unknown type";
        }

        System.out.println(message);
    }
}

