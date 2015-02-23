/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operatorpratice;

/**
 *
 * @author class
 */
public class OperatorPratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int testScore1 = 90;
    int testScore2 = 90;
    int testScore3 = 89;
    System.out.println("The score for test 1 is " + testScore1 + ".");
    System.out.println("The score for test 2 is " + testScore2 + ".");
    System.out.println("The score for test 3 is " + testScore3 + ".");
    double average;
    average = (testScore1 + testScore2 + testScore3)/3.0;
    System.out.println("The average test score is " + average + "." );
    }
    
}
