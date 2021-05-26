package com.sonatype.excercise.converter;

import com.sonatype.exercise.converter.InputValidator;
import com.sonatype.exercise.converter.NumberToTextConverter;
import com.sonatype.exercise.converter.OutputFormatter;
import com.sonatype.exercise.converter.formaters.FirstCapitalizedOutputFormatter;
import com.sonatype.exercise.converter.validator.StringInputValidator;

public class BaseTest {
    protected OutputFormatter formatter;
    protected NumberToTextConverter converter;
    InputValidator validator;

    public BaseTest(){
        formatter = new FirstCapitalizedOutputFormatter();
        validator = new StringInputValidator();
        converter = new NumberToTextConverter(formatter, validator);
    }
}
