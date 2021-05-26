package com.sonatype.exercise.application;

import com.sonatype.exercise.converter.NumberToTextConverter;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class ConsoleApplication {
    private final NumberToTextConverter converter;
    private final Scanner scanner;

    public ConsoleApplication(NumberToTextConverter converter){
        this.converter = converter;
        scanner = new Scanner(in);
    }

    public void start(){
        try {
            out.println("Please enter a number: ");
            String line = scanner.nextLine();
            String result = processLine(line);
            out.println("You enter number:");
            out.println("\t* "+line);
            out.println("Text Is:");
            out.println("\t* "+result);
        } catch (NumberFormatException ex){
            out.println(format("You need to enter a number between %s and %s",Integer.MIN_VALUE,Integer.MAX_VALUE));
            out.println("You can use any of the next formats: ");
            out.println("\t* DDDDDDDDDD");
            out.println("\t* D,DDD,DDD,DDD");
            out.println("Check some examples: ");
            out.println("\t* 5888");
            out.println("\t* 5,888");
            out.println("\t* 001");
            out.println("\t* 100");
            out.println("\t* 05,100");
        }
    }

    public String processLine(String line){
        return converter.convert(line);
    }
}
