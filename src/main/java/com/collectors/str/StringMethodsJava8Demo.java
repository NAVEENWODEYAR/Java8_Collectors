package com.collectors.str;

/**
 * @author NaveenWodeyar
 *
 */

public class StringMethodsJava8Demo {
    public static void main(String[] args) {
        String str = "  Hello Java World!  ";

        // 1. length()
        System.out.println("1. Length: " + str.length());

        // 2. trim()
        System.out.println("2. Trimmed: '" + str.trim() + "'");

        // 3. toUpperCase() / toLowerCase()
        System.out.println("3. Uppercase: " + str.toUpperCase());
        System.out.println("4. Lowercase: " + str.toLowerCase());

        // 4. charAt()
        System.out.println("5. Character at index 6: " + str.charAt(6));

        // 5. indexOf() / lastIndexOf()
        System.out.println("6. Index of 'Java': " + str.indexOf("Java"));
        System.out.println("7. Last index of 'o': " + str.lastIndexOf("o"));

        // 6. substring()
        System.out.println("8. Substring from index 8: " + str.substring(8));
        System.out.println("9. Substring from 2 to 7: " + str.substring(2, 7));

        // 7. contains()
        System.out.println("10. Contains 'World': " + str.contains("World"));

        // 8. replace()
        System.out.println("11. Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 9. equals() / equalsIgnoreCase()
        System.out.println("12. Equals 'hello java world!': " + str.equals("hello java world!"));
        System.out.println("13. EqualsIgnoreCase '  HELLO JAVA WORLD!  ': " + str.equalsIgnoreCase("  HELLO JAVA WORLD!  "));

        // 10. startsWith() / endsWith()
        System.out.println("14. Starts with '  He': " + str.startsWith("  He"));
        System.out.println("15. Ends with 'ld!  ': " + str.endsWith("ld!  "));

        // 11. isEmpty()
        String emptyStr = "";
        System.out.println("16. isEmpty on '': " + emptyStr.isEmpty());

        // 12. Manual isBlank() equivalent
        String blankStr = "   ";
        System.out.println("17. Manual isBlank: " + (blankStr.trim().isEmpty()));

        // 13. split()
        String[] words = str.trim().split(" ");
        System.out.print("18. Split words: ");
        for (String word : words) {
            System.out.print("'" + word + "' ");
        }
        System.out.println();

        // 14. join() (available since Java 8)
        String joined = String.join("-", "Java", "is", "fun");
        System.out.println("19. Joined string: " + joined);

        // 15. matches() (regex)
        System.out.println("20. Matches regex '.*Java.*': " + str.matches(".*Java.*"));
    }
}
