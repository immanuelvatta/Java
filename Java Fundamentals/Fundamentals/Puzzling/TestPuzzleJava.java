import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Random;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        System.out.println("----Get ten rolls----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("----Get a random letter----");
        String randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);
        System.out.println("----Generate a password----");
        String password = generator.generatePassword();
        System.out.println(password);

        System.out.println("------Generate a password set----");
        String[] newPasswordSet = generator.getNewPasswordSet(5);
        System.out.println(Arrays.toString(newPasswordSet));
    }
}
