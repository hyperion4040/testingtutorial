package edu.hyperion.romanNumeral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @BeforeEach
    void setUp() {
        romanNumeral = new RomanNumeral();
    }


    @ParameterizedTest
    @CsvSource({"I, 1", "V, 5", "X, 10"})
    void testSingleNumeral(String romanNumerals, int arabicNumerals) {
        assertEquals(arabicNumerals, romanNumeral.convert(romanNumerals));
    }

    @ParameterizedTest
    @CsvSource({"II, 2", "VI, 6", "XIII, 13", "XV, 15"})
    void testSumationNumeral(String romanNumerals, int arabicNumerals) {
        assertEquals(arabicNumerals, romanNumeral.convert(romanNumerals));
    }

    @ParameterizedTest
    @CsvSource({"IV, 4", "IX, 9", "XIV, 14", "XIX, 19"})
    void testSubtractionNumeral(String romanNumerals, int arabicNumerals) {
        assertEquals(arabicNumerals, romanNumeral.convert(romanNumerals));
    }

}