package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Millions to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingMillionsToTextTest extends BaseTest  {

    @Test
    public void Should_Convert_1000000_To_Text(){
        String result = converter.convert("1000000");
        Assertions.assertEquals("One million", result);
    }

    @Test
    public void Should_Convert_1000001_To_Text(){
        String result = converter.convert("1000001");
        Assertions.assertEquals("One million and one", result);
    }

    @Test
    public void Should_Convert_1000010_To_Text(){
        String result = converter.convert("1000010");
        Assertions.assertEquals("One million and ten", result);
    }

    @Test
    public void Should_Convert_1000200_To_Text(){
        String result = converter.convert("1000200");
        Assertions.assertEquals("One million two hundred", result);
    }

    @Test
    public void Should_Convert_1005000_To_Text(){
        String result = converter.convert("1005000");
        Assertions.assertEquals("One million five thousand", result);
    }

    @Test
    public void Should_Convert_1060000_To_Text(){
        String result = converter.convert("1060000");
        Assertions.assertEquals("One million sixty thousand", result);
    }

    @Test
    public void Should_Convert_1700000_To_Text(){
        String result = converter.convert("1700000");
        Assertions.assertEquals("One million seven hundred thousand", result);
    }

    @Test
    public void Should_Convert_27802005_To_Text(){
        String result = converter.convert("27802005");
        Assertions.assertEquals("Twenty seven million eight hundred two thousand and five", result);
    }

    @Test
    public void Should_Convert_753852219_To_Text(){
        String result = converter.convert("753852219");
        Assertions.assertEquals("Seven hundred fifty three million eight hundred fifty two thousand two hundred and nineteen", result);
    }

    @Test
    public void Should_Convert_999999999_To_Text(){
        String result = converter.convert("999999999");
        Assertions.assertEquals("Nine hundred ninety nine million nine hundred ninety nine thousand nine hundred and ninety nine", result);
    }
}
