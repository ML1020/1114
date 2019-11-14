import java.util.Scanner;

public class DeleteTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (scanner.hasNextInt()){
            length = scanner.nextInt();
            int[] index = new int[length];
            System.out.println(Deletenum(length,index));
        }
    }

    private static int Deletenum(int length, int[] index) {
        int i =0;
        int count = 0;
        int countDelete = 0;
        while (true){
            if (countDelete == length){
                return i -1;
            }
            if (i ==length){
                i=i%length;
            }
            if (index[i] != -1){
                count++;
            }
            if (count == 3){
                count=0;
                countDelete++;
                index[i%length] = -1;
            }
            i++;
        }
    }
}
