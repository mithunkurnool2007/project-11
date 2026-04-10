import java.util.*;

public class OOPSBannerApp {

    // Map to store character patterns
    static Map<Character, String[]> map = new HashMap<>();

    public static void main(String[] args) {

        // Add patterns to map
        map.put('O', new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        });

        map.put('P', new String[]{
                " *** ",
                "*     *",
                "*     *",
                " *** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
        });

        // Call function to print
        printBanner("OOPS");
    }

    // Function to print banner
    public static void printBanner(String word) {

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c)[i] + "  ");
            }
            System.out.println();
        }
    }
}