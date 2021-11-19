import java.util.Random;

public class QuizGame {


    static int userAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] arge) {

    }

    public static void addProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 + number2;
        displayProblem = number1 + " + " + number2;

    }

    public static void subProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 - number2;
        displayProblem = number1 + " - " + number2;

    }

    public static void multiProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 * number2;
        displayProblem = number1 + " X " + number2;

    }

    public static void dividProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 / number2;
        displayProblem = number1 + " / " + number2;

    }

    //Helper Method
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(210) + 1;
    }







}
