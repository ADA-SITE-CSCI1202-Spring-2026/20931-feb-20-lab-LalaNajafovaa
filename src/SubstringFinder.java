package src;

import java.util.Scanner;

public class SubstringFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter substring: ");
        String sub = scanner.nextLine();

        System.out.println(findSubstring(mainString, sub));
    }

    public static int findSubstring(String string, String sub) {
        if (sub.length() > string.length()) {
            return -1;
        }

        for (int i = 0; i <= string.length() - sub.length(); i++) {
            int j = 0;
            while (j < sub.length() && string.charAt(i + j) == sub.charAt(j)) {
                j++;
            }
            if (j == sub.length()) {
                return i;
            }
        }
        return -1;
    }
}
