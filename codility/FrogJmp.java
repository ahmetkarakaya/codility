public class FrogJmp {

    public static int solution(int X, int Y, int D) {
        int distance = Y-X;
        if(distance % D ==0) return distance / D;
        return distance / D +1;
    }

    public static void main(String[] args) {
        System.out.printf("solution: "+solution(10,85,30));
    }
}
