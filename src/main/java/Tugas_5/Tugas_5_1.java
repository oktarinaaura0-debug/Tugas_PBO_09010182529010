import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas_5_1 {

    public static void main(String[] args) {

        BufferedReader dataIn =
                new BufferedReader(new InputStreamReader(System.in));

        String word1 = "";
        String word2 = "";
        String word3 = "";

        System.out.print("Enter word1: ");
        try {
            word1 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.print("Enter word2: ");
        try {
            word2 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.print("Enter word3: ");
        try {
            word3 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }

        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
