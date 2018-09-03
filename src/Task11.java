import common.SevenFunction;

public class Task11 {

    /**
     * https://stepik.org/lesson/42581/step/1?adaptive=true&unit=24640
     *
     * <p>
     * Write a lambda expression that accepts seven (!) string arguments and returns a string in upper case concatenated from all of them (in the order of arguments).
     * <p>
     * Note. The correct solution may not work in your local environment because you don't have suitable functional interface. The testing system has the interface and can test your solution.
     * <p>
     * Solution format. Submit your lambda expression with seven arguments in any valid format with ; on the end.
     * <p>
     * Examples (only with two args): (x, y)  -> x + y; (x, y) -> { return x + y; };
     * <p>
     * Sample Input:
     * <p>
     * The lambda has too many string arguments.
     * Sample Output:
     * <p>
     * THELAMBDAHASTOOMANYSTRINGARGUMENTS.
     */
    public static void main(String[] args) {
        SevenFunction<String, String, String, String, String, String, String, String> f7
                = (t1, t2, t3, t4, t5, t6, t7) -> String.join("", t1, t2, t3, t4, t5, t6, t7).toUpperCase();
        System.out.println(f7.apply("a1", "b2", "a3", "a4", "a5", "a6", "a7"));
    }

}


