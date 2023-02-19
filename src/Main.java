import java.util.Scanner;

public class Main{

    public static class calculateGCD {
        long r;

        calculateGCD(long a, long b){
            while (b > 0) {
                long temp = b;
                b = a % b;
                a = temp;
                r = a;
            }
        }
    }

    public static class Gcd{

        public static void main(String[] arg){

                calculateGCD result;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter how many numbers you want to calculate their GCD:");
                int n = sc.nextInt();
                long[] input = new long[n];
                System.out.println("Enter " + n + "  numbers");
                for (int i = 0; i < n; i++) {
                    input[i] = sc.nextLong();
                }
                result = new calculateGCD(input[0], input[1]);

                for (int i = 2; i < input.length; i++){
                    result = new calculateGCD(result.r, input[i]);
                }
                System.out.println("GCD of these " + n + " numbers is: " + result.r);
            }
        }
    }
