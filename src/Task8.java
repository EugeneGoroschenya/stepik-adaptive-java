import java.util.Scanner;

public class Task8 {

    /**
     * https://stepik.org/lesson/43173/step/1?adaptive=true&unit=21237
     * <p>
     * Given a string. Find whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left. Output “yes” if the string is a palindrome and “no” otherwise.
     * <p>
     * Sample Input:
     * <p>
     * kayak
     * <p>
     * Sample Output:
     * <p>
     * yes
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }

}