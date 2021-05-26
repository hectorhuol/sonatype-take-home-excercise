package com.sonatype.exercise.converter.validator;

import com.sonatype.exercise.converter.InputValidator;

public class StringInputValidator implements InputValidator {
    @Override
    public int getIntValue(String number) {
        return Integer.valueOf(number.replace(",",""));
    }
}
