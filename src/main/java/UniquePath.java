import java.util.stream.LongStream;

/**
 * https://leetcode.com/problems/unique-paths/
 */
public class UniquePath {

    /**
     * Combinatorics:
     * We need to make (m-1) moves vertically and (n-1) horizontally.
     * In String representation RRRRRRR{m-1 times}DDDDDDD{n-1 times}
     * R - 1 step right
     * D - 1 step down
     *
     *
     */
    public static int uniquePathsCombinatorics(int m, int n) {
        return (int) (factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1)));
    }

    public static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsCombinatorics(7, 3));
    }
}
