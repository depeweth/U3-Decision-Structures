import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static int userAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] arge) {

        createProblem();
       getUserAnswer();
       checkAnswer();
    }

    public static void showResults(){
        JOptionPane.showMessageDialog(null, displayProblem);
    }

    public static void checkAnswer(){
        if(userAnswer == correctAnswer){
            displayProblem = "You are correct";
        }else{
            displayProblem = "Incorrect; Try again.";
            showResults();
        }

    }

    public static void getUserAnswer(){

        userAnswer = input(displayProblem);
    }

    public static void createProblem(){

        int choice = input("Choose: \nAddition(1), \nSubtraction(2), \nMultiplication(3), \nDivision(4)");

                if(choice <= 4){
                    if(choice >= 1){

                        if(choice == 1){
                            addProblem();
                        }

                        if(choice == 2){
                            subProblem();
                        }

                        if(choice == 3){
                            multiProblem();
                        }

                        if(choice == 4){
                            dividProblem();
                        }

                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
                        System.exit(0);
                    }



                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Input, run program again.");
                    System.exit(0);
                }


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

    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }






}
