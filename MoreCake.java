import java.util.Scanner;

public class MoreCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number = scanner.nextLine().split(" ");
        int num[] = new int[number.length];
        for(int i = 0;i < number.length;i++) {
            num[i] = Integer.parseInt(number[i]);
        }

        int W = num[0];
        int H = num[1];
        if (W % 4 == 0 || H % 4 == 0){
            System.out.println((W*H)/2);
        }else if (W%2==0 && H%2==0){
            System.out.println(((W*H)/4+1)*2);
        }else {
            System.out.println((W*H)/2+1);
        }
    }
}
