/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of month: ");
        int month = sc.nextInt();
        String result;
        switch (month) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "Febuary";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "error";
                break;
        }
        if (month > 0 && month <= 12)
            System.out.print("The name of month is " + result);
        else
            System.out.print(result + " :please enter correct month number");
    }
}