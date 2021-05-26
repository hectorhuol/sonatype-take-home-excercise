package com.sonatype.exercise.converter;

public class NumberToTextConverter {

    private static final String [] UNITS =  {
            "zero","one", "two", "three",
            "four", "five", "six","seven",
            "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String [] TENS =  {
            "","", "twenty", "thirty",
            "forty", "fifty", "sixty","seventy",
            "eighty", "ninety"
    };

    private static final String HUNDRED = " hundred ";

    private static final String THOUSAND = " thousand ";

    private static final String MILLION = " million ";

    private static final String BILLION = " billion ";

    public static final String BLANK_SPACE = " ";

    public static final String AND = "and ";

    public static final String NEGATIVE = "negative ";

    private final OutputFormatter formatter;

    private final InputValidator validator;

    public NumberToTextConverter(OutputFormatter formatter, InputValidator validator){
        this.formatter = formatter;
        this.validator = validator;
    }

    public String convert(String inputNumber) {
        int number = validator.getIntValue(inputNumber);
        String text = this.process(number, true);
        return formatter.format(text);
    }

    public String process(int number, boolean includeAnd){
        if(number < 0){
            return NEGATIVE + this.process(-number, true);
        }

        if(number < 20){
            return UNITS[number];
        }

        if(number < 100){
            return handleTens(number);
        }

        if(number < 1000){
            return handleHundreds(number,includeAnd);
        }

        if(number < 1000000){
            return handleThousands(number);
        }

        if(number < 1000000000){
            return handleMillions(number);
        }

        return handleBillions(number);
    }

    private String handleTens(int number) {
        StringBuilder result = new StringBuilder();
        int tens = number /10;
        int units = number %10;

        result.append(TENS[tens]);

        if(units > 0)
            result.append(BLANK_SPACE).append(UNITS[units]);

        return result.toString().trim();
    }

    private String handleHundreds(int number, boolean includeAnd) {
        StringBuilder result = new StringBuilder();
        int hundreds = number/100;
        int tens = number%100;

        result.append(UNITS[hundreds])
                .append(HUNDRED);

        if(tens > 0 && includeAnd)
            result.append(AND);

        if(tens > 0)
            result.append(this.process(tens,includeAnd));

        return result.toString().trim();
    }

    private String handleThousands(int number) {
        StringBuilder result = new StringBuilder();
        int thousands = number/1000;
        int hundreds = number%1000;

        result.append(this.process(thousands,false))
                .append(THOUSAND);

        if(hundreds > 0 && hundreds < 100)
            result.append(AND);

        if(hundreds > 0)
            result.append(this.process(hundreds, true));

        return result.toString().trim();
    }

    private String handleMillions(int number) {
        StringBuilder result = new StringBuilder();
        int millions = number/1000000;
        int thousands = number%1000000;

        result.append(this.process(millions, false))
                .append(MILLION);

        if(thousands > 0 && thousands < 100)
            result.append(AND);

        if(thousands > 0)
            result.append(this.process(thousands, true));

        return result.toString().trim();
    }

    private String handleBillions(int number) {
        StringBuilder result = new StringBuilder();
        int billions = number/1000000000;
        int millions = number%1000000000;

        result.append(this.process(billions, false))
                .append(BILLION);

        if(millions > 0 && millions < 100)
            result.append(AND);

        if(millions > 0)
            result.append(this.process(millions, true));

        return result.toString().trim();
    }
}
