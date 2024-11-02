public class FindPowerOfNumber {
    public static long Pow(int X, int N) {
        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return X;
        }

        long result = Pow(X, N / 2);
        long ans = result * result;

        if (N % 2 == 0) {
            return ans;
        } else {
            return ans * X;
        }}
        public static void main (String[]args){
            System.out.println( Pow(2,5));
        }
    }
