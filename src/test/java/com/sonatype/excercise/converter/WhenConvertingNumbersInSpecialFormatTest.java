package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Numbers in special formats to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingNumbersInSpecialFormatTest extends BaseTest {

    @Test
    public void Should_Handle_All_Zero_Characters_To_Text(){
        String result = converter.convert("000");
        Assertions.assertEquals("Zero", result);
    }

    @Test
    public void Should_Handle_Left_Zero_Padding_To_Text(){
        String result = converter.convert("010");
        Assertions.assertEquals("Ten", result);
    }

    @Test
    public void Should_Convert_4567090_To_Text(){
        String result = converter.convert("4,567,090");
        Assertions.assertEquals("Four million five hundred sixty seven thousand and ninety", result);
    }

    @Test
    public void Should_Convert_67000_To_Text(){
        String result = converter.convert("67,000");
        Assertions.assertEquals("Sixty seven thousand", result);
    }

    @Test
    public void Should_Convert_92000031_To_Text(){
        String result = converter.convert("92,000,031");
        Assertions.assertEquals("Ninety two million and thirty one", result);
    }

    @Test
    public void Should_Convert_92003031_To_Text(){
        String result = converter.convert("92,003,031");
        Assertions.assertEquals("Ninety two million three thousand and thirty one", result);
    }

    @Test
    public void Should_Convert_92033031_To_Text(){
        String result = converter.convert("92,033,031");
        Assertions.assertEquals("Ninety two million thirty three thousand and thirty one", result);
    }

    @Test
    public void Should_Convert_92100031_To_Text(){
        String result = converter.convert("92,100,031");
        Assertions.assertEquals("Ninety two million one hundred thousand and thirty one", result);
    }

    @Test
    public void Should_Convert_92100100_To_Text(){
        String result = converter.convert("92,100,100");
        Assertions.assertEquals("Ninety two million one hundred thousand one hundred", result);
    }

    @Test
    public void Should_Convert_2147483647_To_Text(){
        String result = converter.convert("2,147,483,647");
        Assertions.assertEquals("Two billion one hundred forty seven million four hundred eighty three thousand six hundred and forty seven", result);
    }

    @Test
    public void Should_Negative_Convert_2147483647_To_Text(){
        String result = converter.convert("-2,147,483,647");
        Assertions.assertEquals("Negative two billion one hundred forty seven million four hundred eighty three thousand six hundred and forty seven", result);
    }
}
