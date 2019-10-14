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

        ps.sign();          // executes Exercise 1
        ps.parity();        // executes Exercise 2
        ps.ordered();       // executes Exercise 3
        ps.gpa();           // executes Exercise 4
        ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10

        in.close();
    }

    /*
     * Exercise 1.
     *
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */

    public void sign() {
      System.out.print("\nEnter an Integer: ");
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
      System.out.print("\nEnter an Integer: ");
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
      System.out.println("\nEnter three integers.");

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
        final double A_GPA = 4.00;
        final double B_GPA = 3.00;
        final double C_GPA = 2.00;
        final double D_GPA = 1.00;
        final double F_GPA = 0.00;
        final double PLUS_GRADE = 0.33;
        final double MINUS_GRADE = -0.33;
        double baseGpa = 0;
        boolean validLetter = true;

        System.out.print("\nEnter a letter grade: ");
        in.nextLine();
        String letterGrade = in.nextLine();
        letterGrade = letterGrade.toUpperCase();
        char letter = (letterGrade.charAt(0));
        switch (letter) {
          case 'A':
            baseGpa = A_GPA;
            break;
          case 'B':
            baseGpa = B_GPA;
            break;
          case 'C':
            baseGpa = C_GPA;
            break;
          case 'D':
            baseGpa = D_GPA;
            break;
          case 'F':
            baseGpa = F_GPA;
            break;
          default:
            System.out.println("\nThat's not a valid letter grade.");
            validLetter = false;
            break;
        }

        //grade modifier
        if (validLetter) {
          if (letterGrade.length() == 2) {
            if ((letterGrade.charAt(1) == '+') && (letter != 'A' && letter != 'F')) {
              double modifier = PLUS_GRADE;
              double finalGPA = baseGpa + modifier;
              System.out.printf("\nYour GPA is %.2f.\n", finalGPA);
            } else if ((letterGrade.charAt(1) == '-') && (letter != 'F')) {
              double modifier = MINUS_GRADE;
              double finalGPA = baseGpa + modifier;
              System.out.printf("\nYour GPA is %.2f.\n", finalGPA);
            } else if(((letterGrade.charAt(1) == '+') ||(letterGrade.charAt(1) == '-')) && (letter == 'A')) {
            System.out.printf("\nYour GPA is %.2f.\n", baseGpa);
            } else{
            System.out.println("\nThat's not a valid letter grade.");
          }
        } else{
          System.out.printf("\nYour GPA is %.2f.\n", baseGpa);
        }
      }
    }

    /*
     * Exercise 5.
     *
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */

    public void grade() {
        final double A_MAXIMUM = 100;
        final double A_MINIMUM = 90;
        final double B_MAXIMUM = 89;
        final double B_MINIMUM = 80;
        final double C_MAXIMUM = 79;
        final double C_MINIMUM = 70;
        final double D_MAXIMUM = 69;
        final double D_MINIMUM = 60;
        final double F_MAXIMUM = 59;
        final double F_MINIMUM = 0;

        System.out.print("\nEnter a grade: ");
        double grade = in.nextDouble();

        if ((grade >= A_MINIMUM) && (grade <= A_MAXIMUM)) {
          System.out.println("\nYou recieved an A.");
        } else if ((grade >= B_MINIMUM) && (grade <= B_MAXIMUM)) {
          System.out.println("\nYou recieved a B.");
        } else if ((grade >= C_MINIMUM) && (grade <= C_MAXIMUM)) {
          System.out.println("\nYou recieved a C.");
        } else if ((grade >= D_MINIMUM) && (grade <= D_MAXIMUM)) {
          System.out.println("\nYou recieved a D.");
        } else if ((grade >=F_MINIMUM) && (grade <=F_MAXIMUM)) {
          System.out.println("\nYou recieved an F.");
        } else if (grade < 0) {
           System.out.println("\nGrades below 0 are invalid.");
        } else if (grade > 100) {
           System.out.println("\nGrades above 100 are invalid.");
       } else {}
  }


    /*
     * Exercise 6.
     *
     * Prompt the user to enter a playing card. What card was entered?
     */

    public void cards() {
      boolean rankValid = true;
      boolean suitValid = true;
      System.out.print("\nEnter a card: ");
      in.nextLine();
      String card = in.nextLine();
      if (card.length() < 2) {
        System.out.println("\nThat's not a valid rank.");
      } else {
      card = card.toUpperCase();
      char rank = card.charAt(0);
      char suit = card.charAt(1);
      String rankNum = "";
      String suitValue = "";

      switch (rank) {
          case '2':
            rankNum = "Two";
            break;
          case '3':
            rankNum = "Three";
            break;
          case '4':
            rankNum = "Four";
            break;
          case '5':
            rankNum = "Five";
            break;
          case '6':
            rankNum = "Six";
            break;
          case '7':
            rankNum = "Seven";
            break;
          case '8':
            rankNum = "Eight";
            break;
          case '9':
            rankNum = "Nine";
            break;
          case 'T':
            rankNum = "Ten";
            break;
          case 'J':
            rankNum = "Jack";
            break;
          case 'Q':
            rankNum = "Queen";
            break;
          case 'K':
            rankNum = "King";
            break;
          case 'A':
            rankNum = "Ace";
            break;
          default:
            rankValid = false;
            break;
        }
        switch (suit) {
          case 'C':
            suitValue = "Clubs";
            break;
          case 'D':
            suitValue = "Diamonds";
            break;
          case 'H':
            suitValue = "Hearts";
            break;
          case 'S':
            suitValue = "Spades";
            break;
          default:
            suitValid = false;
          break;
        }
        if (suitValid && rankValid){
          System.out.println("\n" + rankNum + " of " + suitValue + ".");
        } else if(!(rankValid)) {
          System.out.println("\nThat's not a valid rank.");
        } else if (!(suitValid)){
          System.out.println("\nThat's not a valid suit.");
        } else {}
      }
    }

    /*
     * Exercise 7.
     *
     * Prompt the user to enter a year. Is it a leap year or not?
     */

    public void leapYear() {
      System.out.print("\nEnter a year: ");
      long year = in.nextLong();
      boolean isYearLeapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
      if (isYearLeapYear) {
        System.out.println("\n" + year + " is a leap year.");
      } else {
        System.out.println("\n" + year + " is not a leap year.");
      }
    }


    /*
     * Exercise 8.
     *
     * Prompt the user to enter a temp. At that temp, is water a solid,
     * liquid, or gas?
     */

    public void state() {
      final int F_BOILING = 212;
      final int F_FREEZING = 32;
      final int C_BOILING= 100;
      final int C_FREEZING = 0;

      System.out.print("\nEnter a temperature: ");
      int temp = in.nextInt();
      System.out.print("Enter a scale: ");
      String scale = in.next();
      scale = scale.toUpperCase();

      if (scale.equals("F")){
        if (temp >= F_BOILING) {
          System.out.println("\nGas.");
        } else if (temp < F_BOILING && temp > F_FREEZING) {
          System.out.println("\nLiquid.");
        } else if (temp <= F_FREEZING) {
          System.out.println("\nSolid.");
        }
      } else {
          if (temp >= C_BOILING) {
            System.out.println("\nGas.");
        } else if (temp < C_BOILING && temp > C_FREEZING) {
            System.out.println("\nLiquid.");
        } else if (temp <= C_FREEZING) {
            System.out.println("\nSolid.");
        }
      }
    }

    /*
     * Exercise 9.
     *
     * Prompt the user to enter a month. How many days are in that month?
     */

    public void months() {
      System.out.print("\nEnter a month: ");
      in.nextLine();
      String month = in.nextLine();
      month = month.toLowerCase();
      switch (month) {
        case "january":
        case "jan":
        case "janu":
          System.out.println("\n31 days.");
          break;
        case "february":
        case "feb":
        case "febr":
          System.out.println("\n28 or 29 days.");
          break;
        case "march":
        case "mar":
        case "marc":
          System.out.println("\n31 days.");
          break;
        case "april":
        case "apr":
        case "apri":
          System.out.println("\n30 days.");
          break;
        case "may":
          System.out.println("\n31 days.");
          break;
        case "june":
        case "jun":
          System.out.println("\n30 days.");
          break;
        case "july":
        case "jul":
          System.out.println("\n31 days.");
          break;
        case "august":
        case "aug":
        case "augu":
          System.out.println("\n31 days.");
          break;
        case "september":
        case "sep":
        case "sept":
          System.out.println("\n30 days.");
          break;
        case "october":
        case "oct":
        case "octo":
          System.out.println("\n31 days.");
          break;
        case "november":
        case "nov":
        case "nove":
          System.out.println("\n30 days.");
          break;
        case "december":
        case "dec":
        case "dece":
          System.out.println("\n31 days.");
          break;
        default:
          System.out.println("\nThat's not a valid month.");
          break;
  }
    }

    /*
     * Exercise 10.
     *
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */

    public void salary() {
      final double OT_THRESHOLD = 40;
      final double OT_PAY_MULTIPLIER = 1.5;
      double pay = 0.00;
      double overtimeHours = 0;
      double additionalPay = 0;
      System.out.print("\nWage: ");
      double wage = in.nextDouble();
      System.out.print("Hours: ");
      double hours = in.nextDouble();

      if (wage >= 0) {
        if (hours >= 0) {
          overtimeHours = hours - OT_THRESHOLD;
          if (overtimeHours > 0) {
              additionalPay = overtimeHours * wage *OT_PAY_MULTIPLIER;
              pay = additionalPay + (wage * OT_THRESHOLD);
              System.out.printf("\nYou'll make $%,.2f this week.\n\n", pay);
          } else{
              pay = wage * hours;
              System.out.printf("\nYou'll make $%,.2f hours this week.\n\n", pay);
          }
      } else {
          System.out.println("\nYour hours must be greater than or equal to 0.0.\n\n");
        }
   } else {
        System.out.println("\nYour wage must be greater than or equal to $0.00/hour.\n\n");
      }
  }
}
