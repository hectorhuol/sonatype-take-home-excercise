package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Billions to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingNegativeNumbersToTextTest extends BaseTest {
    @Test
    public void Should_Convert_Negative_1_To_Text(){
        String result = converter.convert("-1");
        Assertions.assertEquals("Negative one", result);
    }

    @Test
    public void Should_Convert_Negative_15_To_Text(){
        String result = converter.convert("-15");
        Assertions.assertEquals("Negative fifteen", result);
    }

    @Test
    public void Should_Convert_Negative_73_To_Text(){
        String result = converter.convert("-73");
        Assertions.assertEquals("Negative seventy three", result);
    }

    @Test
    public void Should_Convert_Negative_80_To_Text(){
        String result = converter.convert("-80");
        Assertions.assertEquals("Negative eighty", result);
    }

    @Test
    public void Should_Convert_Negative_99_To_Text(){
        String result = converter.convert("-99");
        Assertions.assertEquals("Negative ninety nine", result);
    }

    @Test
    public void Should_Convert_Negative_700_To_Text(){
        String result = converter.convert("-700");
        Assertions.assertEquals("Negative seven hundred", result);
    }

    @Test
    public void Should_Convert_Negative_750_To_Text(){
        String result = converter.convert("-750");
        Assertions.assertEquals("Negative seven hundred and fifty", result);
    }

    @Test
    public void Should_Convert_Negative_728_To_Text(){
        String result = converter.convert("-728");
        Assertions.assertEquals("Negative seven hundred and twenty eight", result);
    }

    @Test
    public void Should_Convert_Negative_999_To_Text(){
        String result = converter.convert("-999");
        Assertions.assertEquals("Negative nine hundred and ninety nine", result);
    }

    @Test
    public void Should_Convert_Negative_7563_To_Text(){
        String result = converter.convert("-7563");
        Assertions.assertEquals("Negative seven thousand five hundred and sixty three", result);
    }

    @Test
    public void Should_Convert_Negative_95631_To_Text(){
        String result = converter.convert("-95631");
        Assertions.assertEquals("Negative ninety five thousand six hundred and thirty one", result);
    }

    @Test
    public void Should_Convert_Negative_999999_To_Text(){
        String result = converter.convert("-999999");
        Assertions.assertEquals("Negative nine hundred ninety nine thousand nine hundred and ninety nine", result);
    }

    @Test
    public void Should_Convert_Negative_999999999_To_Text(){
        String result = converter.convert("-999999999");
        Assertions.assertEquals("Negative nine hundred ninety nine million nine hundred ninety nine thousand nine hundred and ninety nine", result);
    }

    @Test
    public void Should_Convert_Negative_1701000_To_Text(){
        String result = converter.convert("-1701000");
        Assertions.assertEquals("Negative one million seven hundred one thousand", result);
    }

    @Test
    public void Should_Convert_Negative_47862391_To_Text(){
        String result = converter.convert("-47862391");
        Assertions.assertEquals("Negative forty seven million eight hundred sixty two thousand three hundred and ninety one", result);
    }

    @Test
    public void Should_Convert_Negative_753852219_To_Text(){
        String result = converter.convert("-753852219");
        Assertions.assertEquals("Negative seven hundred fifty three million eight hundred fifty two thousand two hundred and nineteen", result);
    }

    @Test
    public void Should_Convert_Negative_2145987633_To_Text(){
        String result = converter.convert("-2145987633");
        Assertions.assertEquals("Negative two billion one hundred forty five million nine hundred eighty seven thousand six hundred and thirty three", result);
    }

    @Test
    public void Should_Convert_MinInt_To_Text(){
        String result = converter.convert(-Integer.MAX_VALUE+"");
        Assertions.assertEquals("Negative two billion one hundred forty seven million four hundred eighty three thousand six hundred and forty seven", result);
    }
}
