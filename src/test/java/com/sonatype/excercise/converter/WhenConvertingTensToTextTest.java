package com.sonatype.excercise.converter;

import org.junit.jupiter.api.*;

@DisplayName("When converting Tens to Text")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class WhenConvertingTensToTextTest extends BaseTest {

    @Test
    public void Should_Convert_0_To_Text(){
        String result = converter.convert("0");
        Assertions.assertEquals("Zero", result);
    }

    @Test
    public void Should_Convert_1_To_Text(){
        String result = converter.convert("1");
        Assertions.assertEquals("One", result);
    }

    @Test
    public void Should_Convert_2_To_Text(){
        String result = converter.convert("2");
        Assertions.assertEquals("Two", result);
    }

    @Test
    public void Should_Convert_3_To_Text(){
        String result = converter.convert("3");
        Assertions.assertEquals("Three", result);
    }

    @Test
    public void Should_Convert_4_To_Text(){
        String result = converter.convert("4");
        Assertions.assertEquals("Four", result);
    }

    @Test
    public void Should_Convert_5_To_Text(){
        String result = converter.convert("5");
        Assertions.assertEquals("Five", result);
    }

    @Test
    public void Should_Convert_6_To_Text(){
        String result = converter.convert("6");
        Assertions.assertEquals("Six", result);
    }

    @Test
    public void Should_Convert_7_To_Text(){
        String result = converter.convert("7");
        Assertions.assertEquals("Seven", result);
    }

    @Test
    public void Should_Convert_8_To_Text(){
        String result = converter.convert("8");
        Assertions.assertEquals("Eight", result);
    }

    @Test
    public void Should_Convert_9_To_Text(){
        String result = converter.convert("9");
        Assertions.assertEquals("Nine", result);
    }

    @Test
    public void Should_Convert_10_To_Text(){
        String result = converter.convert("10");
        Assertions.assertEquals("Ten", result);
    }

    @Test
    public void Should_Convert_11_To_Text(){
        String result = converter.convert("11");
        Assertions.assertEquals("Eleven", result);
    }

    @Test
    public void Should_Convert_12_To_Text(){
        String result = converter.convert("12");
        Assertions.assertEquals("Twelve", result);
    }

    @Test
    public void Should_Convert_13_To_Text(){
        String result = converter.convert("13");
        Assertions.assertEquals("Thirteen", result);
    }

    @Test
    public void Should_Convert_14_To_Text(){
        String result = converter.convert("14");
        Assertions.assertEquals("Fourteen", result);
    }

    @Test
    public void Should_Convert_15_To_Text(){
        String result = converter.convert("15");
        Assertions.assertEquals("Fifteen", result);
    }

    @Test
    public void Should_Convert_16_To_Text(){
        String result = converter.convert("16");
        Assertions.assertEquals("Sixteen", result);
    }

    @Test
    public void Should_Convert_17_To_Text(){
        String result = converter.convert("17");
        Assertions.assertEquals("Seventeen", result);
    }

    @Test
    public void Should_Convert_18_To_Text(){
        String result = converter.convert("18");
        Assertions.assertEquals("Eighteen", result);
    }

    @Test
    public void Should_Convert_19_To_Text(){
        String result = converter.convert("19");
        Assertions.assertEquals("Nineteen", result);
    }

    @Test
    public void Should_Convert_20_To_Text(){
        String result = converter.convert("20");
        Assertions.assertEquals("Twenty", result);
    }

    @Test
    public void Should_Convert_30_To_Text(){
        String result = converter.convert("30");
        Assertions.assertEquals("Thirty", result);
    }

    @Test
    public void Should_Convert_40_To_Text(){
        String result = converter.convert("40");
        Assertions.assertEquals("Forty", result);
    }

    @Test
    public void Should_Convert_50_To_Text(){
        String result = converter.convert("50");
        Assertions.assertEquals("Fifty", result);
    }

    @Test
    public void Should_Convert_60_To_Text(){
        String result = converter.convert("60");
        Assertions.assertEquals("Sixty", result);
    }

    @Test
    public void Should_Convert_70_To_Text(){
        String result = converter.convert("70");
        Assertions.assertEquals("Seventy", result);
    }

    @Test
    public void Should_Convert_80_To_Text(){
        String result = converter.convert("80");
        Assertions.assertEquals("Eighty", result);
    }

    @Test
    public void Should_Convert_90_To_Text(){
        String result = converter.convert("90");
        Assertions.assertEquals("Ninety", result);
    }

    @Test
    public void Should_Convert_99_To_Text(){
        String result = converter.convert("99");
        Assertions.assertEquals("Ninety nine", result);
    }
}
