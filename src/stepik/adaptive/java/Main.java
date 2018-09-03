package stepik.adaptive.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer d = Integer.valueOf(sc.nextLine());
        Set<String> dic = new HashSet<>();
        for (int i = 0; i < d; i++) {
            dic.add(sc.nextLine().toLowerCase());
        }

        Set<String> words = new HashSet<>();
        Integer l = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < l; i++) {
            String[] split = sc.nextLine().split("\\s");
            for (String word : split) {
                words.add(word.trim().toLowerCase());
            }
        }

        words.remove("");

        words.removeAll(dic);

        for (String erroneous : words) {
            System.out.println(erroneous);
        }
    }
}