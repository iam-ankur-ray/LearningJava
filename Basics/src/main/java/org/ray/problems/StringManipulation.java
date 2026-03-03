package org.ray.problems;

import java.util.stream.IntStream;

public class StringManipulation {


    public static void encodeViaStringBuilder(String input) {
        if (input == null || input.isEmpty());

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }
        sb.append(count).append(input.charAt(input.length() - 1));
        System.out.println(sb.toString());
    }


    public static String encodeViaStream(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        // Use IntStream to iterate over indices
        return IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(i))
                .reduce(new StringBuilder(),
                        (sb, ch) -> {
                            if (sb.length() == 0) {
                                // First character → start with count 1
                                sb.append(1).append(ch);
                            } else {
                                char lastChar = sb.charAt(sb.length() - 1);
                                if (lastChar == ch) {
                                    // Increment count of last run
                                    int countIndex = sb.length() - 2;
                                    int count = Character.getNumericValue(sb.charAt(countIndex));
                                    sb.replace(countIndex, countIndex + 1, String.valueOf(count + 1));
                                } else {
                                    // Start a new run
                                    sb.append(1).append(ch);
                                }
                            }
                            return sb;
                        },
                        (sb1, sb2) -> sb1.append(sb2))
                .toString();
    }


    public static void main(String[] args) {
        String input = "aabccddd";
        String encoded = encodeViaStream(input);
        System.out.println(encoded);
        encodeViaStringBuilder(input);
    }
}
