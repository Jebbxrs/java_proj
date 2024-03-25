import java.util.Scanner;

public class CharacterCounterFileInput {
    public static void main(String[] args) {
        int charType, consCount = 0, vowelCount = 0, punctCount = 0, spaceCount = 0, charToInt;
        String input = new String(), tempInput = new String();
        Scanner scan = new Scanner(System.in);

        while (input != "\0"){
            input = scan.nextLine();

            for (int i = 0; i < input.length(); i++) {
                tempInput = input.toUpperCase();
                charToInt = tempInput.charAt(i);
                if (charToInt == 32) 
                    charType = 0; // space
                else if (charToInt >= 48 && charToInt <= 57) 
                    charType = 1; // number
                else if (charToInt == 65 || charToInt == 69 || charToInt == 73 || charToInt == 79 || charToInt == 85)
                    charType = 2; // vowel
                else if ((charToInt >= 33 && charToInt <= 47) || (charToInt >= 58 && charToInt <= 64) || (charToInt >= 91 && charToInt <= 96) || (charToInt >= 123 && charToInt <= 126))
                    charType = -1; // punctuation characters
                else 
                    charType = 3; // consonants

                switch (charType) {
                    case 0:
                        spaceCount++;
                        break;
                    case 1:
                        break;
                    case 2:
                        vowelCount++;
                        break;
                    case 3:
                        consCount++;
                        break;
                    case -1:
                        punctCount++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(input);
            System.out.println("Number of consonants: " + consCount);
            System.out.println("Number of vowels: " + vowelCount);
            System.out.println("Number of spaces: " + spaceCount);
            System.out.println("Number of punctuation characters: " + punctCount);
            System.out.println();
            consCount = 0; vowelCount = 0; punctCount = 0; spaceCount = 0;
        }
        scan.close();
    }
}
