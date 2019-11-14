import java.util.Scanner;

public class MinMultipication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split(" ");
        int[] num = new int[number.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(number[i]);
        }
        int m = num[0];
        int n = num[1];

        if (m % n == 0 || n % m == 0) {
            if (m > n) {
                int max = m;
                int min = n;
                System.out.println(max);
            }
            if (n > m) {
                int max = n;
                int min = m;
                System.out.println(max);
            }
        }else if(m%n!=0 || n%m!=0){
            if(m%2==0 && n%2==0){
                System.out.println(m * n/2);
            }else if(m%3==0 && n%3==0){
                System.out.println(m * n/3);
            }
            else{
                System.out.println(m * n);
            }
        }
    }
}