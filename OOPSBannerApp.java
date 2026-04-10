import java.util.*;

public class OOPSBannerApp {

    // Inner class
    static class CharacterPattern {
        char ch;
        String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " *** "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " *** ",
                "*     *",
                "*     *",
                " *** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " *** ",
                "*      ",
                "*      ",
                " *** ",
                "      *",
                "      *",
                " *** "
        }));

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char c : word.toCharArray()) {
                System.out.print(map.get(c).getPattern()[i] + "   ");
            }
            System.out.println();
        }
    }
}