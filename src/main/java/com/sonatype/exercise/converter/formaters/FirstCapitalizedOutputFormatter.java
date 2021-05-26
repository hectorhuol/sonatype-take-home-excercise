package com.sonatype.exercise.converter.formaters;

import com.sonatype.exercise.converter.OutputFormatter;

public class FirstCapitalizedOutputFormatter implements OutputFormatter {
    @Override
    public String format(String text){
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase().trim();
    }
}
