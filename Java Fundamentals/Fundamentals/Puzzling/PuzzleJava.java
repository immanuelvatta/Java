import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        Random roll = new Random();
        int maxRollNumber = 20;
        int minRollNumber = 1;
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            rolls.add(roll.nextInt(maxRollNumber - minRollNumber) + minRollNumber);
        }
        return rolls;
    }

    public String getRandomLetter() {
        Random randomLetter = new Random();
        int maxLetter = 26;
        int minLetter = 1;
        String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String randLetter = letters[randomLetter.nextInt(maxLetter - minLetter) + minLetter];

        return randLetter;
    }

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int length) {
        String[] passwords = new String[length];
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = generatePassword();
        }
        return passwords;
    }

}
