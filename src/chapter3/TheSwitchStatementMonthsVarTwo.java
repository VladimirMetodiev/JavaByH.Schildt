package chapter3;

import java.util.Scanner;

public class TheSwitchStatementMonthsVarTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter some month:");
        int numberOfMonth = Integer.parseInt(input.nextLine());
        System.out.println("Enter some year:");
        int year = Integer.parseInt(input.nextLine());

        String month = getMonth(numberOfMonth);

        if(month.equals("Invalid month") | year <= 0){
            System.out.println("Error!");
            return;
        }

        int numberOfDays = getNumberOfDays(month, year);
        System.out.printf("The number of days in %s of %d is: %d", month, year, numberOfDays);
    }

    private static String getMonth(int numMonth){
        String month = "";

        switch (numMonth) {
            case 1: {
                month = "January";
                break;
            }
            case 2: {
                month = "February";
                break;
            }
            case 3: {
                month = "March";
                break;
            }
            case 4: {
                month = "April";
                break;
            }
            case 5: {
                month = "May";
                break;
            }
            case 6: {
                month = "June";
                break;
            }
            case 7: {
                month = "July";
                break;
            }
            case 8: {
                month = "August";
                break;
            }
            case 9: {
                month = "September";
                break;
            }
            case 10: {
                month = "October";
                break;
            }
            case 11: {
                month = "November";
                break;
            }
            case 12: {
                month = "December";
                break;
            }
            default: {
                month = "Invalid month";
                break;
            }
        }

        return month;
    }

    private static int getNumberOfDays(String month, int year){
        int numDays = 0;

        switch (month.toLowerCase()) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                numDays = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                numDays = 30;
                break;
            case "february":
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
        }

        return numDays;
    }
}



//Test

//Input
//2
//1992
//Output
//The number of days in February of 1992 is: 29
