package main.maciejkrolpl.codewars;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int base = 1;
        int result = 0;

        for (int i = binary.size()-1; i >=0 ; i--) {
            result += base * binary.get(i);
            base *= 2;
        }

        return result;
    }
}
