import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int resultado =0;
        int x = arr.size();
        int diagonalPrincipal=0;
        int diagonalSecundaria=0;
        
        for(int i=0;i< arr.size();i++){
            for(int j=0; j<arr.size();j++){
                   if(i == j){
                       diagonalPrincipal += arr.get(j).get(i);
                   }
                   if(j == (x-1)){
                       x--;
                       diagonalSecundaria += arr.get(j).get(i);
                   }
            }
        }
        if(diagonalPrincipal > diagonalSecundaria){
            resultado = diagonalPrincipal - diagonalSecundaria;
        }else{
            resultado = diagonalSecundaria - diagonalPrincipal;
        }
        
    return resultado;
    }

}

public class DiagonalDiference {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\DiferenceDiagonal.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

