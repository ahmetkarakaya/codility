public class PermMissingElem {

    public static int solution(int[] A) {

        int nExpected = A.length + 1;
        long totalExpected = nExpected * (nExpected + 1L) / 2;

        long total = 0L;
        for (int item : A) {
            total += item;
        }
        return (int) (totalExpected - total);
    }

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        System.out.printf("solution:" + solution(A));
    }
}
