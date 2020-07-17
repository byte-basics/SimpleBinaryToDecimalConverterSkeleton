package com.bytebasics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class BinaryConverterTest {

    private String lowerBoundBin = "0";
    private String upperBoundBin = "1111111111111111";
    private BinaryConverter binConverter;

    @Before
    public void setUp() {
        binConverter = new BinaryConverter();
    }

    @Test
    public void testConvertBinary1() {
        String binaryOne = "1";
        String decimalOne = "1";
        assertEquals(decimalOne, binConverter.convertBinToDec(binaryOne));
    }

    @Test
    public void testConvertBinary2() {
        String binary2 = "10";
        String decimal2 = "2";
        assertEquals(decimal2, binConverter.convertBinToDec(binary2));
    }

    @Test
    public void testConvertBinary13() {
        String binary13 = "1101";
        String decimal13 = "13";
        assertEquals(decimal13, binConverter.convertBinToDec(binary13));
    }

    @Test
    public void testConvertToBinaryLowerBound() {
        String decimal0 = "0";
        assertEquals(decimal0, binConverter.convertBinToDec(lowerBoundBin));
    }

    @Test
    public void testUpperBound() {
        String decimal65535 = "65535";
        assertEquals(decimal65535, binConverter.convertBinToDec(upperBoundBin));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidBinaryInput() {
        String invalidString = "11a01";
        binConverter.convertBinToDec(invalidString);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidBinaryInputWithNumber() {
        String invalidString = "119601";
        binConverter.convertBinToDec(invalidString);
    }
}
