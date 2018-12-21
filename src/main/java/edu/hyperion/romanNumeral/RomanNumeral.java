package edu.hyperion.romanNumeral;

import java.util.Map;

class RomanNumeral {

    private Map<Character, Integer> romanNumeralsMap = Map.of('I', 1, 'V', 5, 'X', 10);

    int convert(String romanNumeral) {
        int result = 0;
        if (romanNumeral.length() < 1) {
            result = -1;
        } else {
            if (romanNumeral.length() == 1 && romanNumeralsMap.containsKey(romanNumeral.charAt(0))) {
                result = romanNumeralsMap.get(romanNumeral.charAt(0));
            } else {
                for (int i = 0; i < romanNumeral.length(); i++) {
                    if (i >= romanNumeral.length()){

                    }else {
                        if (romanNumeralsMap.get(i+1) >= romanNumeralsMap.get(romanNumeral.charAt(i))){
                            result -= romanNumeralsMap.get(romanNumeral.charAt(i));
                        }else
                            result += romanNumeralsMap.get(romanNumeral.charAt(i));

                    }
                }
            }

        }
        return result;
    }
}
