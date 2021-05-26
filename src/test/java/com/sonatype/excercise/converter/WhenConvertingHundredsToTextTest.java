package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Hundreds to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingHundredsToTextTest extends BaseTest {

    @Test
    public void Should_Convert_100_To_Text(){
        String result = converter.convert("100");
        Assertions.assertEquals("One hundred", result);
    }

    @Test
    public void Should_Convert_140_To_Text(){
        String result = converter.convert("140");
        Assertions.assertEquals("One hundred and forty", result);
    }

    @Test
    public void Should_Convert_173_To_Text(){
        String result = converter.convert("173");
        Assertions.assertEquals("One hundred and seventy three", result);
    }

    @Test
    public void Should_Convert_200_To_Text(){
        String result = converter.convert("200");
        Assertions.assertEquals("Two hundred", result);
    }

    @Test
    public void Should_Convert_210_To_Text(){
        String result = converter.convert("210");
        Assertions.assertEquals("Two hundred and ten", result);
    }

    @Test
    public void Should_Convert_291_To_Text(){
        String result = converter.convert("291");
        Assertions.assertEquals("Two hundred and ninety one", result);
    }

    @Test
    public void Should_Convert_999_To_Text(){
        String result = converter.convert("999");
        Assertions.assertEquals("Nine hundred and ninety nine", result);
    }
}
