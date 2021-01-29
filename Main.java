package com.company;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PracticalTask1();
        PracticalTask2();
        PracticalTask3();
        PracticalTask4_1();
        PracticalTask5();
    }

    static void PracticalTask1() {

         System.out.println("Hello!");
        Scanner input = new Scanner(System.in);
        System.out.print("Please write first number: ");
        int num1 = input.nextInt();
        System.out.print("Please write second number: ");
        int num2 = input.nextInt();

        if(num1>num2) {
            System.out.println ("Largest number is " + num1);
        } else if (num1<num2) {
            System.out.println ("Larges number is " + num2);
        } else {
            System.out.println("Both variables are equal");
            }

        if(num1<num2){
            System.out.println ("Smalest number is " + num1);
        } else if (num1>num2) {
            System.out.println ("Smalest number is " + num2);
        } else {
            System.out.println("Both variables are equal");
        }

        if(num1==num2){
            System.out.println ("Both variables are equal");
        } else {
            System.out.println("Both variables are not equal");
        }

        if(num1 % 2==0) {
            System.out.println( num1 + " is even");
        } else {
            System.out.println( num1 + " is odd");
        }

        if(num2 % 2==0) {
            System.out.println( num2 + " is even");
        } else {
            System.out.println( num2 + " is odd");
        }

        if(num1 > 0)
        {
            System.out.println(num1+" is a positive number");
        } else if(num1 < 0)
        {
            System.out.println(num1+" is a negative number");
        } else {
            System.out.println(num1+" is neither positive nor negative");
        }

        if(num2 > 0)
        {
            System.out.println(num2+" is a positive number");
        } else if(num2 < 0)
        {
            System.out.println(num2+" is a negative number");
        } else {
            System.out.println(num2+" is neither positive nor negative");
        }

        if(num1<100)
        {
            System.out.println(num1 + " is less than 100"); // cipars zem 100
        } else {
            System.out.println(num1 + " is more than 100");
        }

        if(num2<100)
        {
            System.out.println(num2 + " is less than 100");
        } else {
            System.out.println(num2 + " is more than 100");
        }
    }

    static void PracticalTask2() {

        Scanner input = new Scanner(System.in); // it kā viss strādā
        System.out.print("What time it is: ");
        int clockHours = input.nextInt();

        if (clockHours <= 12  && clockHours > 0) {
            System.out.println("Good Morning Sunshine!");
        } else if (clockHours >= 13 && clockHours <= 19) {
            System.out.println("Good Afternoon. Work Hard!");
        } else if(clockHours >= 20 && clockHours <= 24){
            System.out.println("Good Evening. Get some rest!");
        } else {
        System.out.println("There are only 24h in a day! Try again!");
        }

    }

     static void PracticalTask3() {

        Scanner input = new Scanner(System.in); // izskatās ka strādā
        System.out.print("Please write the day: ");
        int day = input.nextInt();
        System.out.print("Please write the month: ");
        int month = input.nextInt();
        System.out.print("Please write the year: ");
        int year = input.nextInt();
        System.out.print("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD: ");
        int format = input.nextInt();

        if ((day <1 || day > 31) || (month < 0 || month > 13) || (year <= 0)) {
        System.out.println("Something went wrong. Please try again!");
        } else if (format==1) {
       System.out.println("Your date is " + year + "/" + month + "/" + day );
        } else if(format==2){
       System.out.println("Your date is "+ year + "." + month + "." + day);
        } else{
            System.out.println("Something went wrong. Please try again!");
        }
    }

    static void PracticalTask4_1() {


        Scanner input = new Scanner(System.in); // ieliekot "-" gadam, sistēma neizmet kļūdu
        System.out.print("Enter number of a month: ");
        int month = input.nextInt();


        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days is: 31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Number of days is: 30");
        } else if (month == 2 && year % 400 == 0 || year % 4 == 0) {
            System.out.println("Number of days is: 29");
        } else if (month == 2) {
            System.out.println("Number of days is: 28");
        } else if ((month < 1 || month > 12) || (year < 1)) {
            System.out.println("Something went wrong. Try again! ");
        }
    }



    static void PracticalTask5() { // Šis pat varētu būt pareizi

        Scanner input = new Scanner(System.in);
        System.out.print("Please write working hours in a day: ");
        int workingHoursInDay = input.nextInt();

        if (workingHoursInDay >= 1 && workingHoursInDay <=8 ) {
           workingHoursInDay = (workingHoursInDay*10);
            System.out.println("Your salary will be " + workingHoursInDay);
        } else if (workingHoursInDay >= 9) {
            workingHoursInDay = (80 + (workingHoursInDay-8)*15);
            System.out.println("Your salary will be " + workingHoursInDay);
        } else {
            System.out.println("It's not possible to work '-' hours!");
        }
    }
}


