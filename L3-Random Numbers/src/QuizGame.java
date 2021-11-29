import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static double userAnswer, correctAnswer;
    static String displayProblem = "";
    JPanel panel;
    JButton newProblem, checkAnswer;
    JTextField answerInput;
    JLabel showProblem;
    JRadioButton addition, subtraction, multiplication, division;

    public static void main(String[] arge) {

        new QuizGame();
       /* createProblem();
       getUserAnswer();
       checkAnswer();*/
    }

    public QuizGame(){

        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        addition = new JRadioButton("Addition");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("Multiplication");
        division = new JRadioButton("Division");

        addition.setBounds(100, 10, 200, 30);
        subtraction.setBounds(100, 40, 200, 30);
        multiplication.setBounds(100, 70, 200, 30);
        division.setBounds(100, 100, 200, 30);

        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        panel.setLayout(null);

        frame.add(panel);
        frame.setVisible(true);

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

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose: \nAddition(1), \nSubtraction(2), \nMultiplication(3), \nDivision(4)"));

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

        correctAnswer = (double)number1 / number2;
        correctAnswer =(Math.round(correctAnswer*100))/100.0;

        System.out.println(correctAnswer);
        displayProblem = number1 + " / " + number2;

    }

    //Helper Method
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(210) + 1;
    }

    public static double input(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }






}
