//public class Day12 {
import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{

    private int[] testScores;


    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }// Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public char calculate(){
        int sum = 0;
        char c = 'O';
        for (int i = 0; i < testScores.length; i++){
            sum += testScores[i];
        }
        if (sum/testScores.length < 40) c= 'T';
        else if (sum/testScores.length >= 40 && sum/testScores.length < 55) c= 'D';
        else if (sum/testScores.length >= 55 && sum/testScores.length < 70) c= 'P';
        else if (sum/testScores.length >= 70 && sum/testScores.length < 80) c= 'A';
        else if (sum/testScores.length >= 80 && sum/testScores.length < 90) c= 'E';
        else c = 'O';

        return c;
    }// Write your method here
}
}
