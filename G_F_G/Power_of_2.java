/*Input: n = 8
Output: true
Explanation: 8 is equal to 2 raised to 3 (23 = 8)*/

public class Power_of_2 {

        // Function to check if given number n is a power of two.
        public static boolean isPowerofTwo(int n) {
            // code here
            while(n>1 && n%2==0){
                n=n/2;
            }
            if (n==1){
                return true;
            }else{
                return false;
            }
        }
        public static void main(String args[]){
            int n=8;
            System.out.println(isPowerofTwo(n));

        }
    }


