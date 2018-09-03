import java.util.*;
import static java.util.stream.Collectors.*;

public class Task5 {

    /**
     * https://stepik.org/lesson/43245/step/1?adaptive=true&thread=solutions&unit=21309
     *
     * Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
     * <p>
     * Input data format
     * <p>
     * Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
     * <p>
     * Output data format
     * <p>
     * Output the resulting array. Separate numbers by a single space in the output.
     * <p>
     * Sample Input:
     * <p>
     * 3 4
     * 11 12 13 14
     * 21 22 23 24
     * 31 32 33 34
     * <p>
     * Sample Output:
     * <p>
     * 31 21 11
     * 32 22 12
     * 33 23 13
     * 34 24 14
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nm = sc.nextLine().split(" ");
        Integer n_rows = Integer.valueOf(nm[0]);
        Integer m_cols = Integer.valueOf(nm[1]);

        List<List<Integer>> matrix = new ArrayList<>();
        if (m_cols > 0)
            for (int i = 0; i < n_rows; i++) {
                matrix.add(Arrays.stream(sc.nextLine().split(" ")).map(Integer::valueOf).collect(toList()));
            }

        List<List<Integer>> rMatrix = new ArrayList<>(n_rows);

        for (int x = 0; x < m_cols; x++) {
            ArrayList<Integer> row = new ArrayList<>(n_rows);
            rMatrix.add(x, row);
            for (int y = 0; y < n_rows; y++) {
                row.add(y, matrix.get(n_rows - y - 1).get(x));
            }
        }

        for (List<Integer> row : rMatrix) {
            System.out.println(row.stream().map(Objects::toString).collect(joining(" ")));
        }

    }
}