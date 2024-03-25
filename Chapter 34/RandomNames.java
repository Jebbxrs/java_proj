import java.util.Random;

public class RandomNames {
    public static void main(String[] args) {
        Random rand = new Random();
        int number, number2;
        String firstName = new String(), lastName = new String();

        number = rand.nextInt(11);
        switch (number) {
            case 0: firstName = "Albert"; break;
            case 1: firstName = "James"; break;
            case 2: firstName = "John"; break;
            case 3: firstName = "Alfred"; break;
            case 4: firstName = "Shinji"; break;
            case 5: firstName = "Zed"; break;
            case 6: firstName = "Adam"; break;
            case 7: firstName = "Brian"; break;
            case 8: firstName = "William"; break;
            case 9: firstName = "Alexander"; break;
            case 10: firstName = "Noah"; break;
            case 11: firstName = "Lucas"; break;
        }
        number2 = rand.nextInt(11);
        switch (number2) {
            case 0: lastName = "Sylvers"; break;
            case 1: lastName = "Lionheart"; break;
            case 2: lastName = "Brook"; break;
            case 3: lastName = "Stallone"; break;
            case 4: lastName = "Stark"; break;
            case 5: lastName = "Ashborn"; break;
            case 6: lastName = "De La Hoya"; break;
            case 7: lastName = "Crestfallen"; break;
            case 8: lastName = "Santiago"; break;
            case 9: lastName = "Takamura"; break;
            case 10: lastName = "Ducay"; break;
            case 11: lastName = "De Los Santos"; break;
        }
        System.out.println("Character Name: " + firstName + " " + lastName);
    }
}
