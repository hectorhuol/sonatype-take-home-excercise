package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Thousands to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingThousandsToTextTest extends BaseTest {

    @Test
    public void Should_Convert_1000_To_Text(){
        String result = converter.convert("1000");
        Assertions.assertEquals("One thousand", result);
    }

    @Test
    public void Should_Convert_1007_To_Text(){
        String result = converter.convert("1007");
        Assertions.assertEquals("One thousand and seven", result);
    }

    @Test
    public void Should_Convert_2017_To_Text(){
        String result = converter.convert("2017");
        Assertions.assertEquals("Two thousand and seventeen", result);
    }

    @Test
    public void Should_Convert_2021_To_Text(){
        String result = converter.convert("2021");
        Assertions.assertEquals("Two thousand and twenty one", result);
    }

    @Test
    public void Should_Convert_5500_To_Text(){
        String result = converter.convert("5500");
        Assertions.assertEquals("Five thousand five hundred", result);
    }

    @Test
    public void Should_Convert_6833_To_Text(){
        String result = converter.convert("6833");
        Assertions.assertEquals("Six thousand eight hundred and thirty three", result);
    }

    @Test
    public void Should_Convert_18704_To_Text(){
        String result = converter.convert("18704");
        Assertions.assertEquals("Eighteen thousand seven hundred and four", result);
    }

    @Test
    public void Should_Convert_11000_To_Text(){
        String result = converter.convert("11000");
        Assertions.assertEquals("Eleven thousand", result);
    }

    @Test
    public void Should_Convert_11005_To_Text(){
        String result = converter.convert("11005");
        Assertions.assertEquals("Eleven thousand and five", result);
    }

    @Test
    public void Should_Convert_400000_To_Text(){
        String result = converter.convert("400000");
        Assertions.assertEquals("Four hundred thousand", result);
    }

    @Test
    public void Should_Convert_405000_To_Text(){
        String result = converter.convert("405000");
        Assertions.assertEquals("Four hundred five thousand", result);
    }

    @Test
    public void Should_Convert_445800_To_Text(){
        String result = converter.convert("445800");
        Assertions.assertEquals("Four hundred forty five thousand eight hundred", result);
    }

    @Test
    public void Should_Convert_445802_To_Text(){
        String result = converter.convert("445802");
        Assertions.assertEquals("Four hundred forty five thousand eight hundred and two", result);
    }

    @Test
    public void Should_Convert_445872_To_Text(){
        String result = converter.convert("445872");
        Assertions.assertEquals("Four hundred forty five thousand eight hundred and seventy two", result);
    }

    @Test
    public void Should_Convert_999999_To_Text(){
        String result = converter.convert("999999");
        Assertions.assertEquals("Nine hundred ninety nine thousand nine hundred and ninety nine", result);
    }
}
