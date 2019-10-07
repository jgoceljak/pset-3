/**
 * Problem Set 3.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet3 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();

        // comment out or uncomment as needed

        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        // ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        // ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("Enter an Integer: ");
      long numSign = in.nextLong();

      if (numSign == 0) {
        System.out.println("\nZero.");
      } else if (numSign > 0) {
        System.out.println("\nPositive.");
      } else {
        System.out.println("\nNegative.");
      }
    }

    /*
     * Exercise 2.
     *
     * Prompt the user to enter an integer. Is it even or odd?
     */

    public void parity() {
      System.out.print("Enter an Integer: ");
      long numParity = in.nextLong();;

      long parity = numParity % 2;

      if (parity == 0){
        System.out.println("\nEven.");
      } else {
        System.out.println("\nOdd.");
      }
    }

    /*
     * Exercise 3.
     *
     * Prompt the user to enter three integers. How are the integers ordered?
     */

    public void ordered() {
      System.out.println("Enter three integers.");

      System.out.print("\nEnter Integer: ");
      long order1 = in.nextLong();
      System.out.print("Enter Integer: ");
      long order2 = in.nextLong();
      System.out.print("Enter Integer: ");
      long order3 = in.nextLong();

      if (order1 < order2 && order2 < order3){
        System.out.println("\nStrictly Increasing.");
      } else if (order1 > order2 && order2 > order3){
        System.out.println("\nStrictly Decreasing.");
      } else if (order1 == order2 && order2 == order3){
        System.out.println("\nSame.");
      } else if (order1 <= order2 && order2 <= order3){
        System.out.println("\nIncreasing.");
      } else if (order1 >= order2 && order2 >= order3){
        System.out.println("\nDecreasing.");
      } else {
        System.out.println("\nUnordered.");
      }
    }

    /*
     * Exercise 4.
     *
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */

    public void gpa() {

    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {

    }

    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {

    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {

    }

    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */

    public void state() {

    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {

    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {

    }
}
