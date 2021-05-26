package com.sonatype.exercise.application;

import com.sonatype.exercise.converter.NumberToTextConverter;

import java.util.Scanner;

public class ConsoleApplication {
    private NumberToTextConverter converter;
    private Scanner scanner;

    public ConsoleApplication(NumberToTextConverter converter){
        this.converter = converter;
        scanner = new Scanner(System.in);
    }

    public void start(){
        try {
            System.out.println("Please enter a number: ");
            String line = scanner.nextLine();
            String result = processLine(line);
            System.out.println(String.format("You enter number: \n\r\t*%s",line));
            System.out.println(String.format("Text Is: \n\r\t*%s",result));
        } catch (NumberFormatException ex){
            System.out.println(String.format("You need to enter a number between %s and %s",Integer.MIN_VALUE,Integer.MAX_VALUE));
            System.out.println("You can use any of the next formats: ");
            System.out.println("\t* DDDDDDDDDD");
            System.out.println("\t* D,DDD,DDD,DDD");
            System.out.println("Check some examples: ");
            System.out.println("\t* 5888");
            System.out.println("\t* 5,888");
            System.out.println("\t* 001");
            System.out.println("\t* 100");
            System.out.println("\t* 05,100");
        }
    }

    public String processLine(String line){
        return converter.convert(line);
    }
}
