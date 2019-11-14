import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//输出n个数字里面最小的k个数。k为数组总最后一位数
public class NFindK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String[] number = scanner.nextLine().split(" ");
        int[] num = new int[number.length];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(number[i]);
        }
        int x = num[num.length-1];
        int[] num1 = new int[num.length-1];
        for (int i = 0; i < num.length-1; i++) {
            num1[i] = num[i];
        }
        Arrays.sort(num1);
        for (int j:num1){
            list.add(j);
        }
        String[] strings = new String[x];
        for (int m = 0;m < x;m++) {
            strings[m] = String.valueOf(list.get(m));
            System.out.print(strings[m]+" ");
        }
    }
}