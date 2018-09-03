import java.util.Arrays;
import java.util.stream.IntStream;

public class Task10 {

    /**
     * https://stepik.org/lesson/36158/step/1?adaptive=true&unit=24653
     *
     * <p>
     * You have two IntStream. The first stream contains even numbers and the second stream contains odd numbers. Create the third stream that contains numbers from both streams which is divisible by 3 and 5. After calling collect(Collectors.toList()) the stream should return sorted list (ascending) of these numbers. Two first suitable numbers in the sorted list must be skipped.
     * <p>
     * Important. You need return a prepared IntStream from a template method, not a list of integers. Pay attention to the method template. Do not change the signature of this method.
     * Sample Input 1:
     * <p>
     * 1 2 3 4
     * Sample Output 1:
     * <p>
     * []
     * Sample Input 2:
     * <p>
     * 30 75 60 90
     * Sample Output 2:
     * <p>
     * [75, 90]
     */
    public static void main(String[] args) {
        IntStream even = IntStream.of(0, 2, 4, 6, 8, 10, 12, 14, 30);
        IntStream odd = IntStream.of(15, 1, 3, 5, 7, 9, 11, 13, 15);

        System.out.println(Arrays.toString(createFilteringStream(even, odd).toArray()));
    }

    public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
        return IntStream.concat(evenStream, oddStream).filter(it -> it % 15 == 0).sorted().skip(2);
    }

}