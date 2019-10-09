
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DosDArrayDS {

    private static int relojCont=0;
    private static int relojMayor = -63;
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        for (int y = 0; y < arr.length-2; y++) {
            for (int x = 0; x < arr.length-2 ; x++) {
                relojCont = arr[y][x] + arr[y][x+1] + arr[y][x+2]//sup
                        + arr[y+1][x+1]//media
                        + arr[y+2][x]+ arr[y+2][x+1]+ arr[y+2][x+2];//inf
                if (relojCont > relojMayor) {
                    relojMayor = relojCont;
                }
            }
        }
        System.out.println(relojMayor);
        return relojMayor;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\2DArray.txt"));

        int[][] arr = new int[6][6];
        

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
