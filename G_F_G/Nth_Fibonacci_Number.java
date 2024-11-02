public class Nth_Fibonacci_Number {

        static int nthFibonacci(int n) {
            // code here
            int ans;
            if (n<=1){
                return n;
            }
            else{
                ans=nthFibonacci(n-1)+nthFibonacci(n-2);
            }
            return ans;

        }
        public static void main (String args[]){
            int n=6;
            System.out.println(nthFibonacci(n));
        }
    }

