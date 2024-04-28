import java.util.*;

public class TestScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        final int SIZE = rand.nextInt(3,11);
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];

        System.out.printf("\nEnter your %d test scores below.\n", testScores.length);

        for(int test = 0; test < testScores.length; test++){
            System.out.printf("Enter test %d score: ", test + 1);
            testScores[test] = input.nextInt();
        }

        for(int i = 0; i < letterGrades.length; i++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }

        printGrades(testScores,letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }

    private static char getLetterGrade(int score){
        if(score > 90){return 'A';}
        if(score >= 80 && score <=89){return 'B';}
        if(score >= 70 && score <= 79){return 'C';}
        if(score >= 60 && score <= 69){return 'D';}
        return 'F';
    }

    private static void printGrades(int[] scores, char[] grades){
        System.out.println("\nScore:     Grade:");
        for (int i = 0; i < scores.length; i++){
            System.out.printf("%4d %9c\n", scores[i], grades[i]);
        }
        System.out.println();
    }

    private static void printHighestScore(int[] scores){
        int highestScore = scores[0];
        for(int score : scores){
            if(score > highestScore){
                highestScore = score;
            }
        }
        System.out.println("The highest score is " + highestScore);
    }

    private static void printLowestScore(int[] scores){
        int lowestScore = scores[0];
        for(int score : scores){
            if(score < lowestScore){
                lowestScore = score;
            }
        }
        System.out.println("The lowest score is " + lowestScore);
    }

    private static void printAverageScore(int[] scores){
        int sum = 0;
        for(int score : scores){
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("Average score is " + average);
    }

}
