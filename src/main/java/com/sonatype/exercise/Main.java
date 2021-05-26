package com.sonatype.exercise;

import com.sonatype.exercise.application.ConsoleApplication;
import com.sonatype.exercise.converter.InputValidator;
import com.sonatype.exercise.converter.NumberToTextConverter;
import com.sonatype.exercise.converter.OutputFormatter;
import com.sonatype.exercise.converter.formaters.FirstCapitalizedOutputFormatter;
import com.sonatype.exercise.converter.validator.StringInputValidator;

public class Main {
    public static void main(String[] args) {
        OutputFormatter formatter = new FirstCapitalizedOutputFormatter();
        InputValidator validator = new StringInputValidator();
        NumberToTextConverter converter = new NumberToTextConverter(formatter, validator);
        ConsoleApplication application = new ConsoleApplication(converter);
        application.start();
    }
}
