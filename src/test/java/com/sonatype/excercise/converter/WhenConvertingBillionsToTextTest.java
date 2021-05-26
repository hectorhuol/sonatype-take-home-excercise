package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Billions to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingBillionsToTextTest extends BaseTest {

    @Test
    public void Should_Convert_1000000000_To_Text(){
        String result = converter.convert("1000000000");
        Assertions.assertEquals("One billion", result);
    }

    @Test
    public void Should_Convert_1000000001_To_Text(){
        String result = converter.convert("1000000001");
        Assertions.assertEquals("One billion and one", result);
    }

    @Test
    public void Should_Convert_1000000010_To_Text(){
        String result = converter.convert("1000000010");
        Assertions.assertEquals("One billion and ten", result);
    }

    @Test
    public void Should_Convert_1000000200_To_Text(){
        String result = converter.convert("1000000200");
        Assertions.assertEquals("One billion two hundred", result);
    }

    @Test
    public void Should_Convert_1000005000_To_Text(){
        String result = converter.convert("1000005000");
        Assertions.assertEquals("One billion five thousand", result);
    }

    @Test
    public void Should_Convert_1000060000_To_Text(){
        String result = converter.convert("1000060000");
        Assertions.assertEquals("One billion sixty thousand", result);
    }

    @Test
    public void Should_Convert_1000700000_To_Text(){
        String result = converter.convert("1000700000");
        Assertions.assertEquals("One billion seven hundred thousand", result);
    }

    @Test
    public void Should_Convert_1001000000_To_Text(){
        String result = converter.convert("1001000000");
        Assertions.assertEquals("One billion one million", result);
    }

    @Test
    public void Should_Convert_1090000000_To_Text(){
        String result = converter.convert("1090000000");
        Assertions.assertEquals("One billion ninety million", result);
    }

    @Test
    public void Should_Convert_1100000000_To_Text(){
        String result = converter.convert("1100000000");
        Assertions.assertEquals("One billion one hundred million", result);
    }

    @Test
    public void Should_Convert_Negative_1145987633_To_Text(){
        String result = converter.convert("1145987633");
        Assertions.assertEquals("One billion one hundred forty five million nine hundred eighty seven thousand six hundred and thirty three", result);
    }

    @Test
    public void Should_Convert_MaxInt_To_Text(){
        String result = converter.convert(Integer.MAX_VALUE+"");
        Assertions.assertEquals("Two billion one hundred forty seven million four hundred eighty three thousand six hundred and forty seven", result);
    }

    @Test
    public void Should_Convert_MinInt_To_Text(){
        String result = converter.convert(-Integer.MAX_VALUE+"");
        Assertions.assertEquals("Negative two billion one hundred forty seven million four hundred eighty three thousand six hundred and forty seven", result);
    }

    @Test
    public void Should_Convert_Negative_2145987633_To_Text(){
        String result = converter.convert("-2145987633");
        Assertions.assertEquals("Negative two billion one hundred forty five million nine hundred eighty seven thousand six hundred and thirty three", result);
    }
}
