package random.generator;

import java.util.*;

public class RandomMovieGenerator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[3];

        System.out.println("Enter 3 choices: ");

        for (int i = 0; i <= 2; i++) {
            arr[i] = in.nextLine();
        }
        Random r = new Random();
        int randomMovie = r.nextInt(arr.length);
        System.out.println("Your random movie for the night is: " + arr[randomMovie]);
        
    }

}
